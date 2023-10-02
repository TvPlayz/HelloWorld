package week03HW;

import java.util.Scanner;

public class Task11_PrimeWithWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number: ");
		int givenNumber = scan.nextInt();
	
		int digit = 1;
		int reverseNumber = 0;
		
		while(givenNumber!=0) {
			digit = givenNumber%10;
			reverseNumber = (reverseNumber*10)+digit;
			givenNumber/=10;
		}
		System.out.println(reverseNumber);
			
		scan.close();


	}

}
