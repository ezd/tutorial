package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //it contains component scan, auto configuration
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
//		bean option - 1
//		Calculator calculator =(Calculator)applicationContext.getBean("calculator");
//		int sum = calculator.add(3, 5);
//		System.out.println("sum of 3 and 5 is"+sum);
		

	}
	

}
