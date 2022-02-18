package com.springCore.streotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/streotypeAnnotation/streoConfig.xml");
		
		//
		Student s1 = context.getBean("student", Student.class);
		
		Student s2 = context.getBean("student", Student.class);
		
		
//		
//		System.out.println(s1);
//		
//		System.out.println(s1.getAddress());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Teacher  teacher= context.getBean("teacherbean", Teacher.class);
		Teacher  teacher2= context.getBean("teacherbean", Teacher.class);
		System.out.println(teacher.hashCode()+ " "+teacher2.hashCode());
		
	}

}
