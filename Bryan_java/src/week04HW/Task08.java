package week04HW;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
//		write a program that asks the user enter a three letter word.
//		Check if the middle character of the given word is 'a'.
//		In the case it is print: "Cool word",
//		but in the case the middle letter is not 'a' print: "Okay word".
//		- If the user does not enter a 3 letter word tell them:
//			If the word is less than 3 letters: "Word is too short"
//			If the word is too long: "Word is too long"

		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Enter 3 letters word: ");
		String input = scan.nextLine();

		if (input.length() == 3) {
			if (input.charAt(1) == 'a')
				System.out.println("Cool word");
			else
				System.out.println("Okay word");
		} else if (input.length() > 3)
			System.out.println("Word is too long");
		else
			System.out.println("Word is too short");

		scan.close();

	}

}
