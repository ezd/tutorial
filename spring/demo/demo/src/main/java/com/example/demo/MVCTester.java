package com.example.demo;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MVCTester {
	
	@Autowired
	MockDAO mockDAO;
	
	@GetMapping("/authenticate/{id}/user")
	public String getTest(@PathVariable("id") String id, 
			@RequestParam("username") String username, 
			@RequestParam("password") String password) {
			boolean isSaved=mockDAO.isVerified(username, password);
		return "isSaved"+isSaved;
	}
	
	@PostMapping("/user")
	public String postTest(@RequestBody() User user
) {
		User saveduser=mockDAO.save(user);
		return "Saved user:"+saveduser.getUsername()+", password:"+saveduser.getPassword();
	}

	@PutMapping("/user/{id}")
	public String putTest(@PathVariable("id") String id,
			@RequestBody() User user
) {
		User updateduser=mockDAO.update(id, user);
		return "Updated user: Id:"+updateduser.getId()
		+", username:"+updateduser.getUsername()
		+", password:"+updateduser.getPassword();
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteuser(@PathVariable("id") String id)
	{
		boolean isDeleted=mockDAO.isDeleted(id);
		return "is deleted:" + isDeleted;
	}

}
