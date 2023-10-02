package week04HW;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
//		ask the user to enter a word. if the word ends with "ly", print "really???" ,
//		otherwise, print "
//		never mind"
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String input = scan.nextLine();

		if (input.substring(input.length() - 2).equals("ly"))
			System.out.println("really???");
		else
			System.out.println("never mind");
		
		scan.close();
	}

}
