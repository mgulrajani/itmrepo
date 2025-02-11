package day2demos;

import java.time.LocalDate;

public class Employee {
	//instance variables
	//Employee has a id of int type
	private int id;
	private String name;
	private LocalDate doj;
	//Employee has  a dept of Department type
	static public Department dept;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", salary=" + salary + "]";
	}
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, LocalDate doj, Department dept, double salary) {
		super();
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee(int id, String name, LocalDate doj, Department dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	


}