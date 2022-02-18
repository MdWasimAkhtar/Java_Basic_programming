package coreJava.Interview;

public class PrimeNumber {
	public static void main(String[] args) {
		
		for(int i =200 ; i<=360; i++) {
			checkPrime(i);
		}
	}
	
	public static void checkPrime(int num) {
		int count = 0 ;
		for ( int i  = 1 ; i <= num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count ==2)
			System.out.println("yes its prime Number : "+num);
	}

}
