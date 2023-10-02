package day15_StringTasks;

public class UniqueCharacterFinder {

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
        
        
//        char c = 'h';
//        String output = "";
//        
//        System.out.println(output.indexOf(c));
//        
//        if (output.indexOf(c) == -1) {
//            output += c; // h
//        }
//        
//        c = 'e';
//        
//        if (output.indexOf(c) == -1) {
//            output += c; // he
//        }
//        
//        
//        c = 'l';
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//            }
//        
//        c = 'l';
//        
//        System.out.println(output.indexOf(c));
//        
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//        }
//        
//        c = 'o';
//        System.out.println(output);
//        System.out.println(output.indexOf(c));
//    
//        
//        
//        if (output.indexOf(c) == -1) {
//            output += c; //hel        
//        }
//        
//        System.out.println(output);
//                         01234
        String input  = "civic";
        String output = "";
        
        System.out.println(output);
        
//                            5
        for (int i = 0; i < input.length() ; i++) {
            //System.out.println(i);
            
//            System.out.println(input.charAt(i));
            
//            if (output.indexOf(c) == -1) {
//                output += c; //hel        
//            }
            
            char currentCharacter = input.charAt(i);
            //System.out.println(currentCharacter);
            
            
            //System.out.println(output.indexOf(currentCharacter));
            
            if (output.indexOf(currentCharacter) == -1) {
                output += currentCharacter;
            }
        }
        
        System.out.println(output);

	}

}
