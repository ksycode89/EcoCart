package com.cart.eco.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller()
public class CommonController {
	
	@GetMapping("/login")
	public String loginForm() {
		
		return "common/login.html";
	}
	@GetMapping("/test")
	public String test01() {
		
		return "common/toasttest.html";
	}
	
	// 사원관리 페이지.
	@GetMapping("/empList")
	public String empForm() {
		
		return "common/employees.html";
	}
	
}
