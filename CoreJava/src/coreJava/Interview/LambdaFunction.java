package coreJava.Interview;

import coreJava.Interview.functional_Interface.Functional_Face;

public class LambdaFunction {
	public static void main(String[] args) {
		
	Functional_Face f1 = (a,b) -> {System.out.print("The addition : ");
	return a+b;
	};
		 System.out.println(f1.add(20,30));
	

	Functional_Face f4 = (a,b) ->   (a+b) ;
	
	 System.out.println(f4.add(200,30));
	 
	 // Runnable Interface is Functional Interface so we can create lambda function
	 
	 Runnable r1 = ()->{ 
		 System.out.println("Creating Thread with lambda");
	 };
	 Thread t2 = new Thread(r1);
	 t2.start();
 }
}
