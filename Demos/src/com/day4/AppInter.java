package com.day4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppInter {
	public static void main(String[] args) {
		//Inter1 is an interface , 
		Inter1 inter= new Inter1() {public void m2() {System.out.println("annonymously impl inter1");}};
	
	    inter.m2();
	    
	    Inter1 inter2 =()-> System.out.println("hello from inter2");
	    
	    inter2.m2();
	    
	    
	    Runnable r1=()->{ 
	    	
	    	for(int i=0;i<5;i++) {
	    		System.out.println("Hello "+i+Thread.currentThread().getName());
	    		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    	}
	    };
	    Thread t1= new Thread(r1);
	    t1.start();
	    
	    
	
	
	Callable<Integer> call1 = ()->{
		//
		return 100;
	};
	Callable<String> call2= ()->{
		//
		return "welcome to concurrent programming";
	};
	
	ExecutorService service =  Executors.newFixedThreadPool(3);
	
	Future<Integer> intValue = service.submit(call1);
	
	Future<String> strValue = service.submit(call2);
	
	try {
		System.out.println(intValue.get());
		System.out.println(strValue.get());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
}

