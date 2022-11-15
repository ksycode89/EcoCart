package com.cart.eco.mf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MfController {
	
	@GetMapping("/mfPlanList")
	public String mfPlanList() {
		return "manufacture/mfPlanList";
	}
	
	@GetMapping("/mfPlanManage")
	public String mfPlanManage() {
		return "manufacture/mfPlanManage";
	}
	
}
