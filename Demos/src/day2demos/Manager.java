package day2demos;

import java.time.LocalDate;

//Manager is a Employee
public class Manager  extends Employee{

	private String perks;
	
	public Manager(int id,String name, Department d , LocalDate doj,double salary, String perks) {
		
		super(id,name,doj,d,salary);
		this.perks=perks;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [perks=" + perks + ", ]";
	}
	
	
	
}
