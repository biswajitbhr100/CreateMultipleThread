package com.waitnotify;

public class TaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t = new Task();
		t.start();
		synchronized(t){
			try{
				System.out.println("Wating task t to complete...");
				t.wait();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			System.out.println("Sum is :" + t.sum);
		}
	}

}
