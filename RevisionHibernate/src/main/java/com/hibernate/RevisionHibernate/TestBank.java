package com.hibernate.RevisionHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBank {
	
	public static void main(String[] args) {
		
		  Configuration cfg =  new Configuration();
		  cfg.configure("hibernate.cfg.xml");
		  SessionFactory factory = cfg.buildSessionFactory();
		  
		  BankEmp b1 = new BankEmp();
		  b1.setEmpId(775643);
		  b1.setEmpName("Shilpa");
		  b1.setDept("manager");
		  b1.setSalary(75000);
		  
		  Session session = factory.openSession();
		  
		  Transaction trxx =session.beginTransaction();
		  
		  session.save(b1);
		  trxx.commit();
		  factory.close();
		  session.close();
		    
	}

}
