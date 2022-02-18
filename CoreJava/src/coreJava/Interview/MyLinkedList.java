package coreJava.Interview;

import javax.sql.rowset.serial.SQLOutputImpl;

public class MyLinkedList<E> {
	
	private static class Node<E>{
		Node next;
		Object data;
		Node(Object data){
			this.data = data;
			next = null;
		}
	}
	
	Node head ;
	int size=0;
	
	public void add(E data) {
		
		Node<E> toadd = new Node<E>(data);
		
		if (head == null) {
			head= toadd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toadd;
		size++;
	}
	public String toString() {
		
		Node<E> temp =head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
		return "";
	}
	
	public void remove(int index ) {
		if (index == 0 ) {
			head = head.next;
		}
		else {
			Node<E> temp = head;
			Node nullobj = null;
			for(int i = 0 ; i <index-1 ; i++)
				temp = temp.next; 
			nullobj = temp.next;
			temp.next = nullobj.next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer>  lk = new MyLinkedList<Integer>();
		lk.add(90);
		lk.add(123);
		lk.add(76);
		lk.add(54);
		System.out.println(lk.toString());
		lk.remove(3);
		System.out.println(lk.toString());
		System.out.println(lk.size);
		
		MyLinkedList<String> lk2 = new MyLinkedList<String>();
		lk2.add("Shilpa");
		lk2.add("Wasim");
		System.out.println(lk2.toString());
		 
	}
}
