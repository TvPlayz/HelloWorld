package day11_forLoop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
//		int n = 6;
		
		int n = keyboard.nextInt();
		
		for (int i = 1;i <= 10;i++) {
			System.out.println(n +" X "+ i +" = "+ (i*n));
		}
		
		keyboard.close();
	}

}
