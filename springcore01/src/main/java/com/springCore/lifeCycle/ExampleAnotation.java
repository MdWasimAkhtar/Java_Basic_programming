package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.management.ConstructorParameters;

public class ExampleAnotation {
	
	private String  subjxxx ;
	
	public ExampleAnotation(String subjxxx) {
		this.subjxxx = subjxxx;
	}

	@Override
	public String toString() {
		return "ExampleAnotation [subjxxx=" + subjxxx + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method !!!");
	}
	
	@PreDestroy
	public void end() {
		System.out.println(" End !!!!!!!!!!!!!!!!!!!!!");
	}
	

}
