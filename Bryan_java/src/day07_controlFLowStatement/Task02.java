package day07_controlFLowStatement;

public class Task02 {

	public static void main(String[] args) {
		
//		Write a Java program that prompts the user to
//		enter their grade (A, B, C, D, or F) and uses
//		a switch statement to display a corresponding message
//		(e.g., "Excellent!", "Good job!", "Pass", "You need to work harder", "Fail").
		
		char grade = 'D';
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Good job!");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
			System.out.println("You need to work harder");
			break;
		case 'F':
			default:
			System.out.println("fail");
		}
	}

}
