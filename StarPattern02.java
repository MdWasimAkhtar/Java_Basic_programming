class StarPattern02
{
	public static void main(String[] aa)
	{
		diamond();
	}
	
	public static void Right_triangle(){
		
		int rows = 5;
		int cols = 5 ;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
		           {
		           	System.out.print(" * ");
		           }
			System.out.println();
		}
	}
	
	public static void Right_triangle_rightSide(){
		
		int rows = 5;
		int cols = 5 ;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = i ; j <= rows ; j++)
		           {
		           	System.out.print("  ");
		           }
		           for(int k = 1 ; k <= i ; k++)
		           {
		           	System.out.print("* ");
		           }
			System.out.println();
		}
	}
	public static void Inverted_half_triangle(){
		int rows = 5 ;
		
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = i ; j<= rows ; j++)
			   {
				System.out.print(j+" ");	   
			   }
			   System.out.println();
		  }	
	}
	public static void Inverted_half_triangle2(){
		int rows = 5 ;
		
		for(int i = rows ; i >=1 ; i--)
		{
			for(int j = 1 ; j<= i ; j++)
			   {
				System.out.print(j+" ");	   
			   }
			   System.out.println();
		  }
	
	}
	public static void Hill_(){
	
		int rows = 5 ;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = i ; j <=rows ; j++)
			   {
			   	System.out.print(" ");
			   }
			   for(int j =1 ; j <= i ; j++)
			   {
			      System.out.print("*");
			   }
			   for(int j = 1 ; j<i ; j++)
			   {
			   	System.out.print("*");
			   }
			   System.out.println();
		}
	}
	public static void diamond(){
		
		int rows = 20 ;
		
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = i ; j <= rows ; j++)
			{
				System.out.print(" ");
			}
			for( int j = 1 ; j <= (2*i)-1 ; j++)
			 {
			 	System.out.print("*");
			 }
		    System.out.println();
		}
		for(int i = rows-1 ; i >=1 ; i--)
		{
			for(int j = rows ; j >= i ; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (2*i)-1 ; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	
	}
	public static void pyramid_triangle(){
		
		int rows = 5;
		int cols = 5 ;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= (2*i)-1 ; j++)
		           {
		           	System.out.print("*");
		           }
		           
			System.out.println();
		}
	}
}
