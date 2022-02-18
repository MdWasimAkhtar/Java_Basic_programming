package com.springCore.autowiringBean;

public class Address {
	
	private String street;
	private String Dist;
	
	Address(){
		super();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return Dist;
	}

	public void setDist(String dist) {
		Dist = dist;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", Dist=" + Dist + "]";
	}
	
	
	
	

}
