package com.day3demos.interthreadcomm;

public class Data {
    //instance variable
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Data [message=" + message + "]";
	}

	public Data(String message) {
		super();
		this.message = message;
	}
	
	
	
}
