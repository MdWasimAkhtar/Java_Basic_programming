package com.Exception;

/* how much we want to shared our class , method or constructor , variable to other 
 * scope of a field, method, constructor, or class.
 *  We can change the access level of fields, constructors, methods, and class
 * 
 * public -- same package 
 * 
 * protected , default , private 
 * 
 * non - access modifier ->  static , final , transient , stripf , 
 * */

public class Access_modifier {
	
	public transient String password = "Sahithi123" ; // null , default value 
	
	private  transient int privateNo = 99929 ; // 0
	
	static int money = 450000; //static is class level keyword ( varaible or class method )  execute only 
	int rollno ;
	
	String name = "Wasim";
	
	Access_modifier(String name ){
		this.name  = name ; // this always represent current instance of the class 
	}
	
	Access_modifier(){
		
	}
	Access_modifier(String name , int rollno ){
		this.name = name ;
		this.rollno = rollno;
		
	}
	
	
	private  static void  call_function() {
		
		System.out.println(" is reading " );
	}
	
	
	private  void display() {
		
		System.out.println(this.name + " is reading " );
	}
	
	
	private  void calculator () {
		
	}
	
	
	public static void main(String[] args) {
		
		
		Access_modifier s1 = new  Access_modifier("Sahithi  Patel"); // 1 
		//s1.display();
		
		// s1 is reference varaible 
		// in java with new Ketword we create Object 
		// almost five ways (1) new keyword (2) . instanceof() (3). 
		
		Access_modifier s2 = new  Access_modifier("COmputer Scienece "); // 2 
		//s2.display();
		
		Access_modifier s3 = new  Access_modifier("COmputer Scienece "); // 2 
		//s2.display();
		
		Access_modifier s4  = new  Access_modifier("COmputer Scienece "); // 2 
		//s2.display();
		
		Access_modifier s5 = new  Access_modifier("Windy",123); // 2 
		//s2.display();
		
		
	}
}
