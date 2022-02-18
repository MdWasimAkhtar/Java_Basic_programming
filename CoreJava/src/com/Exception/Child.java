package com.Exception;
// what is inheritance 
// When One Object is acquaire all the proproty of another Objects 

// Why multiple inheriatnce is not possible in java , not psossible 
// because if there is same method present in both the class ,then jvm can't figure it out  
// 

// user define class is direct child class of Object class


class Parent{

	int x = 100;
	
	public static void sahthi() {
		System.out.println("Sahithi_____1");
	}
	public void add(int a , int b ,int c ) {
		System.out.println(a+b+c);
	}
	
	public void add(int a , int b ,int c , int d ) {
		System.out.println(a+b);
	}	
}

// if we write any constructor jvm will provide defult constructor 
// but if your a constructor jvm will not provide 


public class Child extends Parent {

	public static void main(String[] args) {
		
		Child   c1 = new Child();
		
		System.out.println(c1.x);
		
		c1.add(12, 11, 10);
		sahthi();
	}
	
	public static void sahthi() { // method hiding , paraent class method will be hidden
		System.out.println("Sahithi_____100");
	}
	
	public void add(int a , int b ,int c , String name) { // first is-a relation , then emthod name should be same , no of argument or order of arg. same 
		
		System.out.println(a+b+c);	
	}	
	
	
}


