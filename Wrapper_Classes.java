/*
 byte, short, int, long, float, double, char and boolean. When a primitive data type is stored, it is the stack that the values will be assigned. When a variable is copied then another copy of the variable is created and changes made to the copied variable will not reflect changes in the original variable.
 
 Object Data Type: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 the non-primitive ones are created by the users in Java. Examples include arrays, strings, classes, interfaces etc. When the reference variables will be stored, the variable will be stored in the stack and the original object will be stored in the heap. In Object data type although two copies will be created they both will point to the same variable in the heap, hence changes made to any variable will reflect the change in both the variables. 
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Properties	        Primitive data types	                                                         Objects
Origin	             Pre-defined data types	                                                             User-defined data types
Stored structure	Stored in a stack	            Reference variable is stored in stack and the original object is stored in heap
When copied	Two different variables is created along with different assignment(only values are same)	Two reference variable is created but both are pointing to the same object on the heap
When changes are made in the copied variable	Change does not reflect in the original ones.	Changes reflected in the original ones.
Default value	Primitive datatypes do not have null as default value	The default value for the reference variable is null
Example	byte, short, int, long, float, double, char, boolean	array, string class, interface etc.

 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing
 
 
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 Hashcode is a number used by JVM for hashing in order to store and retrieve the objects. For example, when we add an object in hashmap, JVM looks for the hashcode implentation to decide where to put the object in memory. When we retrieve an object again hashcode is used to get the location of the object. Note that hashcode is not the actual memory address but its a link for JVM to fetch the object from a specified location with a complexity of O(1).
 
 almost all wrapper class containe two constructor one can take corresponding as arguements and the Other can take String as Arguments
 
 Integer i  = new Integer(10);
 Integer i2 = new Integer("10");
 Integer i3 = new Integer("ten");//RTE 
*/
class Wrapper_Classes
{
	public static void main(String[] aa)
	{
		Wrapper_methods();
	}

	public static void Wrapper_methods(){
		 Integer i  = new Integer(10);
		 Integer i2 = new Integer("10");
		 System.out.println(i+"     "+i2);
		 
		 Double d = Double.valueOf(90.89);
		 Boolean b = Boolean.valueOf(true);
		 System.out.println(d +"    "+b);
		 
		 Integer I = Integer.valueOf("1111", 2);
      		System.out.println(I);
        	Integer I1 = Integer.valueOf("1111", 4);	
	        System.out.println(I1);
	        
	        Double w1 = Double.valueOf(78.1);
	        System.out.println(w1);
	        System.out.println(w1.doubleValue());
	        
	//xxxValue() to wrapper to primitive type        
        Integer I3 = new Integer(130);
        System.out.println(I3.byteValue());
        System.out.println(I3.shortValue());
        System.out.println(I3.intValue());
        System.out.println(I3.longValue());
        System.out.println(I3.floatValue());
        System.out.println(I3.doubleValue());
        
        //parseXxx() method : We can use parseXxx() methods to convert String to primitive. There are two types of parseXxx() methods
        
        int i22 = Integer.parseInt("10");
        double d2 = Double.parseDouble("23.12");
        boolean b3 = Boolean.parseBoolean("true");
        System.out.println(i22+"   "+d2 + "  "+b3);
        
       // toString() method:We can use toString() method to convert Wrapper object or primitive to String. There are few forms of toString() method:
//public String toString() : Every wrapper class contains the following toString() method to convert Wrapper Object to String type.
		
		Integer I33 = new Integer(10);
	        String s = I33.toString();
        	System.out.println(s);

	}
}
