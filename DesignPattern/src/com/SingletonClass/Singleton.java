package com.SingletonClass;

class Single{
	
	private static Single single = null;
	
	private Single() {
		System.out.println("The Single Object just reuse again and again ");
	}
	public static Single getInstances() {
		
		if(single == null) {
			
			synchronized(Single.class) {
				
				single = new Single();
			}
		}
		return  single;
	}
}


public class Singleton {
	public static void main(String[] args) {
		
//		Single s1 = new Single();
//		s1.getInstances();    CTE --The constructor Single() is not visible
		
		
		
		
		Thread t1  = new Thread(new Runnable() {
			public void run() {
				Single obj5 = Single.getInstances();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				Single obj6 = Single.getInstances();
			}		
		});
		
		t1.start();
		try {t1.join(); }catch(Exception e ) {}
		t2.start();
	}
}
/*
 * 
 * class is not final but we are not allowed to create child class 
 * How it is possible 
 * Ans--declare every constrcutor as private
 * */










