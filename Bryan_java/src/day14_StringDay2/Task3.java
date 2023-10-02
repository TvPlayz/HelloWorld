package day14_StringDay2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
//String str = "television";
//		
//		System.out.println(str.substring(2,5)); // lev
//		
//		System.out.println(str.substring(1,7)); //elevis
//		
//		System.out.println(str.substring(4));
//		
//		System.out.println(str.substring(0, 4));
		
		System.out.println("Enter main word");
		String main = keyboard.next();
		System.out.println("Enter sub word");
		String sub = keyboard.next();
		
		if (main.contains(sub))
            System.out.println("Substring "+ sub + " is there");
        else
            System.out.println("Substring "+ sub + " is not there");

		
		
		keyboard.close();

	}

}
