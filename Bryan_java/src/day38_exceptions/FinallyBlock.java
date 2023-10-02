package day38_exceptions;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Type a number");
		
		int input = scan.nextInt();
		
		int result = 30 / input;
		
		System.out.println(result);
		}catch(ArithmeticException e){
			e.printStackTrace();
			
			System.out.println("You can put your code here to handle the exception0");
		}finally {
			System.out.println("Closing my scanner object here");
			scan.close();
		}

	}

}
