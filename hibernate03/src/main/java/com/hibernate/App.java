package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
         
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sessionfactory = cfg.buildSessionFactory();
    	
    	
//    	System.out.println(factory);
    	
         
    	Student s1 = new Student();
    	s1.setId(04);
    	s1.setName("Rekha");
    	s1.setCity("Bangalore");
    	
    	Session session = sessionfactory.openSession();
        Transaction tx =	session.beginTransaction();
    	session.save(s1);
    	
    	Student s2 = new Student();
    	s2.setId(05);
    	s2.setName("Larson");
    	s2.setCity("Mysore");
    	
    	 Session session2=  sessionfactory.openSession();
    	 Transaction tx2=session2.beginTransaction();
    	 session2.save(s2);
    	 tx2.commit();
    	
 //   	session.getTransaction().commit();
    	tx.commit();
    	session.close();
    	sessionfactory.close();
    
        System.out.println(sessionfactory.isClosed());
    	
        
    }
}
