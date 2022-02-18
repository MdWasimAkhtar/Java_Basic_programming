package com.springCore.autowiringBean;

public class StudentFees {
	
	private double fees;
	
	StudentFees(){
		
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "StudentFees [fees=" + fees + "]";
	}
	
	

}
