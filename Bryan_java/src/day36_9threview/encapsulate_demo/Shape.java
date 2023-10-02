package day36_9threview.encapsulate_demo;

public class Shape {
	
	String color;

	// parameterize count
	public Shape(String color) {
		this.color = color;
	}
	
	// non-parameterize count
	public Shape () {
		System.out.println("Shape is created");
	}
	
	void draw(int times) {
		for(int i = 0 ; i < times; i++) {
		System.out.println("drawing a shape");
		}
	}
	
}
