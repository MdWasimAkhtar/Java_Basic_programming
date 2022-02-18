package com.Basic_Programming;

/*0 1 1 2 3 5 8 13 19 34 53  
 * */
public class Fibonacci {
	
	static int n1= 0 , n2 = 1 , n3 = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0 ; i <= 14 ; i++)
		System.out.println(fibooo(i));
	}

	public static void fib(int count) {
		int a = 0 ;
		int b = 1 ;
		int c = 0 ;
		System.out.print(a + "   "+b+"  ");
		 for (int i = 0 ; i<=count ; i++) {
			 c = a + b ;
			 System.out.print(c+"  ");
			 a = b ;
			 b = c;
		 }
		 System.out.println();
		 while(count>0) {
			 c = a+ b;
			 System.out.print(c+" ");
			 a = b;
			 b = c ;
			 count--;
		 }
	}
	
	public static void fibo(int num) {
		if (num > 0) {
			n3 = n1 + n2 ;
			n1 = n2 ;
			n2 = n3 ;
			System.out.println(" "+n3);
			fibo(num-1);
		}
	}
	public static int Test(int num) {
		
		if (num>=5)
		{
			System.out.println("why "+num);
			return num;
		}
		
		return Test(num -1 );
	}
	public static int fiboo(int num) {
		
		if(num <=1) {
			return  num;
		}
//		System.out.println("Returing you ");
		return fiboo(num-1)+fiboo(num-2);
	}
	
	public static int fibooo(int n) {
		
		int[]  f = new int[n+2];
		
		f[0] = 0 ;
		f[1] = 1 ;
		for(int i = 2 ; i <= n ; i++) {
			f[i]= f[i-1]+ f[i-2];
		}
		return f[n];
	}
}
