package com.itmskils.apps;

public class SwapDemo {
	
	public static void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapped values"+a+""+b);
		
		
	}
	
	public static void main(String[] args) {
		
		
		int a=100;
		int b=900;
		
		swap(a,b);
		
		System.out.println("from main"+a+"  "+b);
		
		
	}

}
