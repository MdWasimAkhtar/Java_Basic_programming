import java.io.*;
import java.util.Scanner;

class GFG {
	
	// Function to print hollow square
	static void print_square(int n)
	{
		int i, j;
		
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (i == 1 || i == n ||
		j == 1 || j == n || i == j || i+j == n )		
					System.out.print("*");		
				else		
					System.out.print(" ");		
			}
			System.out.println();
		}
	
	}
	public static void pattern01(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter no of cols ");
		int cols = sc.nextInt();
		int k = 1 ;
		for (int i = 1 ; i <= rows ; i++){
			for(int j = 1 ; j<= cols ; j++){
		    	  
		    	   if (i ==j || i+j == cols )
		    	     System.out.print("  "+j);
		    	   else
		    	      System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int rows = 8;
//		print_square(rows);
		pattern01();
	}
}


