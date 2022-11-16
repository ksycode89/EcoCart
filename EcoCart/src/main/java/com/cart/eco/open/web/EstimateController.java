package com.cart.eco.open.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cart.eco.open.service.EstimateService;
import com.cart.eco.open.service.EstimateVO;


@Controller
public class EstimateController {
	
	@Autowired
	EstimateService estimateService;
	
	//견적 페이지 보여주는거
	@GetMapping("/estimate")
	public String Estimate(EstimateVO vo) {
		
		return "open/estimate";
	}
	
	//견적 조회 페이지 보여주는거
	@GetMapping("/listEstimate")
	@ResponseBody
	public List<EstimateVO> listEstimate(){
		
		return estimateService.selectEstimateList();
		
	}
	
	
	
	
	
//	//주문
//	@GetMapping("/order")
//	public String Order() {
//		return "open/order";
//	}
//	
//	//주문마감
//	@GetMapping("/orderCan")
//	public String OrderCan() {
//		return "open/orderCan";
//	}
//	
//	//출고요청1
//	@GetMapping("/deliveryQ")
//	public String deliveryQ() {
//		return "open/deliveryQ";
//	}
//	
//	//출고등록2
//	@GetMapping("/deliveryG")
//	public String deliveryG() {
//		return "open/deliveryG";
//	}
//	
//	//출고처리3
//	@GetMapping("/deliveryPro")
//	public String deliveryPro() {
//		return "open/deliveryPro";
//	}
//	
//	//재고/bom현황
//	@GetMapping("/proBom")
//	public String proBom() {
//		return "open/proBom";
//	}
//
//	//배송정보
//	@GetMapping("/deliveryInfo")
//	public String deliveryInfo() {
//		return "open/deliveryInfo";
//	}
	
	
	
	
}
