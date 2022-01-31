/*

*/
interface showable
{
  public void printing();
  public void display();

}
interface printable
{
     int x = 100;
     void printing();
}

class Interface_ implements printable , showable
{
	public void printing(){
		System.out.println("Interface printing method ");
	}
	
	public void display(){
	double price  = 9000.99;
	System.out.println("price of : "+price);
	}
	
	public static void main(String[] aa){
	
		Interface_ ii = new Interface_();
		ii.printing();
//		ii.x = 900;  error: cannot assign a value to final variable x
		System.out.println(ii.x);
	}

}

