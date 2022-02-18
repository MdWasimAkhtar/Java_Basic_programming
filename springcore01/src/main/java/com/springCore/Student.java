package com.springCore;

public class Student {
	
	private int studentId;
	private String studentName;
	private String  studentAddress;
	
	Student(){
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}

	public String getStudentName() {
		System.out.println("getting Student"+studentId);
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
	
	
}
