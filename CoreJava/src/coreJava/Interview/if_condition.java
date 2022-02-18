package coreJava.Interview;

import java.util.*;
import java.text.DecimalFormat;

public class if_condition {
	public static void main(String[] args) {
		
		power_();
	
	}
	
	public static void formatting() {
	
		DecimalFormat ft = new DecimalFormat();
		ft = new DecimalFormat("000");
		
		//if_condition.conditional();
		
	//	decimalFormat_Number();
		
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
  //           System.out.print(String.format("%6s        %6.2d ",s1 , ft.format(x)));
  //           String item = String.format("%-6s %#7.2f ",s1,ft.format(x));
  //           System.out.println(ft.format(x));
         //    System.out.println(item);
             
    //         System.out.printf("%-15s %s\n", s1, ft.format(x));
             System.out.printf("%-15s%03d%n",s1,x);
         }
         System.out.println("================================");

		

	}
	public static void scan_() {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
	public static void conditional() {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
        if (N % 2 == 0 ){
            if(N>=2 && N<=5)
            System.out.println("Not Weird");
            else if (N >=6 && N <=20)
            System.out.println("Weird");
            else if (N>20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
		
	}

	public static void decimalFormat_Number() {
		DecimalFormat  ft = new DecimalFormat();
		
		int n1 = 65;
		int n2 = 50;
		
		ft = new DecimalFormat("000");
		System.out.println("number is : "+ft.format(n1));
		System.out.println("2nd Number is : "+ft.format(n2));
		
	}
	
	public static void power_(){
		  Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int calc = a;
	            for(int j=0;j<n;j++)
	            {
	                calc+=(Math.pow(2,j)*b);
	                System.out.print(calc+" ");
	            }
	            System.out.println();
	        }
	        in.close();
	    }
	}

