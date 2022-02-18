package com.Exception;

public class Throw_ {
	
	public static void throw_ing(int num) throws ArithmeticException{
		
		if(num < 1)
			throw new ArithmeticException("number is negative");
			
		else
			System.out.println("Number is positive");
	}
	
	public static int divide(int m , int n) throws ArithmeticException{
		
		return m/n;
	}
	public static void main(String[] args){
		Throw_ thr = new Throw_();
		thr.throw_ing(90);
		try {
		divide(34, 0);
		}
		catch(Exception e ) {
			System.out.println("Can't divided any number by zero ");
		}
	}
}
