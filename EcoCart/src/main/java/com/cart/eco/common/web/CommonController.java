package com.cart.eco.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("layout")
public class CommonController {
	
	@GetMapping("/login")
	public String loginForm() {
		
		return "common/login.html";
	}
	
	
	
}
