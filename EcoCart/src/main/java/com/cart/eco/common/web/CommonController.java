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
		
		return "common/employees";
	}
	// 공통코드이동.
	@GetMapping("/coCode")
	public String moveCoCode() {
		
		return "common/coCode.html";
	}
	
	// 거래처 등록 페이지.
	@GetMapping("/client")
	public String clientForm() {
		
		return "common/client.html";
	}
	
	// 검사총괄관리 페이지.
	@GetMapping("/totalCheck")
	public String totalCheckForm() {
		
		return "common/totalCheck.html";
	}
	
	// 물품등록 페이지.
	@GetMapping("/product")
	public String productForm() {
		
		return "common/product";
	}
}
