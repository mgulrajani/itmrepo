package day2demos;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	//instance variables
	//Employee has a id of int type
	private int id;
	@Override
	public int hashCode() {
		return Objects.hash(doj, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return  id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	private String name;
	private LocalDate doj;
	//Employee has  a dept of Department type
	static public Department dept;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", salary=" + salary + "]";
	}
	private double salary;
	private Integer i;
	
	
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
	public Employee(int i, String name) {
		this.id = i;
		this.name=name;
	}
	public Employee(int i, String name, double salary) {
		
		super();
		this.id = i;
		this.name = name;
		
		this.salary = salary;
		// TODO Auto-generated constructor stub
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
	@Override
	public int compareTo(Employee e2) {
		// TODO Auto-generated method stub
		if (this.id ==  e2.getId())
			return 0;
		else if (this.id > e2.getId()) {
			return 1;
		}
		else return -1;
		
	}


	


}