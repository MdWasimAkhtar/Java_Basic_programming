package com.Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.PojoClass.Address;

public class Save_Address {
	public static void main(String[] args) {
		
		address_();
	}
	public static void address_() {
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Address ad1 = new Address();
		ad1.setAddressId(10000101);
		ad1.setOpen(true);
		ad1.setAddedDate(new Date());
		ad1.setStreet("NewYork-1 Street ");
		ad1.setX(100);
		ad1.setImage(null);
		
		Session session = factory.openSession();
		Transaction trxx = session.beginTransaction();
		session.save(ad1);
		trxx.commit();
		
		session.close();
	}

}
