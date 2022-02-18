package CoreJava.pattern;

public class StarPattern {
	public static void main(String[] args) {
//		startP1(6);
		invertedTriangle(5);
		
		invertedTriangle2(5);
	}

	public static void startP1(int num) {
		for (int i = 0; i <= num; i++) {
			
			for (int j = 0; j <= num; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
	
	public static void invertedTriangle(int num)
	{
		for(int i = 0 ; i <= num ; i++)
		{
			for(int j = i ; j <=num ; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void Triangle2(int num)
	{
		for(int i = 0 ; i <= num ; i++)   // rows
		{
			for(int j = 1 ; j <=i ; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void invertedTriangle2(int num)
	{
		for(int i=0 ; i <= num ; i++)
		{
			for(int j = 1 ; j <=i ; j++)
			{
				System.out.print("   ");
			}
			for(int j =i ; j<=num ; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
