package com.itmskils.apps;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		
		add(5,5,6);
		
		add(4.5f,5);
		
		add(4,4);
		
		
		
	}
	
	private static void add(double a,double b) {
		System.out.println(a+b);
	}

	/*
	 * private static void add(int a,int b) {
	 * System.out.println("calling add with int and int"); System.out.println(a+b);
	 * } private static void add(float f, int i) { // TODO Auto-generated method
	 * stub System.out.println("calling add with float and int");
	 * System.out.println(f+i); }
	 */

	private static void add(int i, int j, int k) {
		
		System.out.println("calling add method with 3 int parameters");
		// TODO Auto-generated method stub
	System.out.println(i+j+k);
	}

}
