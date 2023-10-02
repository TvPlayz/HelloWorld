package day34_inheritance;

public class Circle extends Shape{
	
	double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public void calculateArea() {
		double area = Math.PI * radius *radius;
		
		System.out.println("Area of the cirlce is "+ area);
	}
	
	
	
	
}
