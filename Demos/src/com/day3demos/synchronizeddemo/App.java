package com.day3demos.synchronizeddemo;

import day2demos.Account;

public class App {
public static void main(String[] args) {
	
	Account rishi = new Account(111, 34000);
	
	Account divesh =  new Account(222,23000);
	
	Runnable p1 = new Person(rishi);
	
	Runnable p2 = new Person(rishi);
	
	Thread t1 = new Thread(p1,"Rishi Account Used by Person p1");
	Thread t2 =  new Thread(p2,"Rishi Account used by Person p2");
	
	t1.start();
	t2.start();
	
	System.out.println(rishi.getBalance());
	
}
}
