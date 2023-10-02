package day16_4thReview;

public class Task14_week3 {

	public static void main(String[] args) {
		
//		Write a program that generates the following pattern using nested for loops:
//			   55555
//			   4444
//			   333
//			   22
//		   	   1
	
		
		for (int i = 5; i > 0; i--) { // i -> 5 4 3 2 1
			for (int j = i; j > 0; j--) { // j loop will always getting smaller
				System.out.print(i); // digit in the same line
			}
			System.out.println(); // enter new line
		}
		/*
		 * - size of each row, is increment by 2
		 * - white space, getting smaller 321, respectively
		 *     1
		 *    222
		 *   33333
		 *  4444444
		 */
		
		String name = "Leng";
		System.out.println(name.repeat(2));
				
		System.out.println();
		
		String space = " ";
	    int size = 4;
	    for (int i = 1; i <= size; i++) {
	      for (int j = (size-1)-i; j >= 0; j--) { // run 4 3 2 1 times,
	        System.out.print(space);
	      }
	      for (int j = 1; j <= (i*2)-1 ; j++) { // j = 1,3,5,7
	        System.out.print(i);
	      }
	      System.out.println();
	    }
		
	}

}
