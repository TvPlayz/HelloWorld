package day05_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// AND (&&)  OR (||)  NOT (!)
		
		
		// AND && all of the condition must be true
		
//		condition1 condition2 result
//		true		true		true
//		true		false		false
//		false		true		false
//		false		false		false
		
		boolean condition1 = true;
		boolean condition2 = true;
		boolean condition3 = false;
		System.out.println(condition1 && condition2); // true
		System.out.println(condition1 && condition2 && condition3); // false
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a < b && a + b == c); // true
		
		System.out.println(a < b && a * b == c); // false
		
		System.out.println(a < b && a + b >= c); // true
		
		

	}

}
