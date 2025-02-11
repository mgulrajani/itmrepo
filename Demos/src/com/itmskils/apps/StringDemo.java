package com.itmskils.apps;

public class StringDemo {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder()	;
		
		sb1.append("hello java world");
		
		sb1.append("in the string mutation class");
		
		System.out.println(sb1.hashCode());
		
		sb1.insert(11, "amazing");
		
		System.out.println(sb1.hashCode());
		
		
		String s = "hello";
		
		System.out.println(s.hashCode());
		
		s=s+"world";
		
		System.out.println(s.hashCode());
		
		String s1 =s;
		
		System.out.println(s1.hashCode());
		
		if (s1 == s) {
			
			System.out.println("pointing to the same object");
		}
		else {
			System.out.println("diff objects");
		}
		
		
	}

}
