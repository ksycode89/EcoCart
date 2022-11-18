package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ProductVO;

public interface OrdersService {
	
	//주문서 조회
	public List<OrdersVO> OrdersList();
	
	
	//주문서 상세 조회
	public List<Map<String, Object>> OrdersDList(String orderCode);
	
	//제품코드 조회
	public List<ProductVO> proList();
	
	
	//주문 마감 상세 조회
	public List<Map<String,Object>> OrdersCanDList(String orderCode);

}
