package com.Threading;
import java.util.Scanner;
import java.util.Set;

public class Test_Threading implements Runnable  {
	
	public void run() {
	
		System.out.println("Id Of Thread"+Thread.currentThread().getId());

	try {
		Thread.sleep(123,900);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
  }
	public static void main(String[] args) throws InterruptedException {
		Test_Threading th1  = new Test_Threading();
		
		Thread t1 = new Thread(th1);
		System.out.println(t1.getState());
		t1.start();
		
		System.out.println("thread state --"+t1.getState());
		
		Thread t3 = new Thread(new Test_Threading());
		System.out.println("Thread t3 state : "+t3.getState());
		t1.join();
		t3.start();
		System.out.println("t3 state : "+t3.getState());
		
		for ( int i = 0 ; i <5 ; i++) {
			Thread t2 = new Thread(new Test_Threading());
			
			t2.setName("My Thread : "+i);
			t2.start();
		}
		
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
		for(Thread t : threadSet) {
			System.out.println("Thread "+t+"  : "+"thread status : "+t.getState());
		}
	}
	
}
