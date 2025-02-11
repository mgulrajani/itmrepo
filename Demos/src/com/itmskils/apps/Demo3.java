package com.itmskils.apps;

public class Demo3 {
	//instance variable
	int num1;
	
	//class /static variable 
	static int ctr=0;
	
	
	
	public static int add(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public int multiply(int a,int b) {
		return a*b;
		
	}
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println("Difference is" +(a-b));
        add(3,4);
        Demo3 d3 = new Demo3();
        Demo3 d4 = new Demo3();
        
        System.out.println(Demo3.ctr);
        
        
        d3.multiply(3, 4);
        d4.multiply(5,6);
        
		
	}

}
