package com.hibernate;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="student_details")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length= 50 , name="StreetName")
	private String  street;
	private String  Dist;
	private String  HouseNo;
	
	@Temporal(TemporalType.DATE)
	private Date   date;
	@Lob
	private byte[]  image;
	private boolean  passOrFail;
	
	@Transient
	private double x;
	
	
	public Address() {
		super();
	}
	
	
	 


	public Address(int addressId, String street, String dist, String houseNo, Date date, byte[] image,
			boolean passOrFail, double x) {
		super();
		this.addressId = addressId;
		this.street = street;
		Dist = dist;
		HouseNo = houseNo;
		this.date = date;
		this.image = image;
		this.passOrFail = passOrFail;
		this.x = x;
	}





	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
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


	public String getHouseNo() {
		return HouseNo;
	}


	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public boolean isPassOrFail() {
		return passOrFail;
	}


	public void setPassOrFail(boolean passOrFail) {
		this.passOrFail = passOrFail;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}
	
	

	

}
