package com.hibernate.simple202;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sef = cfg.buildSessionFactory();
         
         System.out.println(sef);
         sef.close();
    }
}
