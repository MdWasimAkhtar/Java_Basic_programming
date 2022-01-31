// 0 1 1 2 3 5 8 13 21 34 55 

class Fibonacci{

	static int a = 0 ;
	static int b = 0 ;
	static int c = 0 ;
public static void main(String[] aa){
	
	for(int i = 1 ; i <= 15 ; i++)
	     System.out.print(Fibonacci.fibo3(i)+" , ");
  }
  public static void fibo(int count){
  	int a =0 ;
  	int b = 1;
  	int c = 0;
  	
  	for ( int i =1 ; i <= count ; i++)
  	{
  		 c = a+ b ;
  		 System.out.print(c+" ,");
  		 a = b ;
  		 b = c;
  	}
  
  }
  
  public static void fibo2(int count){
  	int a = 0 ;
  	int b = 1 ;
  	int c = 0 ;
  	while(count>0)
  	{
  	 	c = a+ b;
  	 	System.out.print(c+" , ");
  	 	a = b ;
  	 	b = c;
  	 	count--;
  	 }
  }
  
  public static int  fibo3(int count)
  {
  	 if( count <= 1 )
  	 	return count ;
  	 else
  	 return fibo3(count-1) + fibo3(count - 2);
  }
}
