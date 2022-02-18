package com.Threading;

public class MyThread implements Runnable {
	
	public void run() {
		System.out.println("run method of Runnable  Interface "+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	
	Thread t2 = new Thread("My first  Thread ");
	t2.start();
	System.out.println(t2.getName());
	
	//using runnable interface
	
	MyThread t3 = new MyThread();
	Runnable r3 = new MyThread();
	
	Thread th1 = new Thread(r3 , "r3 runnable thread ");
	th1.start();
}
}
