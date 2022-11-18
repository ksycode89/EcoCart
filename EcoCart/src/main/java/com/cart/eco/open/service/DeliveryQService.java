package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;



public interface DeliveryQService {
	
	//출고 요청1
	
	//출고요청1 조회
	public List<DeliveryQVO> DeliveryQList();
	
	//출고요청1 상세 조회
	public List<Map<String,Object>> DeliveryQDList(String dlivyCode);
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////
	
	//출고 등록2
	
	//출고등록2 조회
	public List<DeliveryGVO> DeliveryGList();
	
	//출고등록2 상세 조회
	public List<Map<String,Object>> DeliveryGDList(String dlivyCode);
	
	
	
	
	////////////////////////////////////////////////////////////////////////////
	
	//출고 처리3
	
	//출고처리 조회
	public List<DeliveryProVO> DeliveryPList();
	
	//출고처리 상세 조회
	public List<Map<String,Object>> DeliveryPDList(String dlivyCode);

	
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	//배송 정보 조회
	
	public List<DeliveryProVO> DeliveryInfoList();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
