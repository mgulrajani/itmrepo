package com.day3demos.interthreadcomm;

public class App {
	
	public static void main(String[] args) {
		
		Data data = new Data("Java MultiThreading ");
		
		Runnable p1 = new Producer(data);
		
		Runnable c1 = new Consumer(data);
		
		Runnable c2 = new Consumer(data);
		Runnable c3 = new Consumer(data);
		
		Thread t1 =  new Thread(p1,"Producer");
		Thread t2 =  new Thread(c1,"Consumer1");
		Thread t3 =  new Thread(c2,"Consumer2");
		Thread t4 =  new Thread(c3,"Consumer3");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
