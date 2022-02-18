package com.hibernate.simple202;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.simple202.entities.Cars;

public class HqlExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
	//	String query = "from Cars";
//		String query = "from Cars where carName=:'Audio' ";
//		String query = " from Cars where carName=:x";
		
		String query = "from Cars as c  where  c.carName=:n and c.price=:p ";
		
		
		Query q1 = session.createQuery(query);
		
		q1.setParameter("n", "Delton");
		q1.setParameter("p", 300000.0 );
		
		// single - (unique)
		//multiple - List
		
		List<Cars> list = q1.list();
		for(Cars i : list) {
			System.out.println(i.getCarName()+"  "+i.getCarModel()+"  "+i.getPrice());
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Transaction trxx = session.beginTransaction();// for deleting we need transaction 
		
		String query1 = "delete from Cars as c  where c.carName=:n " ;
		
		Query q2 = session.createQuery(query1);
		q2.setParameter("n", "Audio");
		int res=   q2.executeUpdate();
		System.out.println(res+" effect row ");
		
		
		session.clear();
		session.close();
		factory.close();
		
	}

}
