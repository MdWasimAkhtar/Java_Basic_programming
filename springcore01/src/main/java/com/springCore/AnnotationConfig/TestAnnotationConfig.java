package com.springCore.AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class) ;
		
		Student s1 = context.getBean("getStudent", Student.class);
		
		System.out.println(s1.study());
	}

}
