package com.threadlocal;

public class MyClass implements Runnable{
	private ThreadLocal<Integer> tl = new ThreadLocal<>();
	public void run(){
		tl.set((int)(Math.random() * 10D));
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println(tl.get());
	}
}
