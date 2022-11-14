package com.cart.eco.open.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cart.eco.open.service.EstimateService;

@Controller
public class EstimateController {
	
	//견적서 조회(승인X)
	@GetMapping("/list")
	public String selectEstimateList() {
		return "open/estimate";
	}
	
	//견적 번호 가져오기

	
	
	//견적서 등록	
}
