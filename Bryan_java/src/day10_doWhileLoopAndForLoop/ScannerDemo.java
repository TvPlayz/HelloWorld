package day10_doWhileLoopAndForLoop;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		dataType variableName = value;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Hello" + name);
		
		System.out.println("How old are you?");
		
		int age = keyboard.nextInt();
		
		System.out.println(name + " is "+age+ " old.");
		
		keyboard.close();
		

	}

}
