package com.itmskils.apps;

public class MultiplicationTable {
	
	public static void generateTable(int a) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
	
    public static void main(String[] args) {
		
    	generateTable(4);
    	generateTable(6);
    	generateTable(89);
	}
}
