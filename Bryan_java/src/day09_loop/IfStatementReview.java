package day09_loop;

public class IfStatementReview {
	
	public static void main(String[] args) {
		
		int value = 10;
		
		if (value < 10) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
		System.out.println("line number 14");
		
		
		if (value > 1)
			System.out.println("Hello");
		else
			System.out.println("Hi");
		System.out.println("line number 21");
		
		System.out.println("---------------------");
		int y = 5;
		if (y < 1) {
			System.out.println("Line number 25");
		}
		
		if (y < 1) {
			System.out.println("Line number 30");
		}
		
		if (y < 1) ;
			System.out.println("Line number 33");
		
		System.out.println("---------------------");	
		
		int x = 1;
		switch(x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
		}
		
	}
}
