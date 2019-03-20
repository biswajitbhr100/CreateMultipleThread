package com.threadlocal;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass a = new MyClass();
		Thread x = new Thread(a);
		Thread y = new Thread(a);
		x.start();
		y.start();
		
		try {
			x.join();
			y.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
