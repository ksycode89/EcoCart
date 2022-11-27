package com.cart.eco.material.mapper;

import java.util.List;

import com.cart.eco.material.service.OrderChDetailVO;
import com.cart.eco.material.service.OrderCheckVO;

public interface OrderCHMapper {
	
	//입고 현황
		public List<OrderCheckVO> selectOrList(OrderCheckVO ordervo);
		
		//입고상세현황
		public List<OrderChDetailVO> dataList(OrderCheckVO ordervo);
		
		//입고 검사
		
		
		//입고처리
}
