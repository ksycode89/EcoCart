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
	public int insertOrder(MorderVO morderVO) {
		return moMapper.insertOrder(morderVO);
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
