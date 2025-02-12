package com.day3demos.interthreadcomm;

public class Consumer implements Runnable{

	private Data data;
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
