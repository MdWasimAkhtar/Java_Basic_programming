package com.springCore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
//	@Autowired
	private Address address;
	
	Emp(){
		super();
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("temp2")
	public void setAddress(Address address) {
		System.out.println("Setting Value ");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
}
