 /*
 Abstract is the modifier applicable only for methods and classes but not for variables. Even though we don’t have implementation still we can declare a method with an abstract modifier. That is abstract methods have only declaration but not implementation.
 
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 If a class contains at least one abstract method then compulsory the corresponding class should be declared with an abstract modifier. Because implementation is not complete and hence we can’t create objects of that class.
 
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 
 */
 
 abstract class Shape
 {
 	String color;
 	
 	abstract double area();
 	public abstract String toString();
 	
 	public Shape(String color){
 	
 		System.out.println("Shape constructor called ");
 		this.color = color ;
 	}
 	public String getColor()
 	{
 		return color;
 	}
 }
 class Circle extends Shape{
 	
 	double radius ; 
 	
 	Circle(String color , double radius){
 		super(color) ;
 		System.out.println("Circle Constructor Called ");
 		this.radius = radius ;
 	}
 	
 	@Override
 	double area(){
 		return Math.PI*Math.pow(radius,2);
 	}
 	
 	@Override
 	public String toString(){
 		return "Circle color is "+super.getColor()+" and the area = "+area();
 	}
 }
 class Test_Abstract{
 	public static void main(String[]  aa){
 		
// 		Circle c1 = new Circle("white",67);
 		
// 		Shape s1 = new Circle("RED",34.90);
 		Shape s2 = new Circle("Yellow And Green",23.99);
 		
// 		System.out.println(s1.toString());
 		System.out.println(s2.toString());
 	}
 
 }
 
