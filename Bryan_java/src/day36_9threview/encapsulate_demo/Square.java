package day36_9threview.encapsulate_demo;

public class Square extends Shape{
	// if parent has param.. constructor
	// child class must implement the super();
//	public Square(String color) {
//		// parent constructor
//		// Shape("yellow");
//		super(color);// has to be on the first statement
//		System.out.println("square is created");
//	}
	
	public Square(String color) {
		this.color = color;
	}
	
	void draw(int times) {
		System.out.println("drawing a "+ this.color +" square");
	}
	
}