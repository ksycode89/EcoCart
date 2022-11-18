package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.open.mapper.DeliveryQMapper;
import com.cart.eco.open.service.DeliveryGVO;
import com.cart.eco.open.service.DeliveryProVO;
import com.cart.eco.open.service.DeliveryQService;
import com.cart.eco.open.service.DeliveryQVO;

@Service
public class DeliveryQServiceImpl implements DeliveryQService{
	
	@Autowired
	DeliveryQMapper mapper;

	//출고요청	Q
	
	@Override
	public List<DeliveryQVO> DeliveryQList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryQList();
	}

	@Override
	public List<Map<String, Object>> DeliveryQDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryQDList(dlivyCode);
	}

	
	

	
	
	
	////////////////////////////////////////////////////////////////////////
	
	//출고등록 G
	
	@Override
	public List<DeliveryGVO> DeliveryGList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryGList();
	}
	
	@Override
	public List<Map<String, Object>> DeliveryGDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryGDList(dlivyCode);
	}

	
	
	//////////////////////////////////////////////////////////////////////////
	
	//출고처리 Pro
	
	@Override
	public List<DeliveryProVO> DeliveryPList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryPList();
	}

	@Override
	public List<Map<String, Object>> DeliveryPDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryPDList(dlivyCode);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	//배송 정보 조회
	
	@Override
	public List<DeliveryProVO> DeliveryInfoList() {
		
		return mapper.DeliveryInfoList();
	};	
	
	
	
}

