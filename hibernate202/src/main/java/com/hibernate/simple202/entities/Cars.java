package com.hibernate.simple202.entities;
import javax.persistence.*;

@Entity
public class Cars {
	
	@Id
	private long carModel;
	public String carName;
	private double price;
	
	
	public Cars() {
		super();
	}
	
	
	public Cars(long carModel, String carName, double price) {
		super();
		this.carModel = carModel;
		this.carName = carName;
		this.price = price;
	}
	public long  getCarModel() {
		return carModel;
	}
	public void setCarModel(long carModel) {
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Cars [carModel=" + carModel + ", carName=" + carName + ", price=" + price + "]";
	}
	
	

}
