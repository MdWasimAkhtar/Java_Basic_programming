package com.hibernate.simple;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//change the name of entity to Student_details
//@Entity(name="student_details")
//create Tbale with name MyStuent
//@Table(name="myStudent") 

@Entity // marking any class as entity
public class Student 
{
//	@Id , this for making id as primary key 
	@Id
	private int id;
	private String name ;
	private String email;
	private int marks;
	
	@Embedded
	private  Certificate certificate;
	
	public Student() {
		
	}
	public Student(int id , String name , String email , int marks) {
		super();
		this.id=id;
		this.name= name ;
		this.email= email;
		this.marks=marks;
	}

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}

	public String toString() {
		return this.id+"  "+this.name+"  "+this.email+"  "+this.marks;
	}
	
//	@OneToMany(targetEntity = Student.class, mappedBy = "Emdemo", 
//		    cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
}
