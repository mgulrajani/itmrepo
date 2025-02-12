package com.day3demos.synchronizeddemo;

import day2demos.Account;
import day2demos.LessFundException;

public class Person implements Runnable {

	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Person [account=" + account + "]";
	}

	public Person(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		
		try {
			
			for(int i=0;i<3;i++) {
				   
				   account.deposit(1000);
				   Thread.sleep(1000);
				   account.withdrawl(500);
				   System.out.println("account balance "+account.getBalance()+Thread.currentThread().getName());
				   
		}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LessFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   }
	}
	 
	

	
