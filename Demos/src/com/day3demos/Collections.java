package com.day3demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import day2demos.Employee;

public class Collections {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1121,"Mitesh",43434);
		Employee e2 = new Employee(1134,"Rajesh",34333);
		Employee e3 = new Employee(4545,"Siya",120000);
		Employee e4 = new Employee(7787,"Tini",78000);
		Employee e5 = new Employee(565,"Lavina",56000);
		Employee e6 = new Employee(112,"Nidhi",67000);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		
		employeeList.add(e3);
		
		employeeList.add(e4);
		
		employeeList.add(e5);
		
		employeeList.add(e6);
		
		for (Employee e: employeeList) {
			
			System.out.println(e);
		}
		
		List<Employee> newemps =  List.of(e1,e2,e3);
for (Employee e: newemps) {
			
			System.out.println(e);
		}
		
		//List<Integer> ints =  new LinkedList<>();
		
		List<Integer> newints = List.of(1,2,3,4,5,6);
for (Integer e: newints) {
			
			System.out.println(e);
		}
System.out.println("using iterator .............");
     Iterator<Integer> iterator = newints.iterator();
     
     while(iterator.hasNext()) {
    	Integer i= iterator.next();
    	 System.out.println(i);
     }
     
     List<String> names = new ArrayList<>();
     
     names.add("rishi");
     names.add("divya");
     names.add("chitra");
     names.add("riki");
     
     List<String> newStudents = new ArrayList<>();
     newStudents.addAll(names);
     newStudents.add(1, "chetan");
     
     for(String name:newStudents) {
    	 System.out.println(name);
     }
     System.out.println("set printing details");
     
 Set<String> set1 = new HashSet<>();
     
     set1.add("rishi");
     set1.add("divya");
     set1.add("chitra");
     set1.add("riki");
     
     Set<String> newset = new HashSet<>();
     newset.addAll(set1);
     
     
     for(String name:newset) {
    	 System.out.println(name);
     }
    
	
		//create  a List of names and using iterator display it
	System.out.println("After sorting .. using TreeSet impl of SortedSet interface");
	Set<String> set2 = new TreeSet<>();
    
    set2.add("rishi");
    set2.add("divya");
    set2.add("chitra");
    set2.add("riki");
    
    for(String s:set2) {
    	
    	
    	System.out.println(s);
    }
    
    System.out.println("After sorting .. using TreeSet impl of SortedSet interface");
	Set<Integer> set3 = new TreeSet<>();
    
    set3.add(34);
    set3.add(45);
    set3.add(13);
    set3.add(12);
    
    for(Integer s:set3) {
    	
    	
    	System.out.println(s);
    }
    
    System.out.println("After sorting emps with TreeSet");
    
    Set<Employee> setOfEmps =  new TreeSet<>();
    setOfEmps.addAll(employeeList);
    
    for(Employee e:setOfEmps) {
    	System.out.println(e);
    	
    }
    
    
 System.out.println("After sorting emps with Name COmparator");
    
    Set<Employee> setOfEmps2 =  new TreeSet<>(new NameComparator());
    
    setOfEmps2.addAll(employeeList);
    
    for(Employee e:setOfEmps2) {
    	System.out.println(e);
    	
    }
    
    
    
 System.out.println("After sorting emps with Salary COmparator");
    
    Set<Employee> setOfEmps3=  new TreeSet<>(new SalaryComparator());
    setOfEmps3.addAll(employeeList);
    
    
    for(Employee e:setOfEmps3) {
    	System.out.println(e);
    	
    }
    
    
	}

}
