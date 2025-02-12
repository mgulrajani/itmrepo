package com.day3demos;

//Player is a Thread
public class Player extends Thread{
	
	
	public Player(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() { 
		
		for(int i=0;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		
		
		
	}

}
