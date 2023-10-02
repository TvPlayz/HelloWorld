package day36_9threview.encapsulate_demo;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle (2,3,2);
		
		System.out.println("Area of r1: " +r1.getArea());
		
		r1.setWidth(-3);
		
		System.out.println(r1.getWidth());
		System.out.println(r1.getArea());
		System.out.println(r1.getTotalPrice());
			
		
	}

}
