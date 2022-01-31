

class Exception_handling
{
	public static void main(String[] aa){
		
		int x = 100;
		String str = null;
		double arr[] = {12.89,90,78.2,67 , 1212};
		String str2 = "Shilpa";
		
		
		try{
			System.out.println(x/2);
			try{
				System.out.println(str);
			}catch(StringIndexOutOfBoundsException e ){
				System.out.println("String index Out of Bounds Exception Occurs");
			}
		}
		catch(ArithmeticException e  ){
			System.out.println("Dividing be zero is not possible");
//			e.printStackTrace();
		}
	}
}
