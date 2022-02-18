package com.springCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String EmpName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String , String >  courses;
	
	
   public Emp() {
	   super();
   }
	
	
	
	
	
	

	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [EmpName=" + EmpName + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	
}
