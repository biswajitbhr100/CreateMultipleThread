package com.waitnotify;

public class Task extends Thread{
	int sum = 0;
	public void run(){
		synchronized(this){
			for(int i = 0 ; i < 100 ; i++){
				sum += i;
			}
			notify();
		}
	}
}
