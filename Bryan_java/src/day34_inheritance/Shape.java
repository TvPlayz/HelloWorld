package day34_inheritance;

public class Shape {

	private String color;
	private boolean filled;
	
	public Shape() {}
	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean getFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	public void calculateArea() {
		System.out.println("Area of a Shape");
	}
	
	
}
