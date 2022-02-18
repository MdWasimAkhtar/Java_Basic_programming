package com.springCore.autowiringBean;

public class Student {
	
	private String name;
	private String Course;
	private StudentFees studfees;
	
	Student(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public StudentFees getStudfees() {
		return studfees;
	}

	public void setStudfees(StudentFees studfees) {
		this.studfees = studfees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Course=" + Course + ", studfees=" + studfees + "]";
	}
	
	
	
	

}
