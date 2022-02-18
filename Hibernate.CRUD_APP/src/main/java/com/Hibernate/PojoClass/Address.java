package com.Hibernate.PojoClass;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length=50,name="STREET")
	private String street;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient
	private double x ;
	
	@Column(name="DATE")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;
	
	public Address(){
		super();
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

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", isOpen=" + isOpen + ", x=" + x
				+ ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	

}
