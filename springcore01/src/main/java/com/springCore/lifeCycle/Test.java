package com.springCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifecycleBean.xml");
		
		FastFood fast = (FastFood)context.getBean("ff1");
		System.out.println(fast);
		
		//
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		FrenchFood french = (FrenchFood)context.getBean("french1");
		System.out.println(french);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		ExampleAnotation exp= (ExampleAnotation)context.getBean("ex1");
		System.out.println(exp);
		
	}

}
