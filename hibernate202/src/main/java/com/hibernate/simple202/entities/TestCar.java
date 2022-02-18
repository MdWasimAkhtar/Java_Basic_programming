package com.hibernate.simple202.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCar {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		
//		Cars c1 = new Cars();
//		c1.setCarModel(88776);
//		c1.setCarName("Audio");
//		c1.setPrice(6700000);
//		
//		Cars c2 = new Cars();
//		c2.setCarModel(40056);
//		c2.setCarName("Delton");
//		c2.setPrice(300000);
//		
		
		Session session =factory.openSession();
//		Transaction trx = session.beginTransaction();  don't need transaction for 
		
         Cars  getCar = (Cars) session.get(Cars.class,40056l );
         System.out.println(getCar);
         
         Cars  c2 = (Cars)session.load (Cars.class, 3389l);
         System.out.println(c2);
		
		
		
//		session.save(c1);
//		session.save(c2);
		
		
		
//		trx.commit();
		
		factory.close();
		
	}

}
