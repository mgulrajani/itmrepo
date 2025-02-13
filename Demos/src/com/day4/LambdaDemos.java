package com.day4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface Printable{
	void print();
}


public class LambdaDemos {
	public static void main(String[] args) {
		
			
	List<Integer>  list =  Arrays.asList(1,2,3,4,5,6,7);
	Predicate<Integer> p2 =(a)-> a%2==0;
	Consumer<Integer> c2=(intt)->System.out.println(intt);
	
	//list is streamed and filtered using Predicate p2  -even numbers and then print it
	list.stream().filter(p2).forEach(c2);
	
	//or list.stream().filter(p2).forEach(System.out::println);
	
     Printable p1 = ()->System.out.println("printing data");
     
	printDetails(p1);
	
	//create  a Predicate for Strings length more than 5 

	List<String>  names =  Arrays.asList("nidhi","jay","riki","riya","nitin");
	
	
	Consumer<String> c1=(str)->System.out.println(str);
	Function<String,String> toUpperCase=(str1)->str1.toUpperCase();
	Function<String,Integer> returnLength=(str1)->str1.length();
	
	List<String> newList = 
			names.stream().map(toUpperCase).collect(Collectors.toList());
	
	System.out.println(newList);
	
	
		
	}

	private static void printDetails(Printable p1) {
		// TODO Auto-generated method stub
		p1.print();
		
	}
	

}
