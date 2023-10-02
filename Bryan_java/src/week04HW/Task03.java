package week04HW;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
//		write a program that asks user to enter two strings, and print out the longest string
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your 1st String");
		
		String one = scan.next();
		System.out.println("Please enter your 2nd String");
		String two = scan.next();
		
//		System.out.println(one.length());
//		System.out.println(two.length());
		
		if (one.length() == two.length()) {
			System.out.println(one+ " and "+two+" are the same Length");
		}
		
		if (one.length() > two.length()) {
			System.out.println(one +" String is longer");
		}
		
		if (one.length() < two.length()) {
			System.out.println(two +" String is longer");
		}
		
		scan.close();

	}

}
