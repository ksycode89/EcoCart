package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.MorderMapper;
import com.cart.eco.material.service.ModerReqVO;
import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;
import com.cart.eco.material.service.ReDetailVO;
import com.cart.eco.material.service.ReceivingVO;

@Service
public class MorderServiceImpl implements MorderService {
	
	//발주
	
	@Autowired
	MorderMapper moMapper;
	
	
	
	@Override
	public int getOrderNo(MorderVO morderVO) {
		return morderVO.getOrderNo();
	}

	@Override
	public List<MorderVO> selectOrderList() {
		return moMapper.selectOrderList();
	}
	
	
	@Override
	public int insertOrder(ModerReqVO morderVO) {
		int result = 0;
		
		MorderVO reOrder = new MorderVO();
		int totalSum = 0;
		
		MorderVO moder = morderVO.getMorder();

		
		//마스터
		result = moMapper.insertOrder(moder);
		int orderNo = moder.getOrderNo();
		System.out.println("orderNo" +orderNo);
		
		//디테일 반복
		for(int i=0; i<morderVO.getDetailOrder().size(); i++) {
			MorderdetailVO deailVO = morderVO.getDetailOrder().get(i);
			//마스터용 합계
			totalSum +=deailVO.getSumPrice();
			deailVO.setOrderNo(orderNo);
			result += moMapper.insertOrder1(deailVO);
		}
		reOrder.setTotal(totalSum);
		reOrder.setOrderNo(orderNo);
		//수량++
		moMapper.updateNum(reOrder);
		
		return result;
	}
	
	

	@Override
	public String deleteOrder(List<MorderVO> morderVO) {
		int result = 0;
		String ab = "삭제가 실패했습니다.";
		for (int a=0; a<morderVO.size(); a++) {
			result += moMapper.deleteOrder(morderVO.get(a));
			
		}
		if(result == morderVO.size()) {
			ab = "삭제가 성공했습니다.";
			
		}
//		for ( MorderVO a : morderVO) {
//			moMapper.deleteOrder(a);
//		}
		
		
		return  ab;
	}
	
	
	
	//발주현황상세조회
	@Override
	public List<MorderdetailVO> detailList(MorderVO morderVO) {
		return moMapper.detailList(morderVO);
	}
	
	//발주등록목록 가져오기
	@Override
	public List<MorderVO> proInfo(MorderVO morderVO) {
		return moMapper.proInfo(morderVO);
	}
/////////////////////////////////////////
	//발주상태변경 (확정)
	@Override
	public int commitOrder(List<Integer> list) {
		int	result = 0;	
		for(int no : list) {
				MorderVO vo = new MorderVO();
				vo.setOrderNo(no);
				vo.setOrderGroup("og-co");
				result += moMapper.commitOrder(vo);
			}
		return result;
	}

	@Override
	public List<MorderVO> searchOrder(int orderNo) {
			
		return moMapper.searchOrder(orderNo);
	}

	@Override
	public ReceivingVO insertReceiving(ReceivingVO vo) {
		moMapper.insertReceiving(vo);
		return vo;
	}
//상세 
	@Override
	public int insertReceivingD(List<ReDetailVO> vo) {
		int result =0;
		int orderNo = vo.get(0).getOrderNo();
		
		 System.out.println("nono"+orderNo);
		 String receNo=moMapper.searchReNo(orderNo);
		 System.out.println("nono"+receNo);
	
		  for (ReDetailVO one : vo) { 
		  one.setReceivingCode(receNo);
		  System.out.println("insertReceivingD imple : "+one);
		  result +=  moMapper.insertReceivingD(one); 
		  
		  }
		if (vo.size() == result) {
			MorderVO reVo= new MorderVO();
			reVo.setOrderNo(orderNo);
			reVo.setOrderGroup("og-dn");
			moMapper.completeOrder(reVo);
		}
		return result;
	}
//공통코드로 발주 검색 
	@Override
	public List<MorderVO> getOrderGroup(String group) {
		
		return moMapper.getOrderGroup(group);
	}


}
