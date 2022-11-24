package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.mapper.OrdersMapper;
import com.cart.eco.open.service.EstimateVO;
import com.cart.eco.open.service.OrderDVO;
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
	
	
	@Override
	public List<EstimateVO> selectEstmtCode() {
		// TODO Auto-generated method stub
		return mapper.selectEstmtCode();
	}

	@Override
	public List<EstimateVO> MestmtList(String estmtCode) {
		// TODO Auto-generated method stub
		return mapper.MestmtList(estmtCode);
	}

	@Override
	public List<Map<String,Object>> MestmtListD(String estmtCode) {
		// TODO Auto-generated method stub
		return mapper.MestmtListD(estmtCode);
	}

	@Override
	public List<OrdersVO> OrdersCanList() {
		// TODO Auto-generated method stub
		return mapper.OrdersCanList();
	}

	@Override
	public String insertOrder(OrdersVO vo) {
		// TODO Auto-generated method stub
		return String.valueOf( mapper.insertOrder(vo) );
	}

	@Override
	public int insertOrderD(List<OrderDVO> vo) {
		// TODO Auto-generated method stub
		return mapper.insertOrderD(vo);
	}

	@Override
	public int updateOrderSt(List<OrdersVO> vo) {
		
		int result = 0;
		for(int i = 0; i < vo.size(); i++ ) {
			result += mapper.updateOrderSt(vo.get(i));
		}
		
		
		return result;
	}
	
	@Override
	public int updateOrderCanSt(List<OrdersVO> vo) {
		
		int result = 0;
		for(int i = 0; i < vo.size(); i++ ) {
			result += mapper.updateOrderCanSt(vo.get(i));
		}
		
		
		return result;
	}



}
