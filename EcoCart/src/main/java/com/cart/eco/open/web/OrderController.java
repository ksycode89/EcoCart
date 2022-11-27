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
import com.cart.eco.open.service.OrderDVO;
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
	
	
	
	//주문번호 가져오기
	@GetMapping("/getOrderCode")
	@ResponseBody
	public List<OrdersVO> getOrderCode(OrdersVO vo) {
			
		System.out.println("------------------------");
		orderService.getOrderCode();
			
		System.out.println(vo.getOrderCode());
			
			
		return orderService.getOrderCode();
			
		}
	
	//주문서 insert
	@PostMapping("/insertOrder")
	@ResponseBody
	public OrdersVO insertOrder (@RequestBody OrdersVO vo) {
		
		orderService.insertOrder(vo);
		System.out.println(  vo );
		return vo;
		
	}
	
	//주문서 상세 insert
	@PostMapping("/insertOrderD")
	@ResponseBody
	public int insertOrderD(@RequestBody List<OrderDVO> vo ) {
	
		
		return orderService.insertOrderD(vo);
	}
	
	//주문 등록시 견적서 승인으로 업데이트
	//견적서 상태 update
		@PostMapping("/updateEstmtSt")
		@ResponseBody
		public int updateEstmtSt (@RequestBody List<EstimateVO> vo) {
			
			return orderService.updateEstmtSt(vo); 
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
	

	//주문마감 상태 변경
	@PostMapping("/updateOrderCanSt")
	@ResponseBody
	public int updateOrderCanSt (@RequestBody List<OrdersVO> vo) {
			
		return orderService.updateOrderCanSt(vo);
	}
	
	//주문마감 상태 변경
	@PostMapping("/updateCanNum")
	@ResponseBody
	public int updateCanNum (@RequestBody List<OrderDVO> vo) {
			
		return orderService.updateCanNum(vo);
	}
		
	
}
