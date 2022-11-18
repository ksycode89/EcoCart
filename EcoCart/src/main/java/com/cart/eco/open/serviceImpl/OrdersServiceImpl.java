package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.mapper.OrdersMapper;
import com.cart.eco.open.service.OrdersService;
import com.cart.eco.open.service.OrdersVO;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrdersMapper mapper;
	
	@Override
	public List<OrdersVO> OrdersList() {
		// TODO Auto-generated method stub
		return mapper.OrdersList();
	}

	@Override
	public List<Map<String, Object>> OrdersDList(String orderCode) {
		// TODO Auto-generated method stub
		return mapper.OrdersDList(orderCode);
	}

	@Override
	public List<ProductVO> proList() {
		// TODO Auto-generated method stub
		return mapper.proList();
	}

	@Override
	public List<Map<String, Object>> OrdersCanDList(String orderCode) {
		// TODO Auto-generated method stub
		return mapper.OrdersCanDList(orderCode);	
	
	}



}
