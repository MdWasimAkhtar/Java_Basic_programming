package com.springCore.autowiringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springCore/autowiringBean/autowiringConfig.xml");
		
	     Emp e1 = 	context.getBean("emp1", Emp.class );
	     System.out.println(e1);
	     
	     Student s1 = context.getBean("fee1", Student.class);
	     System.out.println(s1);
	}

}
