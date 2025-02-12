package com.day3demos;

public class PlayerRunnable  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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
