package com.hibernate.nativeSqlQuery;

import java.util.*;
import com.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {
	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session=   factory.openSession();
		 
		 String sql1 = "Select * from Student";
		 NativeQuery  nq = session.createSQLQuery(sql1);
		 List<Object[]>  studentlist = nq.list();
		 for(Object[] i: studentlist)
			 System.out.println(i[3]+"  "+i[4]);
//			 System.out.println(Arrays.toString(i));
		 
		  
		 
		 factory.close();
	}

}
