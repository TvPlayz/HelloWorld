package week04HW;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
//		Ask user to enter a word. If the work starts with x, print the word without x.
//
//		```text
//		Input:
//		xcode 
//
//		Output:
//		code
//		```
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String input = scan.nextLine();
		if (input.charAt(0) == 'x')
			System.out.println(input.substring(1));
		else
			System.out.println(input);

		scan.close();

	}

}
