package coreJava.Interview;


class SuperClass
{
	String str;
	
	SuperClass(String str){
		System.out.println("Superclass constructor");
	}
	SuperClass(){
		System.out.println("No args Constructor of SuperClass");
	}
}

class Child extends SuperClass
{
	int rollnumber ;
	Child(int rollnumber){
		this.rollnumber = rollnumber;
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args){
	
		Child  obj1 = new Child(23);
	}
}