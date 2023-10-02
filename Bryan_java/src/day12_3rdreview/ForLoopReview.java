package day12_3rdreview;

public class ForLoopReview {

	public static void main(String[] args) {
		
		// For Loop
		
		/*
		 for (intitialize counter; condition;  increment/decrement) {
		 // code to be repeated
		 }  
		 */
		//       A        B      C
		for (int i = 0, j = 0; i < 5; i++, j--) {
			System.out.println("hello world");
			System.out.println("i = "+ i);
			System.out.println("i = "+ j);
		}
		
		/*
		A-> C (if true) -> D -> C
		B (if true) -> D -> C
		B (if true) -> S -> C
		B (if false) -> break out of for loop
		*/
		
		

	}

}
