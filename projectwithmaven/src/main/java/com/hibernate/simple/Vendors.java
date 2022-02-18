package com.hibernate.simple;
import javax.persistence.*;

@Entity
public class Vendors {
	
	@Column(name="CompanyName")
	private String V_name;
	private String software;
	@Id
	private int Id;
	
	public Vendors() {
		super();
	}
	
	public String getV_name() {
		return V_name;
	}
	public void setV_name(String v_name) {
		V_name = v_name;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}
