package week04HW;

public class Task04 {

	public static void main(String[] args) {
		
//		write a program that can check if the first and last characters of the string are same
		
		String word = "racecar";
		int stringLength = word.length();
		
		
		String letter1 = (word.substring (0,1));
        String letter2 = (word.substring (stringLength-1));
        
        if (letter1.equals(letter2)) {
        	System.out.println("Both ends have same letter");
        }
        else {
        	System.out.println("Both ends don't have same letter");
        }

	}

}
