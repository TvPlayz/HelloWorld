package day05_operators;

public class RelationalOperator {
	public static void main(String[] args) {
		
		
		// ==, > , >= , < , <= , !=
		// RelationalOperator will reteurn boolean
		
		int a = 2;
		int b = 3;
		int c = 5;
//						   2 == 3
		System.out.println(a == b);
		
		int d = a + b; // 5
		
		System.out.println(d == c); // true
		
		boolean result = a + b == c; // true
		
		System.out.println(result);
		
		/// != not equal
		
		System.out.println(a != b); // true
		
		System.out.println(d != c); // false
		
		
		a = 1;
		b = 2;
		c = 3;
		
		System.out.println(a >= b); // false
		
		System.out.println(a + b >= c); //true
		
		boolean result2 = a <= c;
		
		System.out.println(result2);
		
		System.out.println(a * b >= c); // false
		
//						   1 + 2 + 3 < 3 + 2
		System.out.println(a + b +c < c + b); // false
//						   6 <= 6
		System.out.println(a + b +c <= c * b); // true
		
	}
}
