package com.hibernate;
import javax.persistence.*;

@Entity
public class Student {
	
	private Certificate certi;
	
	@Id
	@Column(name="S_Id")
	private Integer id;
	
	@Column(name ="S_Name")
	private String name;
	
	@Column(name="S_City")
	private String city ;
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	

}
