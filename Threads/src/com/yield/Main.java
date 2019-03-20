package com.yield;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new Producer();
		Thread b = new Consumer();
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
	}

}
