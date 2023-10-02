package day06_operators;

public class LogicalNot {

	public static void main(String[] args) {
		
//		Logical Not(!)
//		if the value is true it makes the result false
//		if the value is false it makes the result true
		
		boolean result = true;
		
		System.out.println(result); // true
		
		System.out.println(!result); // false
		
		boolean result2 = false;
		
		System.out.println(!result2);
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(!(a + b == c));

	}

}
