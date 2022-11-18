package com.cart.eco.material.service;

import java.util.List;

public interface OrderService {

	//입고 현황
	public List<OrderCheckVO> selectOrList(OrderCheckVO ordervo);
	
	//입고상세현황
	public List<OrderChDetailVO> dataList(OrderCheckVO ordervo);
	
	//입고 검사
	
	
	//입고처리
	
}
