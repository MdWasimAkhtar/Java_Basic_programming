package com.Exception;

class Exception_handling
{
	public static void main(String[] aa){
		
		int x = 100;
		String str = "Wasim";
		double arr[] = {12.89,90,78.2,67 , 1212};
		String str2 = null;
		
		
		try{
			
			try {
				System.out.println(x/0);
			}
			catch(ArithmeticException e ) {
				System.out.println("Dividing be zero is not possible");
			}
			
			try{
				System.out.println("str   "+str.charAt(10));
			}catch(StringIndexOutOfBoundsException e ){
				System.out.println("String index Out of Bounds Exception Occurs");
			}
			try {
				System.out.println(str2.charAt(7));
			}catch(NullPointerException e ) {
				System.out.println("Null Pointer exception");
			}
			try {
			System.out.println(arr[90]);
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Index Out Of Bounds Exception ");
			}
			finally {
				System.out.println("Md Wasim AKhtar got a job ");
			}
		}
		catch(Exception e  ){
						e.printStackTrace();
		}
	}
}