package day5.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import day2demos.Employee;

public class SerializationDemo {
	
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
	
	
	try(ObjectOutputStream oos = 
		new ObjectOutputStream(new FileOutputStream("d:\\mkg\\employeedata.txt"));
		ObjectInputStream ois = 
		new ObjectInputStream(new FileInputStream("d:\\mkg\\employeedata.txt"));){
		
		oos.writeObject(employeeList);
		System.out.println("written the data on to the file");
		
		List<Employee> list = (List<Employee>)ois.readObject();
		System.out.println(list);
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	employeeList.add(e6);
}}

