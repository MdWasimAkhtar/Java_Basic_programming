/*
A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object. A marker interface is also called a tagging interface
*/
/*
the process of writing state of an Object to a file is called Serialization ,  The process of converting an Object from java supported form into either file supported from or network supported form .

we can implement serialization by FileOutputStream and ObjectOutputStream  classes we can achieve 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.

To make a Java object serializable we implement the java.io.Serializable interface.
The ObjectOutputStream class contains writeObject() method for serializing an Object.

public final void writeObject(Object obj)
                       throws IOException
                       
The ObjectInputStream class contains readObject() method for deserializing an object.

public final Object readObject()
                  throws IOException,
               ClassNotFoundException
               
Advantages of Serialization
1. To save/persist state of an object.
2. To travel an object across a network.

*/


import java.io.*;

/*
java.io.NotSerializableException: MyLaptop
*/

class MyLaptop implements Serializable
{
	int ramsize = 32;
	String name = "Apple Mac ";
	transient double price = 200000;
	transient static String location = "New York";
	transient final String owner = "Shilpa kumari ";
}
class Serialization_01  
{
    public static void main(String[] aa)
    {
    	MyLaptop lp = new MyLaptop();
    	try{
    		FileOutputStream fos = new FileOutputStream("mylp.ser");
    		ObjectOutputStream oos = new ObjectOutputStream(fos);
    		oos.writeObject(lp);
    		
    		//DeSerialization
    		
    		FileInputStream fis = new FileInputStream("mylp.ser");
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		MyLaptop lp2 = (MyLaptop)ois.readObject();    		System.out.println("ramsize = "+lp2.ramsize);
    		System.out.println("name = "+lp2.name);
    		System.out.println("Price = "+lp2.price);
    		System.out.println("location = "+lp2.location);
    		System.out.println("owner : "+lp2.owner);
    	}
    	catch(IOException e){
    	e.printStackTrace();
    	}
    	catch(ClassNotFoundException ex){
    		ex.printStackTrace();
    	}
    
    }
}

/*we can serialize only seializable Object , an Object is said to be seriazble iff the corresponding class inplements serializable
interface 
serializable interface present in java.io.*; package and it doesn't contain any method it is marker interface

if we are trying to serializae a non serializable objects then we will get run time exception saying java.io.NotSerialzableException
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
transient keyword only applicable variable ,  not for method
 transient means not to serialize
 
 sensitive information , if we don't want to save the value of variable then we can declare that variable transient and jvm ignore the origional value of the var and save default val to the file 
 
 transient vs static 

 static var is not part of Object state , so static var will not particite in serilization ,so the declaring static variable transient will effect , there is no use
 
 final vs transient 
 ~~~~~~~~~~~~~~~~~~~~~~~~~~
 final var will be replace by the value at complie time only 
 normal var replace by the value at runtime 
 
 final variable is in value form at complie time , will participate in seriablization will directly with value 
 there is no impect
 
*/
