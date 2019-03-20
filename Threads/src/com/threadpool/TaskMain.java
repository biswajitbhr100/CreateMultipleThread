package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public interface TaskMain {
	static final int TP_SIZE = 3;
	public static void main(String[] args){
		Runnable r1 = new Task("one");
		Runnable r2 = new Task("two");
		Runnable r3 = new Task("three");
		Runnable r4 = new Task("four");
		Runnable r5 = new Task("five");
		ExecutorService pool = Executors.newFixedThreadPool(TP_SIZE);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
	}
}
