package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rollno ;
	String name ;
	int age;
	
	Student(int rollno , String name , int age){
		this.rollno = rollno;
		this.name = name ;
		this.age = age;
	}
	public int compareTo(Student st) {
		if (age == st.age)
			return 0 ;
		else if (age>st.age)
			return 1 ;
		else
		    return -1;
	}
}

public class Comparable_Student {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(12,"Shilpa",34));
		al.add(new Student(13,"Wasim",25));
		al.add(new Student(14,"Windy",30));
		
		Collections.sort(al);
		
		for(Student i : al)
			System.out.println(i.age+"  "+i.rollno+"   "+i.name);
	}

}
