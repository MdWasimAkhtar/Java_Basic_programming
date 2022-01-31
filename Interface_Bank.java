interface IRS
{
	 public float rateOfInterest();

}

interface GovtOfIndia
{
//	 public void checker();
	 public float rateOfInterest();
}

interface Bank extends GovtOfIndia, IRS{

	public float rateOfInterest();
	
	public static int cube(int x ){
		return x*x*x;
	}
	default void display(){
		System.out.println("display method default");
	}
}

class SBI implements Bank
{
	public float rateOfInterest(){
		return 6.13f;
	}
}

class ICICI implements Bank
{
	public float rateOfInterest(){
		return 9.8f;
	}
}

class Canara implements Bank , GovtOfIndia
{
	public float rateOfInterest(){
	return 5.6f;
	}
}

class Kotak implements Bank, GovtOfIndia
{
	public float rateOfInterest(){
		return 10.10f;
	}
}

class Interface_Bank 
{
	public static void main(String[] aa)
	{
		Bank b1 = new ICICI();
		System.out.println(b1.rateOfInterest());
		
		Bank b2 = new Kotak();
		System.out.println(b2.rateOfInterest());
		
		Bank b3 = new SBI();
		System.out.println(b3.rateOfInterest());
		b3.display();
		System.out.println(Bank.cube(9));	
	}
}

