package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowireTester {
	
	private final Greeting greeting;

	public AutowireTester (Greeting greetingOromo){
		this.greeting=greetingOromo;	
	}
	
	@RequestMapping("/const")
	public String getGreeting() {
		
		return this.greeting.greeting();
	}

}
