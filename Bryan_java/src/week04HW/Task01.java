package week04HW;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter a short sentence");
		
		String sent = scan.next();
		
		System.out.println(sent.charAt(0) + "" +"" +  sent.charAt(sent.length()-1));
		
		scan.close();
		

	}

}
