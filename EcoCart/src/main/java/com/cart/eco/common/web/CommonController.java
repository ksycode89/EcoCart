package com.cart.eco.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	// 공통코드이동.
	@GetMapping("/coCode")
	public String moveCoCode() {
		
		return "common/coCode.html";
	}
	
}
