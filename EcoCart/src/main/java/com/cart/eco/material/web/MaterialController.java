package com.cart.eco.material.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaterialController {
	
	@GetMapping("/materialList")
	public String materialList() {
		return "material/materialList";
	}
}
