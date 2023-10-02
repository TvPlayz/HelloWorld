package day12_3rdreview;

import java.util.Scanner;

public class DoWhileLoopReview {

	public static void main(String[] args) {
		// Do while
		// do while loop will execute at least 
		// once regardless of boolean condition
		
		/*
		do {
			//code to be rpeated
		} while (condition);
		
		*/
		
		int i = 5;
		do {
			System.out.println("hello - "+ i);
			i--;
		} while (i > 0 );
		
		System.out.println("outside loop");
		System.out.println("i = "+ i);
		
		
		// example
		
		Scanner sc = new Scanner(System.in);
		int input;
	    // user can enter 0 = exit, 1 = check balance, 2 = deposit, 3 = withdraw
	    // 1,2,3, 0
	    do {
	      System.out.println("Enter 0 = exit, 1 = check balance, 2 = deposit, 3 = withdraw");
	      input = sc.nextInt();

	      switch (input) {
	  }

	    } while (input != 0); // 0 = exit

	    System.out.println("Thank you for using program");


		
		sc.close();
	}
}
