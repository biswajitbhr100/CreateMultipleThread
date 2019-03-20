package com.thread;

public class MyThread implements Runnable{
	String name;
	Thread t;
	MyThread(String name){
		this.name = name;
		t = new Thread(this,name);
		System.out.println("Thread - " + t);
		t.start();
	}
	public void run(){
		try{
			for(int i = 0 ; i < 5 ; i++){
				System.out.println(name + " -" + i);
				Thread.sleep(1000);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
