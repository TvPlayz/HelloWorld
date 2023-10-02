package week03HW;

import java.util.Scanner;

public class Task06_Enter5NumbersToGetMaximumNumber {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);

			System.out.println("Enter 1st number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd number : ");
			int num2 = scan.nextInt();
			System.out.println("Enter 3rd number : ");
			int num3 = scan.nextInt();
			System.out.println("Enter 4th number : ");
			int num4 = scan.nextInt();
			System.out.println("Enter 5th number : ");
			int num5 = scan.nextInt();
					
			if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println(num1 + " is the highest number");
			} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
				System.out.println(num2 + " is the highest number");
			} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
				System.out.println(num3 + " is the highest number");
			} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
				System.out.println(num4 + " is the highest number");
			} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
				System.out.println(num5 + " is the higest number");
			}
			scan.close();
	}

}
