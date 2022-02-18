package com.hibernate.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sesfactory = cfg.buildSessionFactory();//SessionFactory is interface , cant make object
       
      //   System.out.println(sesfactory);
      //   System.out.println(sesfactory.isClosed());
       
       Student student = new Student();
       student.setId(10402);
       student.setName("Windy");
       student.setEmail("Windy0NewYork@gmail.com");
       student.setMarks(73);
 /*      
       Session session= sesfactory.openSession();
       
       Transaction trx = session.beginTransaction();
       session.save(student);
       
      // session.getTransaction().commit(); instead of this we can use 
       trx.commit();
       
      */
  
       //------------------------College -----------------
/*       
       College college = new College();
       college.setCollege_id(8811109);
       college.setCollge_name("South East Asian College Of Engineering ");
       college.setCity("Bangalore/Karnataka");
       
       
        Session session = sesfactory.openSession();
        
        Transaction trx = session.beginTransaction();
        session.save(college);
        trx.commit();
       */ 
        //--------------Address Class----------------
        
        Address address = new Address();
        address.setStreet("Jump Street 23");
        address.setCity("Buffalo New York District");
        address.setOpen(false);
        address.setAddedDate(new Date());
       address.setXy(230.99);
       
       //reading image
 /*
       FileInputStream fis= new FileInputStream("/home/ubuntu-wasim/Downloads/Rachel.jpg");
       byte[] data = new byte[fis.available()];
       fis.read(data);
       address.setImage(data);
  */     
       File file= new File("/home/ubuntu-wasim/Downloads/Rachel.jpg");
       byte[] bf = new byte[(int)file.length()];
       FileInputStream fis = new FileInputStream(file);
       fis.read(bf);
       address.setImage(bf);
       fis.close();
       
       
       Session session = sesfactory.openSession();
       Transaction trx = session.beginTransaction();
       session.save(student);
       session.save(address);
       trx.commit();
       session.close();
       
       
    }
}
