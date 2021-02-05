package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
public class StudentDAO {
	
	@PersistenceContext
	private EntityManager entityManger;

	@Transactional
	public Student save(Student student) {
		entityManger.persist(student);
		return student;
	}

	@Transactional
	public Student update(Student student) {
		entityManger.merge(student);
		return student;
	}

	@Transactional
	public Student delete(Student student) {
		if (entityManger.contains(student)) {
			entityManger.remove(student);
		} else {
			entityManger.remove(entityManger.merge(student));
		}

		return student;
	}

	@Transactional
	public Student get(int id) {
		Student response = (Student) entityManger.find(Student.class, id);
		return response;
	}

}
