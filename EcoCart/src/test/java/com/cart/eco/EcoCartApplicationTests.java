package com.cart.eco;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class EcoCartApplicationTests {
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	
	@Test
	void contextLoads() {
		String password ="1";
		String encryptPassword = passwordEncoder.encode(password);
		System.out.println(encryptPassword);
	}

}
