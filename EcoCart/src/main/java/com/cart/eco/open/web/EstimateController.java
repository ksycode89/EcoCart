package com.cart.eco.open.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EstimateController {
	
	//견적
	@GetMapping("/estimate")
	public String EstimateList() {
		return "open/estimate";
	}
	
	//주문
	@GetMapping("/order")
	public String Order() {
		return "open/order";
	}
	
	//주문마감
	@GetMapping("/orderCan")
	public String OrderCan() {
		return "open/orderCan";
	}
	
	//출고요청1
	@GetMapping("/deliveryQ")
	public String deliveryQ() {
		return "open/deliveryQ";
	}
	
	//출고등록2
	@GetMapping("/deliveryG")
	public String deliveryG() {
		return "open/deliveryG";
	}
	
	//출고처리3
	@GetMapping("/deliveryPro")
	public String deliveryPro() {
		return "open/deliveryPro";
	}
	
	//재고/bom현황
	@GetMapping("/proBom")
	public String proBom() {
		return "open/proBom";
	}

	//배송정보
	@GetMapping("/deliveryInfo")
	public String deliveryInfo() {
		return "open/deliveryInfo";
	}
	
	
	
	
}
