package day35_polymorphism;

public class TestArea {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
//		Superclass variableName = new Subclass();
		
		Shape triangle = new Triangle();
		
		Shape circle = new Circle();
		
		shape.calculateArea();
		triangle.calculateArea();
		circle.calculateArea();
		
	}
}
