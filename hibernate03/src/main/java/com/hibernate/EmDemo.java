package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sesfactory = cfg.buildSessionFactory();
		
		
		Student s1 = new Student();
		s1.setId(87);
		s1.setName("Rekha");
		s1.setCity("delhi");
		
		Certificate c1 = new Certificate();
		c1.setCourse("SpringBoot");
		c1.setDuration("1 Month");
		
		Session sess = sesfactory.openSession();
		Transaction tx = sess.beginTransaction();
		
		sess.save(s1);
//		sess.save(c1); // don't have to make
		tx.commit();
	
		
		sesfactory.close();
		
		
	}

}
