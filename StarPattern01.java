import java.util.Scanner;

class StarPattern01
{
	public static void main(String[] aa)
	{
		StarPattern01.pattern1();		
	
	}
	
	public static void pattern1()
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter no. of rows ");
	  int rows = sc.nextInt();
	  System.out.println("Enter no.of cols");
	  int cols = sc.nextInt();
		for ( int i = 1 ; i <= rows ; i++)
		    {
		     	for( int j = 1 ; j <= cols ;j++)
		     	    {
		     	       if( i == 1 || i == rows || j ==1 || j==cols)
		     	           System.out.print("*");
		     	       else
		     	          System.out.print(" ");
		     	     }
		     	     System.out.println();
		     }
           }
           
}

