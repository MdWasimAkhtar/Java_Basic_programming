package com.hibernate.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class VendorClients {
	
	public static void main(String[] aa)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Vendors ved = new Vendors();
		ved.setId(9090);
		ved.setV_name("Wipro");
		ved.setSoftware("Wipro Garnet LED");
		
		Vendors ved2 = new Vendors();
		ved2.setId(1011);
		ved2.setV_name("Microsoft");
		ved2.setSoftware("Microsoft Visual Code Studio");
		
		Session ses = sf.openSession();
		Transaction trx =ses.beginTransaction();
	    ses.save(ved);
	    ses.save(ved2);
	    trx.commit();
	    ses.close();
	    sf.close();
		
	}

}
