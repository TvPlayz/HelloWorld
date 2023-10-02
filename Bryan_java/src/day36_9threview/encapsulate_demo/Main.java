package day36_9threview.encapsulate_demo;

public class Main {

	public static void main(String[] args) {
		Square s1 = new Square("yellow");
		s1.color = "yellow";
		System.out.println(s1.color);
		
		Square s2 = new Square("orange");
		System.out.println(s2.color); // null

		Shape sh1 = new Shape();
		sh1.draw(2);
		s1.draw(3);
		s2.draw(4);
	}

}

