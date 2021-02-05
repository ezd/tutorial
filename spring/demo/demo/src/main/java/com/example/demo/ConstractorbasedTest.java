package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstractorbasedTest {
	
	@Autowired
	Greeting greetingOromo;
	
	@RequestMapping("/auto")
	public String getGreeting() {
		return greetingOromo.greeting();
	}

}
