package day07_controlFLowStatement;

public class StudentGrades {

	public static void main(String[] args) {

		char grade = 'O';

		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Pass");
			break;
		case 'W':
			System.out.println("Withdraw");
			break;
		case 'I':
			System.out.println("Incomplete");
			break;
		default:
			System.out.println("Fail");

		}

	}

}
