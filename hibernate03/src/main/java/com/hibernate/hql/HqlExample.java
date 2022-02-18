package com.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.hibernate.Student;

public class HqlExample {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory  sessionfactory=cfg.buildSessionFactory();
		Session sess = sessionfactory.openSession();
		
	//	String query="from Student where city='Bangalore' ";
		String query = "from Student as s  where s.city=:x  and s.name=:n";
		 Query q =  sess.createQuery(query);
		 q.setParameter("x","Mysore");
		 q.setParameter("n", "Larson");
		 
		 //single - (unique)
		 //multiple-list
		 List<Student> list= q.list();
		 
		 for(Student i : list)
			 System.out.println(i.getName()+" "+i.getId());
		 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 Transaction tx = sess.beginTransaction();
//		 Query q2 = sess.createQuery("delete from Student as s  where s.city=:c");
//		 q2.setParameter("c", "delhi");
//		 int res = q2.executeUpdate();
//		 System.out.println("row deleted :"+res);
          
		 
		 Query q3 = sess.createQuery("update Student set city=:c where name=:n ");
		 q3.setParameter("c", "NewYork");
		 q3.setParameter("n", "Windy");
		 int res2 = q3.executeUpdate();
		 System.out.println("rows updated"+res2);
		 
		 Query q4 = sess.createQuery("select q.question , q.questionId , a.answer from Question as q Inner Join q.answer as a ");
		 List<Object[] > listq = q4.getResultList();
		 for(Object[]  arr: listq)
			 System.out.println(Arrays.toString(arr));
		 
		 
		 
		 sess.close();
		 sessionfactory.close();
		 
		
	}

}
