package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.PojoClass.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        hibernate_();
    }
    
    public static void hibernate_() {
    	
    	Configuration cfg  = new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	System.out.println(factory);
    	System.out.println(factory.isClosed());
    	
    	//creating student
    	Student st = new Student();
    	st.setId(9091);
    	st.setName("Wasim");
    	st.setCity("Bangalore");
    	st.setCourse("ME");
    	
    	Student st1 = new Student();
    	st1.setId(9092);
    	st1.setName("Zara");
    	st1.setCity("Pune");
    	st1.setCourse("IT");
    	
    	Student st2 = new Student();
    	st2.setId(9093);
    	st2.setName("Shabnam");
    	st2.setCity("Bangalore");
    	st2.setCourse("Electrical");
    	
    	Session session = factory.openSession();
    	
    	Transaction trx = session.beginTransaction();
    	session.save(st);
    	session.save(st2);
    	session.save(st1);
    	trx.commit();
    	
    	session.clear();
    	session.close();
    	
    }
}
