package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FrenchFood implements InitializingBean ,DisposableBean {
	
	private String frenchFoodName;
	private double price ;
	
	FrenchFood(){
		super();
	}
	
	
	public String getFrenchFoodName() {
		return frenchFoodName;
	}


	public void setFrenchFoodName(String frenchFoodName) {
		this.frenchFoodName = frenchFoodName;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "FrenchFood [FrenchFoodName=" + frenchFoodName + ", price=" + price + "]";
	}
	
	 public void afterPropertiesSet() {
		  System.out.println("after properties set");
	 }


	public void destroy() throws Exception {
		System.out.println("going to destroy!!!");
		
	}


	

}
