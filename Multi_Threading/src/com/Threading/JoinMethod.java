package com.Threading;

public class JoinMethod extends Thread   {
	public static void main(String[] args) throws InterruptedException {
		JoinMethod th1 = new JoinMethod();
		JoinMethod th2 = new JoinMethod();
		JoinMethod th3 = new JoinMethod();
		
		th1.start();
		th1.join();
		th2.start();
		
		th2.join();
		th3.start();
	}
	public void run() {
		System.out.println("name :"+Thread.currentThread().getName());
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
