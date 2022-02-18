package com.hibernate.ManyToMany;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	public static void main(String[] aa) {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sesfactory= cfg.buildSessionFactory();
		
 //  Employees--1 
		 Emp e1 = new Emp();
		 e1.setEid(2021);
		 e1.setName("Shilpa");
		 
// Employees--2 		 
		 Emp e2 = new Emp();
		 e2.setEid(2022);
		 e2.setName("Rekha");
		 
// Not here		 e1.setProject();
		 
//  project--1
		 Project p1 = new Project();
		 p1.setPid(4042);
		 p1.setProjectName("Responsive WEB page");
// project --2 	 
		 Project p2 = new Project();
		 p2.setPid(4044);
		 p2.setProjectName("Angular SpringBoot TypeScript");

// List of Emp
		 List<Emp> lEmp = new ArrayList<Emp>();
		 lEmp.add(e1);
		 lEmp.add(e2);
		 
// list of project		
		 List<Project> lProject = new ArrayList<Project>();
		 lProject.add(p1);
		 lProject.add(p2);
	
//give project tO Employees  
		 e1.setProject(lProject);//take list of projects
	
//set project to EmpList 		 
		 p1.setEmps(lEmp); // takes list of Employees
		 
		 Session session = sesfactory.openSession();
		 Transaction trxx = session.beginTransaction();
		 session.save(e1);
		 session.save(e2);
		 session.save(p1);
		 session.save(p2);
		 
		 trxx.commit();
		 
		 
		 session.close();
		 sesfactory.close();
		 
		
	}

}
