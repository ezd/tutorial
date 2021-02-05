package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping("/student")
	public Student getall() {
		return studentDAO.save(new Student("Kebede"));
	}

	@PostMapping("/student")
	public Student save(Student student) {
		return studentDAO.save(student);
	}
	
	@PutMapping("/student/{id}")
	public Student update(Student student) {
		return studentDAO.save(student);
	}
}
