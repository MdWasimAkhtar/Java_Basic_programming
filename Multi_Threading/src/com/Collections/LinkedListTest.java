package com.Collections;
import java.util.List;
import java.util.LinkedList;

class Book{
	int id;
	String name , author , publisher;
	int quantity;
	
	Book(int id , String name , String author , String publisher , int quantity){
		this.id = id ;
		this.name = name ;
		this.author = author ;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListTest {
	public static void main(String[] args) {
		List<Book> lob = new LinkedList<Book>();
		
		Book b1 = new Book(12,"MousePad","Gery Hobson", "Link by list",300);
		Book b2 = new Book(133,"Basic Thermodynamic","suresh p","SEA",40);
		Book b3 = new Book(90,"Lal Bhadur ","adkh","asdu",12);
		
		lob.add(b1);
		lob.add(b3);
		lob.add(b2);
		
		for(Book i : lob) {
			System.out.println(i.id+" "+i.author+""+i.quantity);
		}
		
	}

}
