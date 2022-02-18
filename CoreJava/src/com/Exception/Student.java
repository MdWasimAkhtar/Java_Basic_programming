package com.Exception;

public class Student {
	
	String name ;
	
	
	Student(){
		super();
	}
	
	Student(String name){  // same name but different Number argument 
		this.name = name ;
	}
	
	Student(String place , int pincode ){
	}
	
	public int  add(int a , int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public void add(int a , int b ,int c ) {
		System.out.println(a+b);
	}
	
	public void add(int a , int b ,int c , int d ) {
		System.out.println(a+b);
	}

}

// we have to is-relationship , inheritance

// we the child class 

class School extends Student 
{
	
	public void add(int a , int b ,int c , int d ) { // can't cahnge order of argument or ..
		
		System.out.println("");
	} 
}
