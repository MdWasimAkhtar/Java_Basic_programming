import java.io.*;

class Get_job implements Serializable{
	Car_ car = new Car_();
	
	public void m1(){
	System.out.println("Get job");
	}
}

class Car_ implements Serializable{
	
	Be_healthy b1 = new Be_healthy();
	public void m1(){
	System.out.println("Be helhty man ");
	}
}

class Be_healthy implements Serializable{
	
	double price = 12000.89;
	String name = "MD WASIM AKHTAR";

}


class Serialization_02
{
	public static void main(String[] aa)
	{
		Get_job j1 = new Get_job();
		
		try{
			FileOutputStream fos = new FileOutputStream("Get_a_job.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(j1);
		
		//Deserialize
		FileInputStream fis = new FileInputStream("Get_a_job.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Get_job j2 = (Get_job)ois.readObject();
		j2.m1();
		System.out.println(j2.car.b1.name);
		}catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException ex){
		ex.printStackTrace();
		}
	}
}
/*
we can serializae any number of Object to the file but in which order we serialized in the same order only we have to deserialzed 

order of object is important is serialization 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
What is Object Graph?
An Object Graph is the set of objects which will be serialized automatically, if the object which contains reference to them is serialized.
In other words, we can say that when we serialize any object and if it contains any other object reference then JVM serializes the object and as well as its object references.

*/

