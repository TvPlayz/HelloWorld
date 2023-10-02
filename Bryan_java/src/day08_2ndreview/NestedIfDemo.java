package day08_2ndreview;

public class NestedIfDemo {

	public static void main(String[] args) {
		// nesred / imside

		/*
		 * if (condition A) {
		 *  if (condition B) {
		 *   if (condition C) {
		 *    // code block
		 *   }
		 *  }
		 * }
		 */

		if (true) {
			if (true) {
				System.out.println("code inside nested if");
			} else {
				System.out.println("inside else");
			}
		} else {
			if (true) {
				System.out.println("code inside nested else");
			}
			// else
		}
	}

}
