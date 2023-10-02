package week03HW;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of factorial: ");
			int factorial = scan.nextInt();
			int sum = 1;

			for (int i = 1; i <= factorial; i++) {
				sum *= i;
			}

			System.out.println("Result of " + factorial + "! = " + sum);
			scan.close();


	}

}
