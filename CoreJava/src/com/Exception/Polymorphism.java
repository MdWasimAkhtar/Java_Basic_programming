package com.Exception;

// single operation we can perform many ways 
//  by parent class refernece we can hold any child class Object

// runtime(at java vrtual machine ) and compile time 


class Bank{  // superClass
	
	private String Name = "Sahithi";
	
	float  getRateOfInterest() {
		
		return  0.0f;
	}	
}

class SBI extends Bank{
	
	@Override
	float getRateOfInterest() {
		return 8.7f;
	}
}
class ICICI extends Bank {
	
	@Override
	float getRateOfInterest() {
		return 7.2f;
	}
}

class Kotak extends Bank{
	
	@Override
	float getRateOfInterest() {
		return 6.7f;
	}
}

class AXIS extends Bank{
	
	@Override
	float getRateOfInterest() {
		return 11.7f;
	}
}

// for polymorphsim 

public class Polymorphism {
	
	public static void main(String[] args) {
		
		Bank b1 ;
		
		b1 = new Kotak();
		System.out.println(b1.getRateOfInterest());
		
		b1 = new ICICI();
		System.out.println(b1.getRateOfInterest());
		
		
	}
	public static void running() {
		System.out.println("I am doing execrcise");
	}
}