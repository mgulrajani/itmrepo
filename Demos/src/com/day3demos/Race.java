package com.day3demos;

public class Race {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread();
		
		Player sam = new Player("Sam");
		
		sam.start();
		
		Player alex = new Player("Alex");
		Player tom = new Player("Tom");
		alex.start();
		tom.start();
		
	}

}
