package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.OrderCHMapper;
import com.cart.eco.material.service.OrderChDetailVO;
import com.cart.eco.material.service.OrderCheckVO;
import com.cart.eco.material.service.OrderService;

@Service
public class OrderChServiceImpl implements OrderService{
	
	@Autowired
	OrderCHMapper omapper;
	
	//입고
	
	@Override
	public List<OrderCheckVO> selectOrList(OrderCheckVO ordervo) {
		// TODO Auto-generated method stub
		return omapper.selectOrList(ordervo);
	}

	@Override
	public List<OrderChDetailVO> dataList(OrderCheckVO ordervo) {
		// TODO Auto-generated method stub
		return omapper.dataList(ordervo);
	}

}
