package day34_inheritance;

public class Rectangle extends Shape{
	
	double sideA;
	double sideB;

	public Rectangle(String color, boolean filled, double sideA, double sideB) {
		super(color, filled);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public void calculateSide() {
		System.out.println("Area of Rectangle is "+ sideA * sideB);
	}
}
