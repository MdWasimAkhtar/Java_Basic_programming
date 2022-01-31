class College extends Student
{
	int marks ;
	String dept;
	String address;
	int semester = 4;
	
	College(String name , int rollno , int marks , String dept ){
		super(name , rollno);
		this.marks= marks;
		this.dept = dept;
	}
	College(String name , int rollno , int marks , String dept,String address){
		this(name , rollno , marks , dept);
		this.address = address;
	}
	
	public String toString(){
		return "";
	}
	
	public void display(){
		super.display();
	     System.out.println("Student marks: "+this.marks);
	     System.out.println("Student dept : "+this.dept);
	     System.out.println("Student address :" +this.address);
	}
	
	public void address(String address){
		System.out.println("College Method "+this.address);
	}
   public static void main(String[] aa)
   {
  	 College c1 = new College("WasimAndShilpa",33,89,"CSc");
//  	 c1.display();
//  	 c1.address("Norway");
  	 College c2 = new College("Shilpa ",11,73,"ME","Bangalore");
  	 c2.display();
  	 System.out.println(c2.semester);
   }
 }
 
 /*Because instance variables CANNOT be overridden in Java. In Java, only methods can be overridden."""
 
When you declare a field with the same name as an existing field in a superclass, the new field hides the existing field. The existing field from the superclass is still present in the subclass, and can even be used ... subject to the normal Java access rules.

*/








