package week04HW;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
//		Ask user to enter two words. 
//		Print first word without its first character then print the second word without its
////		first character. 
//		```text
//		Input:
//		apple banana 
//
//		Output:
////		ppleanana
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first word: ");
		String input1 = scan.nextLine().substring(1);
		System.out.println("Enter the second word: ");
		String input2 = scan.nextLine().substring(1);

		System.out.println("Output word is: " + input1 + input2);

		scan.close();


	}

}
