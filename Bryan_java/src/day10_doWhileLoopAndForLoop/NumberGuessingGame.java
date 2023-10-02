package day10_doWhileLoopAndForLoop;

import java.util.Random;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
	Random random = new Random();
	
	int secretNumber = random.nextInt(50);
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Welcome to num8ber guessing game!");
	
	System.out.println("Enter your guess (0 ~ 50)");
	int num;
	do {
	
     num = keyboard.nextInt();
	
	if(num > secretNumber) {
		System.out.println("Too high");
	} else if (num == secretNumber) {
		System.out.println("Congrats! You won!!!");
	} else {
		System.out.println("Too low");
	}
	}while (num != secretNumber);
	System.out.println(secretNumber +" is your Secret Number");
	
	
		
		
	keyboard.close();
	}

}
