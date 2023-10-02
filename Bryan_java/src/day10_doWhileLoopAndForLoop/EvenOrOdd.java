package day10_doWhileLoopAndForLoop;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = keyboard.nextInt();
		
		if (num % 2 == 0); {
			System.out.println(num + " is even number");
		} 
		

		
		
		keyboard.close();
	}

}
