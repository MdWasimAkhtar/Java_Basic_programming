package com.hibernate.pagination;

import org.hibernate.query.*;

import com.hibernate.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPagination {
	
	   public static void main(String[] args) {
		
		      SessionFactory factory =  new Configuration().configure().buildSessionFactory();
		      Session session = factory.openSession();
		      
		      Query<Student> q1 = session.createQuery("from Student");
		      
		      //implementing pegination using hibernate
		      
		      q1.setFirstResult(2);
		      q1.setMaxResults(4);
		      
		      List<Student> listStudent = q1.list();
		      for(Student i : listStudent)
		    	  System.out.println(i.getId()+"  "+i.getName()+"  "+i.getCity());
		      
		      session.close();
		      session.close();
		      
	}

}
