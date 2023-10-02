package week04HW;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
//		Write a method that asks user to enter a string. if the string is empty, print: string is empty if
//		the string has more than 3 characters, print the last three characters if the string has less than
//		or equal 3 characters, print the string itself
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter string: ");
		String input = scan.nextLine();
		if (input.isEmpty())
			System.out.println("String is empty");
		else if (input.length() > 3)
			System.out.println(input.substring(input.length() - 3));
		else
			System.out.println(input);

		scan.close();

	}

}
