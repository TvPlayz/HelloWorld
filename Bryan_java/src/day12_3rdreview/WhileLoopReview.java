package day12_3rdreview;

public class WhileLoopReview {

	public static void main(String[] args) {
		
		
		// loop (boolean expression)
		// repeat the code (block) as long as
		// the expression return true
		
//		
//		while (boolean_expression) {
//			// code block to be repeated
//		}
		
		// counter is int var, use for control how many loop 
		// will be execute
		
		int counter = 0;
		//           0 < 5
		while (counter < 5) {
			System.out.println("hello world");
			counter++; // counter =2
			
		}
		
		System.out.println("loop stop");
		
		int num = 5;
		while (num <= 100) {
			System.out.println(num);
			num+=5;
		}
		
	}

}
