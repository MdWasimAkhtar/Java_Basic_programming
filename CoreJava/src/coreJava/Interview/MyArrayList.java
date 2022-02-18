package coreJava.Interview;

import java.util.Arrays;

public class MyArrayList<E> {
	
	Object[] arr;
	int size = 0 ;
	MyArrayList(){
		arr= new Object[10];
	}
	
	public void add(E data) {
		
		if (size == arr.length){
			
			arr = Arrays.copyOf(arr, arr.length+(arr.length/2));
		}
		else {
			arr[size++] = data;
		}
	}

	public String toString() {
		
		String str = "";
		for(Object i : arr) {
			if ( i != null)
			    str = str + i +" , ";
		}
		String str2 = str;
		str2.substring(0,str.length());
		return "["+str2+"]";
	}
	public void remove(int index) {
		if(index<size && index>=0) {
			for(int i = index ; i < size ; i++) {
				arr[i] = arr[i+1];
			}
			size--;
		}
		
	}
	
	public static void main(String[] args)
	{
		MyArrayList<String> list1 = new MyArrayList<String>();
		
//		list1.add(23);
//		list1.add(99);
//		list1.add(78);
//		list1.add(2333);
		list1.add("Shilpa");
		list1.add("Wasim");
		list1.add("Windy");
		list1.add("Silk");
		System.out.println(list1.toString());
		list1.remove(3);
		System.out.println(list1.toString());
		
	}
}
