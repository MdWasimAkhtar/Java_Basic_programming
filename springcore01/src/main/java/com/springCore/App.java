package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // spring container to make Object of student1
    	
         ApplicationContext context  =	new ClassPathXmlApplicationContext("config.xml");
         
             Student st1=(Student)context.getBean("student1");
             Student st2 = (Student)context.getBean("student2");
             System.out.println(st1);
             System.out.println(st2);
    	
    }
}
