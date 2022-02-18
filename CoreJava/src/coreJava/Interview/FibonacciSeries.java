package coreJava.Interview;

//0 1 1 2 3 5 8 13 21 34 55
public class FibonacciSeries  {
	 public static void main(String[] args) {
		fib(15);
	}
	 public static void fib(int count) {
		 int a = 0 ;
		 int b = 1;
		 int c = 0 ;
		 System.out.print(a+" , "+b+" , ");
		 for(int i = 1 ; i <= count ; i++) {
			
			 c= a + b ;
			 System.out.print(c+" ,  ");
			 a = b;
			 b =c ;
		 }
	 }
}
