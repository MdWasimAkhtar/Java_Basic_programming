package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestAddress {
	
	public static void main(String[] args) throws Exception {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sesfactory = cfg.buildSessionFactory();
		
		
		Address a1 = new Address();
		a1.setStreet("Ganga Nagar");
		a1.setDate(new Date());
		a1.setDist("Khrakpur");
		a1.setHouseNo("98");
		a1.setPassOrFail(true);
		a1.setImage(null);
		a1.setX(55);

		FileInputStream fis = new FileInputStream("src/main/java/woman02.jpg");
		byte[]  data = new byte[fis.available()];
		fis.read(data);
		
		a1.setImage(data);
		
		Session sess1 =sesfactory.openSession();
		Transaction tx = sess1.beginTransaction();
		sess1.save(a1);
		tx.commit();
		sesfactory.close();
		sess1.close();
		
	}

}
