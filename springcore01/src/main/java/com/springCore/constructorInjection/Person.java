package com.springCore.constructorInjection;

import java.util.List;

public class Person {
	
	private int personId;
	private String Name ;
	private Certificate cert;
	private List<String> books;
	
	public Person(int personId, String name, Certificate cert , List<String> books) {
		super();
		this.personId = personId;
		Name = name;
		this.cert=cert;
		this.books=books;
	}

	@Override
	public String toString() {
		return "person [personId=" + personId + ", Name=" + Name + " , CertificateName =  "+ this.cert.certificateName  + " , books=  "+ books +"]";
	}
	
	

}
