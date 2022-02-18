package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Student2 {
	int rollno ;
	String name ;
	int age;
	
	Student2(int rollno , String name , int age){
		this.rollno = rollno;
		this.name = name ;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student2>{
	
	public int compare(Student2 s1 , Student2 s2) {
		
		if (s1.age == s2.age)
			return 0;
		else if(s1.age > s2.age)
			return 1 ;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student2>{

	public int compare(Student2 s1 , Student2 s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class Comparator_ {
	public static void main(String[] args) {
		ArrayList<Student2> al1 = new ArrayList<Student2>();
		Student2 s1 = new Student2(12,"Shilpa",34);
		al1.add(s1);
		al1.add(new Student2(13,"Wasim",25));
		al1.add(new Student2(14,"Windy",30));
		System.out.println("Sorting by Age");
		Collections.sort(al1,new AgeComparator());
 
		
		for(Student2 i : al1)
			System.out.println(i.age+"  "+i.rollno+"   "+i.name);
		
		System.out.println("Sorting by name ");
		Collections.sort(al1,new NameComparator());
		
		for(Student2 i : al1)
			System.out.println(i.age+"  "+i.name+"  "+i.rollno);
	}
	}
