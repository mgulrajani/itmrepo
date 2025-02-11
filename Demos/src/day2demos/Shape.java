package day2demos;

public abstract class Shape {

	private int numberOfSides;

	public Shape(int numberOfSides) {
		super();
		System.out.println("abstract Shape constructor is called");
		this.numberOfSides = numberOfSides;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	@Override
	public String toString() {
		return "Shape [numberOfSides=" + numberOfSides + "]";
	}
	public abstract double calculateArea() ;
	
	
	
}
