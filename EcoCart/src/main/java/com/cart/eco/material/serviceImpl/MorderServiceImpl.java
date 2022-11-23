package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.MorderMapper;
import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;

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
	public int insertOrder(List<MorderVO> morderVO) {
		int result = 0;
		System.out.println("inner imple"+morderVO.get(0));
		result = moMapper.insertOrder(morderVO.get(0));
		return result;
	}
	
	@Override
	public int insertOrder1(List<MorderVO> morderVO) {
		int result = 0;
		for(int i=0; i<morderVO.size(); i++) {
			result += moMapper.insertOrder1(morderVO.get(i));
		}
		return result;
	}

	@Override
	public int deleteOrder(MorderVO morderVO) {
		return moMapper.deleteOrder(morderVO);
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


}
