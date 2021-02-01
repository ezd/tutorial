package com.studenthibernateapp.manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.studenthibernateapp.entities.Student;

public class DBmanager {
	
	public static void main(String[] args) {
//		//--cofigure
		Configuration cnfg= new Configuration();
    	cnfg.configure("hibernate.cfg.xml");
//		
//		//--session
//    	
    	Session session = cnfg.buildSessionFactory().openSession();
//
//		
//		//--transaction
//    	
    	Transaction transaction = session.beginTransaction();
//		//save-1
//    	Student student= new Student();
//    	student.setFirstname("selam");
//    	student.setLastname("Kebede");
//    	
//    	session.save(student);
//		
//		//--transcation comit
//    	transaction.commit();
//		
//		//--session close
//    	session.close();
//		
//		//save
//    	Student student= new Student();
//    	student.setFirstname("Alemu");
//    	student.setLastname("Kebede");
//    	
//    	session.save(student);
//		
//		//--transcation comit
//    	transaction.commit();
//		
//		//--session close
//    	session.close();
		
		//--insert--
//    	Student student= new Student();
//    	student.setFirstname("Jemal");
//    	student.setLastname("Ahmed");
//    	save(student);
		
		//--select all--
//		List<Student> students=getStudents();
//		for(Student student:students) {
//			System.out.println("ID:"+student.getId());
//			System.out.println("First Name:"+student.getFirstname());
//			System.out.println("Last Name:"+student.getLastname());
//			
//		}
		
		//--select one--
//		Student student = findStudent(8);
//		System.out.println("Name:"+student.getFirstname());
    	
    	//--update-1--
//    	Student student2update = session.get(Student.class, 9);
//    	student2update.setFirstname("Alemitu");
//		
//		//--transcation comit
//    	transaction.commit();
//		
//		//--session close
//    	session.close();
		
		//--update-2--
//		System.out.println("before update");
//		Student student = findStudent(8);
//		System.out.println("Name:"+student.getFirstname());
//    	Student student2update= new Student();
//    	student2update.setId(8);
//    	student2update.setFirstname("Kemal");
//    	updateStudent(student2update);
//		
//		System.out.println("after update");
//		Student student2 = findStudent(8);
//		System.out.println("Name:"+student2.getFirstname());
		
		//--delete--
//		List<Student> students=getStudents();
//		for(Student student:students) {
//			System.out.println("ID:"+student.getId());
//			System.out.println("First Name:"+student.getFirstname());
//			System.out.println("Last Name:"+student.getLastname());
//			
//		}
//		System.out.println("before delet");
//		
//		delete(8);
//		
//		
//		System.out.println("after delete");
//		List<Student> students2=getStudents();
//		for(Student student:students2) {
//			System.out.println("ID:"+student.getId());
//			System.out.println("First Name:"+student.getFirstname());
//			System.out.println("Last Name:"+student.getLastname());
//			
//		}
		
		
	}

	private static void delete(int id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("DELETE FROM Student WHERE id=:id");
		query.setParameter("id", id);
		int executeUpdate = query.executeUpdate();
		if(executeUpdate>0) {
			System.out.println("Deleted");
		}
		
		transaction.commit();
		session.close();
		
	}

	private static Student findStudent(int id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student = (Student) session.createQuery("FROM Student WHERE id="+id).getSingleResult();
//		Student student = (Student) session.createQuery("FROM Student WHERE id="+id).list().get(0);
		
		transaction.commit();
		session.close();
		return student;
	}

	private static void updateStudent(Student studenttoupdate) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student student = (Student) session.createQuery("FROM Student WHERE id="+studenttoupdate.getId()).getSingleResult();
		student.setFirstname(studenttoupdate.getFirstname());
		student.setLastname(studenttoupdate.getLastname());
		
		transaction.commit();
		session.close();
		
	}

	private static List<Student> getStudents() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		List<Student> students = session.createQuery("FROM Student").list();
		
		transaction.commit();
		session.close();
		return students;
	}

	private static void save(Student student) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
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
