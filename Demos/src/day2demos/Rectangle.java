package day2demos;

public class Rectangle extends Shape2D{
public Rectangle(int numberOfSides, double l,double b) {
		super(numberOfSides);
		this.length = l;
		this.breadth = b;
		// TODO Auto-generated constructor stub
	}

private double length;
private double breadth;

	@Override
	public double calculateArea() 
	{
		System.out.println("Computing area of the rectangle with "+this.length + " "+this.breadth);
		// TODO Auto-generated method stub
		return this.length *this.breadth;
	}
	
	public void draw() {
		System.out.println("rectangle is drawn with "+this.length +" "+this.breadth);
	}

}
