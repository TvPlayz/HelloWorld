package day12_3rdreview;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//winning number is between 1-5
		
		// ask user to guess that number
		//until it correct
		
		//keep the score/count how many times the user guess.
		
		int minRange = 1;
	    int maxRange = 5;
	    int winningNumber = new Random().nextInt(maxRange) + minRange; // random 1-5
	    System.out.println("win = " + winningNumber);
	    int numberOfGuess = 0;

	    Scanner sc = new Scanner(System.in);
	    int input;

	    // win
	    // repeat until user won
	    // keeping the numberOfGuess
	    // if user enter number outside the range

	    do {
	      // ask question
	      System.out.println("Enter number " + minRange + "-" + maxRange + ":");
	      // get answer -> var
	      input = sc.nextInt();
	      if (input < minRange || input > maxRange)
	        System.out.println("Invalid number, try again");

	      // count numberOfGuess++
	      numberOfGuess++;
	    } while (input != winningNumber);

	    // winning msg
	    System.out.println("Congrats, you've won");
	    System.out.println("the winner number is " + winningNumber);
	    System.out.println("You guess " + numberOfGuess + " time(s)");
	    sc.close();
	}

}
