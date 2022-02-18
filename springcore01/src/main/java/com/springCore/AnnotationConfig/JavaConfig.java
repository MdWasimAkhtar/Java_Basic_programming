package com.springCore.AnnotationConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springCore.AnnotationConfig")
public class JavaConfig {
	
	private String classId;
	
	@Bean
	public StudentFees getFee() {
		return new StudentFees();
	}
	
	
	@Bean(name= {"student2" ,"temp","con"}) // can use all the name
	public Student getStudent() {
		Student student = new Student(getFee());
		return student;
	}
	
	

}
