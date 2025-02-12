package com.day3demos.interthreadcomm;

public class Consumer implements Runnable{

	private Data data;
	
	public Consumer(Data data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Consumer [data=" + data + "]";
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Waiting for messages from Producer");
		try {
			
			synchronized (data) {
				
				data.wait(2000);
				
				System.out.println("Received the data "
				+Thread.currentThread().getName()
				+data.getMessage());
				Thread.sleep(1000);
							
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
