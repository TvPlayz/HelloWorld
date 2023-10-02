package day15_StringTasks;

public class UniqueCharacterFinder2 {

	public static void main(String[] args) {
		
//      Unique Character Finder
//
//      Write a Java program that takes a string as input and returns a string containing
//      only the unique characters present in the input string
//    The order of characters in the output string should be the same as they appear in the input string.
//
//      For example, if the input string is "hello", the output should be "helo". If the input string is "programming", the output should be "progamin".
//  input = "java"
//  output = "jav"
      
      
//      input = "techcircle"
//      output = "techirl"
		
		String input  = "javaaaaaaaaaaaaaaaaat";
		String output = "";
		
//		System.out.println(!output.contains("l"));
//		
//		// convert char to String
//		
//		char letter1 = input.charAt(4);
//		
//		String letter = Character.toString(letter1);
//		
//		System.out.println(letter);
		
		for (int i = 0; i < input.length(); i++) {
//			System.out.println(input.charAt(i)); // h e l l o
			
			char currentCharacter = input.charAt(i);
			
			String currentLetter = Character.toString(currentCharacter);
			
			if (!output.contains(currentLetter)) {
				output += currentCharacter;
			}
			
		}
		
		System.out.println(output);
		
		

	}

}
