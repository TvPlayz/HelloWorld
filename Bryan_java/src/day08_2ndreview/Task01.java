package day08_2ndreview;

import java.util.Random;

public class Task01 {

	
	public static void main(String[] args) {
		
		/*
		 * Task M1 - Lucky Number
		 * 
		 * a four-digit number 'ABCD' is a lucky if 'A' + 'B' = 'C' +
		 * 
		 * Write a program that asks the user to enter a four-digit number
		 * number or not. if it's a lucky number print 'yay, <number> is a
		 * print 'Nah, <number> is not a lucky number'
		 */
		// MIN to MAX
		// -2147483648 to 2147483647
		Random random = new Random();
		int rdInt = random.nextInt(20)+1; // random number btw 0-19 (1-20)
//		int rdInt = random.nextInt(5); // random number btw 0-4
		
		// i want random btw 1-20
		System.out.println(rdInt);
		
		
		
//		int n = random.nextInt(100)+1;
//		System.out.println("n = "+ = n);
		// Task M2 - Weird Number
//		Given an integer n , perform the following conditional actions:
//
//			If n is odd, print Weird
//			If n is even and in the inclusive range of 2 to 5 , print Not Weird
//			If n is even and in the inclusive range of 6 to 20 , print Weird
//			If n is even and greater than 20, print Not Weird
		
		int n = 23;
		boolean isOdd = n % 2 == 0;
		
		if (isOdd) {
			System.out.println("weird");
		} else {
			if (n >= 2 && n <= 5) { // 2, 4
				System.out.println("not weird");
			}
			else if (n >= 6 && n <= 20) { // 6, 8, 10, ... , 20
			System.out.println("weird");
			}
			else if (n > 20) { // 22 and more (even)
				System.out.println("not weird");
			}
		}
	}
}
