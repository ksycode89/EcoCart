package com.cart.eco.material.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaterialController {
	
	@GetMapping("/materialList")
	public String materialList() {
		return "material/materialList";
	}
	
	@GetMapping("/materialinsert")
	public String materialInsert() {
		return "material/materialinsert";
	}
	
	@GetMapping("/materialreta")
	public String materialReta() {
		return "material/materialreta";
	}
	
	@GetMapping("/Wearingtest")
	public String WearingTest() {
		return "material/Wearingtest";
	}
	@GetMapping("/Wearingprocess")
	public String WearingProcess() {
		return "material/Wearingprocess";
	}
	@GetMapping("/WearingList")
	public String WearingList() {
		return "material/WearingList";
	}
	@GetMapping("/release")
	public String Release() {
		return "material/release";
	}
}
