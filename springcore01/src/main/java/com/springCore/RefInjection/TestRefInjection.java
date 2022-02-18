package com.springCore.RefInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRefInjection {
	public static void main(String[] args) {
		
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/springCore/RefInjection/refConfig.xml");
		Book book1=(Book) context.getBean("b1");
		System.out.println(book1);
		
	}

}
