package week03HW;

import java.util.Scanner;

public class Task03_NumberToWord {

	public static void main(String[] args) {
		
//		Task: 3
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number 1 ~ 9 to make it a word");
		
		int num = keyboard.nextInt();
		
		if (num == 1)
			System.out.println("one");
		else if (num == 2)
			System.out.println("two");
		else if (num == 3)
			System.out.println("three");
		else if (num == 4)
			System.out.println("four");
		else if (num == 5)
			System.out.println("five");
		else if (num == 6)
			System.out.println("six");
		else if (num == 7)
			System.out.println("seven");
		else if (num == 8)
			System.out.println("eight");
		else if (num == 9)
			System.out.println("nine");
		else System.out.println("Thank you for your free trial");
		keyboard.close();
		
	}

}
