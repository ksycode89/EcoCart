package com.cart.eco;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@MapperScan(basePackages = "com.cart.eco.**.mapper")
public class EcoCartApplication {
	
	public static final Logger log = LoggerFactory.getLogger(EcoCartApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EcoCartApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
			
		return "layout/index.html";
	}

}
