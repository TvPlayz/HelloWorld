package week04HW;

public class Task06 {

	public static void main(String[] args) {
		
//		write a program that can return the initials of the user
//
//				ex:
//				techcircle school
//
//				output:
//				T.S
//
//				Note: Pay attention to the example output
		
		String input = "Saroj Chokrungjaroentaworn";
		input = input.toUpperCase();
		char nameChar = input.charAt(0);
		int lastName = input.indexOf(' ') + 1;
		char lastNameChar = input.charAt(lastName);

		System.out.println("Initial is: " + nameChar + lastNameChar);

	}

}
