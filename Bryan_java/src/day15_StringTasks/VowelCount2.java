package day15_StringTasks;

public class VowelCount2 {

	public static void main(String[] args) {
		
//      Vowel Counter: 
//      Build a program that counts the number of vowels (a, e, i, o, u) in a given string.

      String input = "Washington";
      int count = 0;
      String vowels = "aeiou";
      
      
      for (int i = 0 ; i < input.length() ; i++) {
          char currentCharacter = input.charAt(i);
          String currentStr = Character.toString(currentCharacter);    
          if (vowels.contains(currentStr)) {
              count++;
          }
      }
      
      System.out.println(count);

	}

}
