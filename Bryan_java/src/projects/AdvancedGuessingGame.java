package projects;

import java.util.Random;
import java.util.Scanner;

public class AdvancedGuessingGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello welcome to the guessing number game! Please enter your name.");
		
		String name = keyboard.next();
		System.out.println("Hello " + name +" Please choose your difficulty (easy(1), medium(2), hard(3))");
		int dif;
		int input;
		int numberOfGuess = 0;
		while (true) {
		    dif = keyboard.nextInt();
		    if(dif < 1 || dif > 3) {
		        System.out.println("Invalid difficulty");
		        System.out.println("Please choose your difficulty (easy(1), medium(2), hard(3)");
		        continue;
		    }
		    break;
		}
		if (dif == 1) {
			System.out.println("you have selected easy");
			int minRange = 1;
		    int maxRange = 10;
		    int winningNumber = new Random().nextInt(maxRange) + minRange;
		    System.out.println("Enter number " + minRange + "-" + maxRange + ":");
		    input = keyboard.nextInt();
		    if (input < minRange || input > maxRange)
		        System.out.println("Invalid number, try again");
		}
		else if (dif == 2) {
			System.out.println("you have selected medium");
			int minRange = 1;
		    int maxRange = 25;
		    int winningNumber = new Random().nextInt(maxRange) + minRange;
		    System.out.println("Enter number " + minRange + "-" + maxRange + ":");
		}
		else if (dif == 3) {
			System.out.println("you have selected hard");
			int minRange = 1;
		    int maxRange = 100;
		    int winningNumber = new Random().nextInt(maxRange) + minRange;
		    System.out.println("Enter number " + minRange + "-" + maxRange + ":");
		}
		
		
		
		
		
		
		
		
		System.out.println("Congrats, you've won");
	    System.out.println("the winner number is " );
	    System.out.println("You guess " + numberOfGuess + " time(s)");
		keyboard.close();

	}

}
