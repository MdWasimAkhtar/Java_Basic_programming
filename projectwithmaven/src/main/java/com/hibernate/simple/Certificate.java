package com.hibernate.simple;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
public class Certificate {
 
	private String course;
	private String duration ;
	
	public Certificate(){
		super();
	}
	public Certificate(String course , String duration){
		this.course = course;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
