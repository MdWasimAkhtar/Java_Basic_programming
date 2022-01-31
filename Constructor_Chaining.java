class Super_Constructor{
	
	String college_name ;
	Super_Constructor(){
		super();
	}
	Super_Constructor(String college_name){
		this.college_name = college_name;
	}
	
	public void display(){
		System.out.println("PArent class display() : printing    "+college_name);
	}
}

class Constructor_Chaining extends Super_Constructor
{
	int a , b , c ;
	String name;
	String course;
	
//	String college_name = ":  MIT University  : ";
	
	Constructor_Chaining(String college_name){
		super(college_name);
		System.out.println("One args constr. ");
	}
	Constructor_Chaining(int a ){
		this.a = a;
	}
	
	Constructor_Chaining(int a , int b){
		this(a);
		this.b = b ;
		System.out.println("two args constr. ");
	}
	
	Constructor_Chaining(int a , int b , String name){
		
		this(a,b);
		this.name = name ;
		System.out.println("three args constr. ");
	}
	
	Constructor_Chaining(int a , int b , int c , String name , String course){
		this(a,b,name);
		this.c = c ;
		this.course = course;
	}
	public String toString(){
		return a+" "+b+" "+name+" "+super.college_name;
	}
	public String toString(String abc ){
		return a+" "+b+" "+name+"  "+course;
	}
	
		public void display(){
	
		System.out.println("child class display method : "+college_name);
	}
	
	
	
	public static void main(String[] aa){
		Constructor_Chaining cc = new Constructor_Chaining(10,20);
		System.out.println(cc);
		
		Constructor_Chaining cc2 = new Constructor_Chaining(50,1000,"MD WASIM AKHTAR ");
		System.out.println(cc2);
		
		Constructor_Chaining cc3  = new Constructor_Chaining(300,230,500,"Shilpa","CSC");
		System.out.println(cc3.toString("abc"));
		
		Constructor_Chaining cc4 = new Constructor_Chaining("SEA");
		cc4.display();                            // if Overridden method is there in child class then it call child class , if not the parent class method 
		
		Super_Constructor sc1 = new   Constructor_Chaining("  Cambridge International College ");
		
		sc1.display();
	}
}
