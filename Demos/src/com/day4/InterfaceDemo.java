package com.day4;

import java.util.concurrent.Callable;
@FunctionalInterface

interface Inter1{ 
	
	
	void m2();
	
}
//SAM -- Single Abstract Method  - Functional Interface



public class InterfaceDemo implements Inter1{

	

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
	

}


//another way to implement interface -- annonymously





