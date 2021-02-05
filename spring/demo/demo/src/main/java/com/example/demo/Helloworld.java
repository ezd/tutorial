package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
//	bean option - 2

	@Bean
	CalculatorB calculatorb() {
		return new CalculatorB();
	}
	
	@Autowired
	CalculatorB calculatorb;
	
	@RequestMapping("/beantest")
	public String beantest() {
		return ""+calculatorb.add(3, 5);
	}

}
