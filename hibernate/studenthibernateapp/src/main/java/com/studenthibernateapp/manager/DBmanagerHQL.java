package com.studenthibernateapp.manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.studenthibernateapp.entities.Student;

public class DBmanagerHQL {
	
	public static void main(String[] args) {
//		//--cofigure
		Configuration cnfg= new Configuration();
    	cnfg.configure("hibernate.cfg.xml");
//		
//		//--session
    	Session session = cnfg.buildSessionFactory().openSession();
//
//		
//		//--transaction
//    	
    	Transaction transaction = session.beginTransaction();
//		
//		//i, u, s, d
//    	Student student= new Student();
//    	student.setFirstname("Alemu");
//    	student.setLastname("Kebede");

		
	}

	

	private static Session getSession() {
		Configuration cnfg= new Configuration();
    	cnfg.configure("hibernate.cfg.xml");
		//session
    	Session session = cnfg.buildSessionFactory().openSession();
		return session;
	}

}
