package LabTest2;
//implementing the interface shape in class Area
public class Area implements Shape{
	//Declare the static variable PI
	static double PI=3.14;
	//declare instance variables
	private int length,breadth,side,radius;
	//Default constructor
	public Area() {
		super();
		
	}
	//Parameterized constructor
	public Area(int length, int breadth, int side, int radius) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.side = side;
		this.radius = radius;
	}
	//override the abstract methods
	@Override
	public void rectangleArea() {
		
		System.out.println("Area of triangle is: "+(length*breadth));
		
	}

	@Override
	public void squareArea() {
		System.out.println("Area of Square is: "+(side*side));
		
	}

	@Override
	public void circleArea() {
		System.out.println("Area of circle is: "+(PI*radius*radius));
		
	}
	//getter and setter methods
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
