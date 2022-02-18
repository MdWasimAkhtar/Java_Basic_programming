package com.Exception;

import java.io.IOException;

public class Throws_throw {
	
	void m() throws IOException{
		throw new IOException("Device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e ) {
			System.out.println("Exception handled ");
		}
	}
	public static void main(String[] args) {
		Throws_throw th = new Throws_throw();
		th.p();
		System.out.println("normal flow ");
	}

}
