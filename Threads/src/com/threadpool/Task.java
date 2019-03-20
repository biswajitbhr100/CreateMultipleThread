package com.threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{
	String name;
	Task(String name){
		this.name = name;
	}
	public void run(){
		try{
			for(int i = 0 ; i < 5 ; i++){
				if(i == 0){
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization time of " + name + " is" + sdf.format(d));
				}else{
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Execution time of " + name + " is" + sdf.format(d));
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " -Task complete");
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			System.out.println("Every Task Completed");
		}
	}
}
