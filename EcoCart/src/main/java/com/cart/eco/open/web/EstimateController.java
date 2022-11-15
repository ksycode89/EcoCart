package com.cart.eco.open.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EstimateController {
	
	
	@GetMapping("/estimate")
	public String EstimateList() {
		return "open/estimate";
	}
	
	@GetMapping("/order")
	public String OrderList() {
		return "open/order";
	}
	
	
	
}
