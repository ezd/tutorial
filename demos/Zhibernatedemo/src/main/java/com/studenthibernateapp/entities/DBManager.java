package com.studenthibernateapp.entities;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DBManager {
public static void main(String[] args) {
	
//	System.out.println("Working...");
	Student student=new Student();
	student.setName("Suleyman");
//	saveStudent(student);
//	List<Student>students = getAllStudents();
//	for(Student st:students) {
//		System.out.println("Student name:"+st.getName()+"and id:"+st.getId());
//	}
//	Student student= getStudentById(3);
//	System.out.println("Student name:"+student.getName()+"and id:"+student.getId());
	
//	delete(3);
	int studentidtoupdate=1;
	update(studentidtoupdate, student);
	
	System.out.print("Done.");
	
	
}



private static void update(int studentidtoupdate, Student student) {
	Session session = getSession();
	Transaction transaction = session.beginTransaction();

	Student studentFound = (Student)session.createQuery("FROM Student WHERE id="+studentidtoupdate).getSingleResult();
	studentFound.setName(student.getName());
	
	transaction.commit();
	session.close();
}



private static void delete(int id) {
	Session session = getSession();
	Transaction transaction = session.beginTransaction();
	Query query = session.createQuery("DELETE FROM Student WHERE id=:studentId");
	query.setParameter("studentId", id);
	int rows= query.executeUpdate();
	System.out.println("rows deleted is :"+rows);
	transaction.commit();
	session.close();
	
}



private static Student getStudentById(int id) {
	Session session = getSession();
	Transaction transaction = session.beginTransaction();
	Student studentFound = (Student)session.createQuery("FROM Student WHERE id="+id).getSingleResult();
	transaction.commit();
	session.close();
	
	return studentFound;
}

private static void saveStudent(Student student) {
	Session session = getSession();
	Transaction transaction = session.beginTransaction();
	//save,update...
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

static List<Student> getAllStudents(){
	Session session = getSession();
	Transaction transaction = session.beginTransaction();
	
	List<Student> students=session.createQuery("FROM Student").list();
	
	transaction.commit();
	session.close();
	
	return students;
}


}
