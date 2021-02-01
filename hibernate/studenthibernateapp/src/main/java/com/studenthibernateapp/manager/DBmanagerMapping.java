package com.studenthibernateapp.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.studenthibernateapp.entities.Address;
import com.studenthibernateapp.entities.Department;
import com.studenthibernateapp.entities.Project;
import com.studenthibernateapp.entities.Student;

public class DBmanagerMapping {
	
	public static void main(String[] args) {

//		onetoonesave();
//		onetoonefetch();
//		onetooneupdate();
//		onetoonedeleteparent();
//		onetoonedeletechiled();
//		onetomanysave();
//		onetomanyfetch();
		manytomanysave();
		

		
	}
	
	private static void manytomanysave() {
//    	
    	Session session = getSession();

    	Transaction transaction = session.beginTransaction();
//		//save-1
    	
    	Student student1= new Student();
    	student1.setFirstname("Jemberu");
    	student1.setLastname("Mola");
    	
    	
    	Student student2= new Student();
    	student2.setFirstname("Tesema");
    	student2.setLastname("Alemayew");
    	
    	Student student3= new Student();
    	student3.setFirstname("Naser");
    	student3.setLastname("Ahmed");


    	//---this approach it will insert a reference---
   
    	Project project1 = new Project();
    	project1.setTitle("Hospital system");
    	
    	Project project2 = new Project();
    	project2.setTitle("Customer management system");
    	
    	student1.getProjects().add(project1);
    	project1.getStudents().add(student1);
    	
    	student1.getProjects().add(project2);
    	project2.getStudents().add(student1);
    	
    	
    	student2.getProjects().add(project2);
    	project2.getStudents().add(student2);

    	
    	

    	session.save(student3);
    	session.save(student1);
    	session.save(student2);
    	session.save(project1);
    	session.save(project2);
		
		
    	transaction.commit();
    	session.close();
		
	}
	private static void onetomanysave() {
//    	
    	Session session = getSession();

    	Transaction transaction = session.beginTransaction();
//		//save-1
    	
    	Student student= new Student();
    	student.setFirstname("Jemberu");
    	student.setLastname("Mola");
    	
    	
    	Student student2= new Student();
    	student2.setFirstname("Tesema");
    	student2.setLastname("Alemayew");
    	
    	
    	Department department=new Department();
    	department.setName("Chemistry");

    	//---this approach it will insert a reference---
    	
    	session.save(department);
    	
    	student.setDepartment(department);
    	session.save(student);
    	
    	student2.setDepartment(department);
    	session.save(student2);
    	
    	session.save(student);
		
		
    	transaction.commit();
    	session.close();
		
	}
	
	private static void onetomanyfetch() {
		Session session = getSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Department department = session.get(Department.class, 1);
    	System.out.println("Name:"+department.getName());
    	System.out.println("Students in department:"+department.getName());
    	System.out.println("Name:"+department.getStudents().get(0).getFirstname());
    	for(Student student:department.getStudents()) {
    		System.out.println("Name:"+student.getFirstname());
    	}
    	
    	transaction.commit();
    	session.close();
		
	}
	private static void onetoonedeletechiled() {
		Session session = getSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Address address = session.get(Address.class, 3);
    	
    	session.delete(address);
    	
    	transaction.commit();
    	session.close();
		
	}
	
	private static void onetoonedeleteparent() {
		Session session = getSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Student student = session.get(Student.class, 7);
    	
    	session.delete(student);
    	
    	transaction.commit();
    	session.close();
		
	}

	
	private static void onetooneupdate() {
		Session session = getSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Student student = session.get(Student.class, 8);
    	Address newaddress= new Address();
    	newaddress.setCity("Arbamich");
    	session.save(newaddress);
    	student.setAddress(newaddress);
    	
    	transaction.commit();
    	session.close();
		
	}

	private static void onetoonefetch() {
		Session session = getSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Student student = session.get(Student.class, 5);
    	System.out.println("Name:"+student.getFirstname());
    	System.out.println("Address:"+student.getAddress().getCity());
    	
    	transaction.commit();
    	session.close();
		
	}



	private static void onetoonesave() {
//    	
    	Session session = getSession();

    	Transaction transaction = session.beginTransaction();
//		//save-1
    	Student student= new Student();
    	student.setFirstname("Alemu2");
    	student.setLastname("Kebede2");
    	Address address = new Address();
    	address.setCity("Addiss Ababa2");
    	address.setSubcity("Addis ketema2");
    	student.setAddress(address);
    	
    	session.save(address);
    	
    	session.save(student);
		
		
    	transaction.commit();
    	session.close();
		
	}



	private static Session getSession() {
		Configuration cnfg= new Configuration();
    	cnfg.configure("hibernate.cfg.xml");
		//session
    	Session session = cnfg.buildSessionFactory().openSession();
		return session;
	}

}
