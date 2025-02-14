package com.day3demos.interthreadcomm;

public class Producer implements Runnable{

	private Data data;
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Producer(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (data) {
			System.out.println("Hi ,sending you all a message"+Thread.currentThread().getName());
			
			data.setMessage("Hello there");
			try {
				Thread.sleep(1000);
				data.notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
