package day34_inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle("Red", true, 5);
		
		System.out.println(c.getColor());
		
		System.out.println(c.getFilled());
		
		c.calculateArea();
		
		Rectangle r = new Rectangle("Black", false , 10 , 6);
		
		System.out.println(r.getColor());
		System.out.println(r.getFilled());
		r.calculateArea();
		
		System.out.println(c.toString());
		System.out.println(r.toString());
	}

}
