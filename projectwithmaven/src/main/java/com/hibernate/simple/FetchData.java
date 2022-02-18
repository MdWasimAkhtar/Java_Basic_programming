package com.hibernate.simple;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class FetchData {

	public static void main(String[] aa) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session ses = sessionFactory.openSession();
		
		//session has get or load method
		// dont need transaction to retrive data 
		// we have to know id or index 
		Student student=(Student)ses.get(Student.class, 10302);
		Student student2= (Student)ses.load(Student.class, 10202);
	 //   System.out.println(student);
	 //   System.out.println(student2);
	    
	    Address add01 = (Address)ses.get(Address.class, 3);	    System.out.println(add01);
		
		ses.close();
		sessionFactory.close();
	}
	
}
