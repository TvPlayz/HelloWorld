package week03HW;

import java.util.Scanner;

public class Task10_ReverseNumberWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number: ");
		int givenNumber = scan.nextInt();

		int digitNumber = 1;
		int digit = 10;
		int sum = 0;

		while (digitNumber > 0) {
			digitNumber = ((givenNumber % digit) / (digit / 10));
			sum += digitNumber;
			digit *= 10;
		}
		System.out.println(sum);
		scan.close();


	}

}
