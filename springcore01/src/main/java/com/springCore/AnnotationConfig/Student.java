package com.springCore.AnnotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("obj")  Testing @Bean 
public class Student {
	
	private String studentName;
	private int s_id;
	
	private StudentFees fees;
	Student(StudentFees fees){
		super();
		this.fees=fees;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", s_id=" + s_id + "]";
	}
	
	public String study() {
		fees.paidFees();
		return "Student is  Studying on Udemy";
	}

}
