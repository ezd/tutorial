package com.studenthibernateapp.entities;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.loader.plan.exec.internal.OneToManyLoadQueryDetails;

public class DBManagerMapping {

	
	public static void main(String[] args) {
//		onetoonesave();
//		onetomanysave();
//		manytomanysave();
//		onetonefetch();
//		onetooneupdate();
//		onetoonedelete();
//		onetomanyfetch();
//		onetomanydelete();
//		manytomanyfetch();
//		manytomanyupdate();
		mantomanydelete();
		
	}

	
	private static void mantomanydelete() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Project project=session.get(Project.class, 1);
		for(Student studen:project.getStudents()) {
			studen.getProjects().remove(project);
		}
		session.delete(project);
		transaction.commit();
		session.close();
		
	}


	private static void manytomanyupdate() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Project project=new Project();
		project.setTitle("Test title");
		
		session.save(project);
		
		Student exisitintstudent= session.get(Student.class, 3);
		exisitintstudent.getProjects().add(project);
		transaction.commit();
		session.close();
		
	}


	private static void manytomanyfetch() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();

		Student exisitintstudent= session.get(Student.class, 2);
		
		System.out.println("Student name:"+exisitintstudent.getName());
		
		for(Project project:exisitintstudent.getProjects()) {
			System.out.println("Project title:"+project.getTitle());
		}
		
		transaction.commit();
		session.close();
	}


	private static void onetomanydelete() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		Department departmenttodelete= session.get(Department.class, 1);
		session.delete(departmenttodelete);
		
		transaction.commit();
		session.close();
		
	}


	private static void onetomanyfetch() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		Student newstudent=new Student();
		newstudent.setName("Alemnesh");
		session.save(newstudent);
		
		Department department=session.get(Department.class, 1);
		department.getStudents().add(newstudent);
		
		System.out.println("Name:"+department.getName());
		System.out.println("Students in department:"+department.getName()+" is "+department.getStudents().size());
		
		for(Student student:department.getStudents()) {
			System.out.println("Student name:"+student.getName());
		}
		
		transaction.commit();
		session.close();
	}


	private static void onetoonedelete() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student=session.get(Student.class, 1);
		session.delete(student);
		transaction.commit();
		session.close();
		
	}


	private static void onetooneupdate() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student=session.get(Student.class, 6);
		Address address = new Address();
		address.setCity("Addis Ababa");
		address.setSubcity("Kolfe");
		
		session.save(address);
		student.setAddress(address);
		
		transaction.commit();
		session.close();
		
	}


	private static void onetonefetch() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		Student student= session.get(Student.class, 5);
		System.out.println("Neme:"+student.getName());
		System.out.println("Address:"+student.getAddress().getSubcity());
		
		transaction.commit();
		session.close();
		
	}


	





	private static void manytomanysave() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student1=new Student();
		student1.setName("Tesema");
		
		Student student2=new Student();
		student2.setName("Lema");
		
		Student student3=new Student();
		student3.setName("Lemlem");
		
		
		Project project1=new Project();
		project1.setTitle("Hospital managemen system");
		
		Project project2=new Project();
		project2.setTitle("Customer managemen system");
		
		student1.getProjects().add(project1);
		project1.getStudents().add(student1);
		
		student1.getProjects().add(project2);
		project2.getStudents().add(student1);
		
		student2.getProjects().add(project2);
		project2.getStudents().add(student2);
		
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		session.save(project1);
		session.save(project2);
		
		
		
		
		transaction.commit();
		session.close();
		
	}


	private static void onetomanysave() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student=new Student();
		student.setName("Jemal");
		
		Department department=new Department();
		department.setName("Computer science");
		
		student.setDepartment(department);
		
		session.save(department);
		session.save(student);
		
		
		transaction.commit();
		session.close();
		
	}


	static void onetoonesave() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address();
		address.setCity("Addis Ababa");
		address.setSubcity("Kolfe");
		
		Student student=new Student();
		student.setName("Kemal");
		student.setAddress(address);
		session.save(address);
		session.save(student);
		
		transaction.commit();
		session.close();
		
	}
	
	static Session getSession(){
		Configuration cnfg= new Configuration();
		cnfg.configure("hibernate.cfg.xml");
		
		Session session = cnfg.buildSessionFactory().openSession();
		return session;
	}
}
