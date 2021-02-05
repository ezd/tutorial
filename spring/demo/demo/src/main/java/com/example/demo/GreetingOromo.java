package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingOromo implements Greeting {
	public String greeting() {
		return "Akam";
	}

}
