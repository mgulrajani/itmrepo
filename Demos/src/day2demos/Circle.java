package day2demos;

public class Circle extends Shape2D{
	
    private double radius;
	public Circle(int numberOfSides, double r) {
		super(numberOfSides);
		this.radius = r;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("computing area of circle with radius "+this.radius);
		return Math.PI *(this.radius*this.radius);
	}
	
	
	public void color() {
		System.out.println("circle is colored green");
	}

}
