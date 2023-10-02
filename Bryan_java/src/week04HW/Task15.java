package week04HW;

public class Task15 {

	public static void main(String[] args) {
		
//		Write a program to extract digits from a String:
//
//			```text
//			input: 
//			ab123c4d56efg 
//
//			output:
//			123456
//			```
		
		String input = "ab123c456efg";
		String output = "";
		String number = "1234567890";

		for (int i = 0; i < input.length(); i++) {
			if (number.indexOf(input.charAt(i)) > -1) {
				output += input.charAt(i);
			}
		}
		System.out.println(output);

	}

}
