package com.itmskils.apps;

public class SwapByReference {

	public static void main(String[] args) {
		
		Data d1 = new Data(11);
		
		Data d2 = new Data(15);
		
		swapObjects(d1,d2);
		
		System.out.println("after swapping in main method " +d1.x+" "+d2.x);
	}

	private static void swapObjects(Data d1, Data d2) {
		Data temp=new Data(0);
		temp.x =  d1.x;
		d1.x =d2.x;
		d2.x =temp.x;
		
		System.out.println("after swapping in the method "+d1.x+ " "+d2.x);
		
	}
}
