package com.day4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day2demos.Employee;

public class HashMapDemo {
public static void main(String[] args) {
	


Employee e1 = new Employee(1121,"Mitesh",43434);
Employee e2 = new Employee(1134,"Rajesh",34333);
Employee e3 = new Employee(4545,"Siya",120000);
Employee e4 = new Employee(7787,"Tini",78000);
Employee e5 = new Employee(565,"Lavina",56000);
Employee e6 = new Employee(112,"Nidhi",67000);

Map<Integer,Employee> map = new HashMap<>();

map.put(e1.getId(),e1);

map.put(e2.getId(),e2);

map.put(e3.getId(),e3);

map.put(e4.getId(),e4);

Set<Entry<Integer, Employee>> set = map.entrySet();

Collection<Employee> emps = map.values();

System.out.println(emps);

Set <Integer> set2 = map.keySet();

System.out.println(set2);

map.replace(e2.getId(),e4);


}
}
