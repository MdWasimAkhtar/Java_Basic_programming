package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	
    public static void main(String[] args) {
		
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sesfactory = cfg.buildSessionFactory();
    	
    	Session session = sesfactory.openSession();
    	
    	Student st =(Student)session.get(Student.class, 3);
    	System.out.println("student Details :::"+st);
    	
    	Address add =(Address)session.get(Address.class, 3);
    	System.out.println(add);
    	
    	
    	
    	
	}

}
