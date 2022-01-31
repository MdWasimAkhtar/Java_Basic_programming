/*
final method have to have a body
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 error: missing method body, or declare abstract
	final void fun1();
	
if we try to override final method
error: fun1() in Drived cannot override fun1() in Base
	final void fun1(){
	           ^
  overridden method is final
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   We cannot instantiate an abstract class in Java because it is abstract, it is not complete, hence it cannot be used.
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   An abstract class has a protected constructor (by default) allowing derived types to initialize it.
   
   error: Base is abstract; cannot be instantiated
   
*/



abstract class Base
{
	String name ="Base CLass , says i am abstract";
	String points ;
	Base(){
		super();
	}
	
	Base(String points){
	this.points = points;
	}
	abstract void fun();
	final void fun1(){
	System.out.println("Final ask : last minute call");
	System.out.println("points : "+points);
	}
}
class Drived extends Base
{
	Drived(){
	System.out.println("Drived class Constructor ");
	}
	void fun(){
	System.out.println("I was Abstract FUN");
	}
	final void fun33(){
	System.out.println("Twice a call means your late ");
	}
}

class Abstract_01{
	public static void main(String [] aa){
		
//		Base b1 = new Base(); error: Base is abstract; cannot be instantiated
		
		Drived d1 = new Drived();
		d1.fun();
		d1.points="War win wars";
		d1.fun1();
	}

}
