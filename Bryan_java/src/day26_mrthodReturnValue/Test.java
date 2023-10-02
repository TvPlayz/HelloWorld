package day26_mrthodReturnValue;

public class Test {

	public String distinctCharacter(String input) {
//		 String input = "aaleeexxssa";
	        String output = "";
	        	for (int i = 1; input.length() > i; i++) {
	        		if (output.indexOf(input.charAt(i)) == -1) {
	        			output += input.charAt(i);
	        		}
	        }

	        	return output;
	}
	
	
//	--> Method overloading
//	Having more than one method with same name and different parameters in the same class

public static int characterCount(String str , char target) {
//    0123456789
//    String str = "techcircle";
//
//    char target = 'c';

    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            count++;
        }
    }

    return count;
}
	
}
