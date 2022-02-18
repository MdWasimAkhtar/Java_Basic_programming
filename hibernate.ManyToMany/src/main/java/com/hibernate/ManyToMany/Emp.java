package com.hibernate.ManyToMany;

import java.util.List;

import javax.persistence.*;
import javax.persistence.ManyToMany;

@Entity
public class Emp {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable( name="Emp_learn" , joinColumns = {@JoinColumn(name="eID")} ,
		    	inverseJoinColumns= {@JoinColumn(name="pID")  }  
	  )
	private List<Project> project;
	
	 public Emp() {
		 super();
	 }

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	  
}
