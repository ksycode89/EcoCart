package com.cart.eco.open.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.service.OrdersService;
import com.cart.eco.open.service.OrdersVO;

@Controller
public class OrderController {
	
	@Autowired
	OrdersService orderService;
	
	//주문
	@GetMapping("/order")
	public String Order() {
		return "open/order";
	}
	
	
	//전체조회
	@GetMapping("listOrders")
	@ResponseBody
	public List<OrdersVO> listOrders(OrdersVO vo){
		
		return orderService.OrdersList();
	}
	
	
	
	//tr누르면 상세 조회
	@GetMapping("/listOrderd")
	@ResponseBody
	public List<Map<String,Object>> listOrdersD(String orderCode){
		
		return orderService.OrdersDList(orderCode);
				
	}
	
	//제품조회 
	@GetMapping("/proList")
	@ResponseBody
	public List<ProductVO> proList(ProductVO vo){
		return orderService.proList();
		
	}
	
	
	//주문마감
	@GetMapping("/orderCan")
	public String OrderCan() {
		return "open/orderCan";
	}
	
	
	
	//주문 마감 전체 조회
	@GetMapping("/listorderCan")
	@ResponseBody
	public List<OrdersVO> listOrderCan(OrdersVO vo){
		
		return orderService.OrdersList();
		
	}
	
	
	//주문 마감 tr조회
	@GetMapping("/listOrderCanD")
	@ResponseBody
	public List<Map<String,Object>> listOrderCanD(String orderCode){
		
		return orderService.OrdersCanDList(orderCode);
				
	}
	
}
