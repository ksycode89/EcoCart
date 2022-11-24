package com.cart.eco.open.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.service.EstimateVO;
import com.cart.eco.open.service.OrdersService;
import com.cart.eco.open.service.OrdersVO;

@Controller
public class OrderController {
	
	@Autowired
	OrdersService orderService;
	
	//주문
	@GetMapping("/order")
	public String Order(Model model) {
		//셀렉트 옵션에 견적 코드 가져오기
		model.addAttribute("estmtCode1",orderService.selectEstmtCode());
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
	
	//
	
	//모달창 승인 견적서 조회
	@GetMapping("/MestmtList")
	@ResponseBody
	public List<EstimateVO> MestmtList(String estmtCode){
		
		return orderService.MestmtList(estmtCode);
	}
	
	//모달창 승인 상세 견적서 조회
	@GetMapping("/MestmtListD")
	@ResponseBody
	public List<Map<String,Object>> MestmtListD(String estmtCode){
		
		return orderService.MestmtListD(estmtCode);
	}
	
	
	//주문서 insert
	@PostMapping("/insertOrder")
	@ResponseBody
	public OrdersVO insertOrder (@RequestBody List<OrdersVO> vo) {
		
		OrdersVO a = vo.get(0);
		orderService.insertOrder(a);
		System.out.println(  vo.get(0)  );
		return a;
		
	}
	
	//주문서 상태 변경
	@PostMapping("/updateOrderSt")
	@ResponseBody
	public int updateOrderSt (@RequestBody List<OrdersVO> vo) {
		
		return orderService.updateOrderSt(vo);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//주문마감
	@GetMapping("/orderCan")
	public String OrderCan() {
		return "open/orderCan";
	}
	
	
	
	//주문 마감 전체 조회
	@GetMapping("/listorderCan")
	@ResponseBody
	public List<OrdersVO> listOrderCan(OrdersVO vo){
		
		return orderService.OrdersCanList();
		
	}
	
	
	//주문 마감 tr조회
	@GetMapping("/listOrderCanD")
	@ResponseBody
	public List<Map<String,Object>> listOrderCanD(String orderCode){
		
		return orderService.OrdersCanDList(orderCode);
				
	}
	
	
	//주문마감 상태 변경
	@PostMapping("/updateOrderCanSt")
	@ResponseBody
	public int updateOrderCanSt (@RequestBody List<OrdersVO> vo) {
			
		return orderService.updateOrderCanSt(vo);
	}
		
	
}
