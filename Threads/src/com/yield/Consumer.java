package com.yield;

public class Consumer extends Thread{
	public void run(){
		try{
			for(int i = 0 ; i < 5 ; i++){
				//Thread.sleep(1000);
				System.out.println("I am consumer :" + i);
				Thread.yield();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
