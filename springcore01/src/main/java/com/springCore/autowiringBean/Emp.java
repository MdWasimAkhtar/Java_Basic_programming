package com.springCore.autowiringBean;

public class Emp {
	
	private Address address;
	
	Emp(){
		super();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
}
