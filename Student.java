class Student
{
	static String College ="SEA COllege ";
	
	int semester = 8;
	
	String  name ;
	int rollno ;
	String address;
	Student(String name , int rollno)
	{
	   this.name = name ;
	   this.rollno = rollno;
	}
	Student(){
	
	}
	
	public String toString(){
	
		return this.name+ "  "+this.rollno;
	}
	
	public void display(){
	
	System.out.println("Student Name :"+this.name);
	System.out.println("Student ROllNo : "+this.rollno);
	}
	
	public void address(String address){
	    this.address = address;
	    System.out.println("Address Method of Student class : "+address);
	}
	
   public static void main(String[] aa)
   {
   	Student s1 = new Student("Shilpa",12);
   	System.out.println(s1);
   	
   	Student s2 = new Student("Wasim",23);
   	s2.display();
   	s2.address("New York, Buffalo");
   }
}
