package com.yield;

public class Producer extends Thread{
	public void run(){
		try{
			for(int i = 0 ; i < 5 ; i++){
				//Thread.sleep(1000);
				System.out.println("I am producer :" + i);
				Thread.yield();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
