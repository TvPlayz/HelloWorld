package week03HW;

import java.util.Scanner;

public class Task12_PrimeWithoutForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to check Prime number: ");
		int givenNumber = scan.nextInt();
		boolean isPrimeNumber = true;

		for (int i = 2; i <= givenNumber / 2; i++) {
			if (givenNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber)
			System.out.println(givenNumber + " is a prime number.");
		else
			System.out.println(givenNumber + " is not a prime number.");
	
		scan.close();


	}

}
