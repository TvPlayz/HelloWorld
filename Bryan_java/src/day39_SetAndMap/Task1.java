package day39_SetAndMap;

import java.util.*;

public class Task1 {

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
		
		String input = "java";
        Set<Character> chars = new HashSet<>();
        char[] c = input.toCharArray();
        for (Character cha : c) {
            chars.add(cha);
        }
        String output = "";
        for (Character a : chars)
            output += a;
        System.out.println(output);

		
		
	}

}
