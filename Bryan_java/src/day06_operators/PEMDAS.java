package day06_operators;

public class PEMDAS {

	public static void main(String[] args) {
		
//      PEMDAS (Parenthesis, Exponents, Multiplication and Division,
//      Addition and Subtraction) order.
//      When there are multiple instances of the same precedence,
//      Java reads from left to right.
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		int result1 = a + b - c;
		
		System.out.println(result1);
		
		result1 = a + (b-c);
		
		System.out.println(result1);
		
		result1 = a + b*c;
		
		System.out.println(result1);
		
		
		result1 = a + (b*c)/2;
		
		System.out.println(result1);
		

	}

}
