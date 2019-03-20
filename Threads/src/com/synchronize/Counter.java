package com.synchronize;

public class Counter {
	long count = 0;
	public synchronized void add(long val){
		this.count += val;
	}
}
