package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingAmhara implements Greeting {
	
	public String greeting() {
	return "selam";
	}

}
