package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
	
	public static void main(String[] aa)
	{
		//object state is Transient
		Student student = new Student();
		student.setId(10101);
		student.setName("Shilpa");
		student.setEmail("Shilpa#Wasim@gmail.com");
		student.setMarks(100);
		
		//student obj state is persistance
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses= sf.openSession();
		ses.save(student);
		
		//Student obj will move to data base
		ses.beginTransaction().commit();
		
		//Student Obj will remove from persistance
		//then gc collect the student Obj
		ses.evict(student);
		
	}

}
