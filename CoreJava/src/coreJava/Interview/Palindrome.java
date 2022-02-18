package coreJava.Interview;
import java.util.*;

public class Palindrome {
	public static void pal_D() {
		int num = 2002;
		int temp= num  ,  rem , res = 0 ;
		while(temp != 0 ) {
			
			rem = temp %10 ;
			res = res *10 + rem;
			temp /= 10;
			
		}
		System.out.println("origional num : "+num);
		if (res == num)
			System.out.println("yes palindrome num after Reversing  : "+res);
		else
			System.out.println("Not a palindrome");
	}
	
	public static void String_pal() {
		
		String str = "FiiiiF";
		String  rev_str = "";
		for(int i = str.length()-1 ; i >=0 ; i--) {
			rev_str = rev_str+ str.charAt(i);
		}
		System.out.println(rev_str);
	}
	public static void leap_year() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a year to check leap year or not ");
			int num = sc.nextInt();
		
			if(num%4==0 && num%100 != 0 || num %400 == 0 )
				System.out.println("Yes The Given Year is Leap year ");
			else
				System.out.println("Not a leap year ");
			
			System.out.println("Do you want to check one more year{yes/no} ");
			String option = sc.next();
			if(option.equalsIgnoreCase("no"))
				break;
		}
	}
	public static void main(String[] args) {
		
		leap_year();
	}

}
