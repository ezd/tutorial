package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MockDAO {
	
	boolean isVerified(String username, String password) {
		return true;
	}
	
	User save(User user) {
		return user;
	}
	
	User update(String id, User user) {
		return user;
	}

	public boolean isDeleted(String id) {
		return true;
	}

}
