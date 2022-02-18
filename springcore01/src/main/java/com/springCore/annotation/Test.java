package com.springCore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springCore/annotation/annotationConfig.xml");
		
	     Emp e1 = 	context.getBean("emp1", Emp.class );
	     System.out.println(e1);
	}

}
