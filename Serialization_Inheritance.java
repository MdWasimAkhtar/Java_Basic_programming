/*
if the parent is serializable then child is automatically seriazable
Serializable nature is Inheriting from parent to child  

but vice-versa is not true

*/
import java.io.*;

class old_Laptop implements Serializable
{
	int ramSize = 4;
	String name ="DELL";
}
class new_laptop extends old_Laptop{
	int ramSize = 16;
	String name = "MAC BOOK";

}

class Serialization_Inheritance{

public static void main(String[]  aa){
	new_laptop nlp = new new_laptop();
	
	try{
		FileOutputStream fos = new FileOutputStream("inherting_ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nlp);
		
		FileInputStream fis = new FileInputStream("inherting_ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		new_laptop nlp2 =(new_laptop)ois.readObject();
		
		System.out.println(nlp2.ramSize);
		System.out.println(nlp2.name);
		
	}catch(IOException e){
	e.printStackTrace();
	}
	catch(ClassNotFoundException e ){
	e.printStackTrace();
	}
}
}

