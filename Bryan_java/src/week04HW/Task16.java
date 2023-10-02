package week04HW;

public class Task16 {

	public static void main(String[] args) {
		
//		Write a program to extract distinct character from a string input: abcabcabcabc output:abc
		
		String input = "abcabcabcabc";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (output.indexOf(input.charAt(i)) == -1)
				output += input.charAt(i);

		}
		System.out.println(output);

	}

}
