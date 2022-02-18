package CoreJava.pattern;

/*the number that can divide 
 * by 1 and itself
 * only two factor 1 and itself
 * 
 * */

public class PrimeNumber {
	public static void main(String[] args) {
		for( int i = 20 ; i <=50 ; i++) {
			checkPrime(i);
		}
	}

	public static void checkPrime(int num) {
		
		int count= 0 ;
		for( int i = 1 ; i <=num ; i++)
		{
			if (num % i == 0) {
				count++ ;
			}
		}
		if(count ==2 )
			System.out.println(" "+num);
		
	}
}
