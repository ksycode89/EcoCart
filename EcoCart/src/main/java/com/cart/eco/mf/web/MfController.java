package com.cart.eco.mf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MfController {
	
	@GetMapping("/mfPlanList")
	public String mfPlanList(Model model) {
		return "manufacture/mfPlanList";
	}
	
	@GetMapping("/mfPlanManage")
	public String mfPlanManage(Model model) {
		return "manufacture/mfPlanManage";
	}
	
	@GetMapping("/mfOrderList")
	public String mfOrderList(Model model) {
		return "manufacture/mfOrderList";
	}
	
	@GetMapping("/mfOrderDecide")
	public String mfOrderDecide(Model model) {
		return "manufacture/mfOrderDecide";
	}
	
	@GetMapping("/mfOrderRegist")
	public String mfOrderRegist(Model model) {
		return "manufacture/mfOrderRegist";
	}
	
	@GetMapping("/mfMaking")
	public String mfMaking(Model model) {
		return "manufacture/mfMaking";
	}
	
	
	
}
