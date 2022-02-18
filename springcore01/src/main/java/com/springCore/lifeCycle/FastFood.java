package com.springCore.lifeCycle;

public class FastFood {
	
	private String foodName;
	private double price;
	
	
	public FastFood(String foodName, double price) {
		super();
		this.foodName = foodName;
		this.price = price;
		System.out.println("constructor set value : OK!!");
	} 
	
	
	public void init() {
		System.out.println("Inside init Method");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}


	@Override
	public String toString() {
		return "FastFood [foodName=" + foodName + ", price=" + price + "]";
	}
	

	
	
}
