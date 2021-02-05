package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPATest {
	
	@GetMapping("/jpatest")
	public String test() {
		return "testing";
	}

}
