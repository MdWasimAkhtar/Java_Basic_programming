package com.hibernate.simple;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
	private int college_id;
	private String collge_name;
	private String city;
	
	College(){
		
	}
	College(int college_id ,String college_name ,String city ){
		super();
		this.college_id=college_id;
		this.collge_name=college_name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", collge_name=" + collge_name + ", city=" + city
				+ ", getCollege_id()=" + getCollege_id() + ", getCollge_name()=" + getCollge_name() + ", getCity()="
				+ getCity() + "]";
	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getCollge_name() {
		return collge_name;
	}

	public void setCollge_name(String collge_name) {
		this.collge_name = collge_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
