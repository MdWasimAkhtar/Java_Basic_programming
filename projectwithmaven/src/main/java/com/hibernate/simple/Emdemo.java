package com.hibernate.simple;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class Emdemo {

	public static void main(String[] aa)
	{
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sesfactory = cfg.buildSessionFactory();
		 
		 Student student1 = new Student();
		 student1.setId(102);
		 student1.setName("Rekha");
		 student1.setEmail("RekhaLoveRain@gmail.com");
		 student1.setMarks(100);
		 
		 Certificate cert1 = new Certificate();
		 cert1.setCourse("Linux ShellScripting");
		 cert1.setDuration("26 hours");
		 
		 // student Object2 
		 Student student2 = new Student();
		 student1.setId(103);
		 student1.setName("Lovely");
		 student1.setEmail("LovelyDanceWithMicheal@gmail.com");
		 student1.setMarks(93);
		 
		 Certificate cert2 = new Certificate();
		 cert2.setCourse("Python web development");
		 cert2.setDuration("56 hours");

		 Session session = sesfactory.openSession();
		 Transaction trx = session.beginTransaction();
		 session.save(student1);
		 session.save(student2);
		 trx.commit();
		
		 
	}
}
