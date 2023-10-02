package day38_exceptions;

public class StringIndexIssue {

	public static void main(String[] args) {
		
		String str = "Welcome!";
		
		char[] chars = str.toCharArray();
		
		try {
		
		for (int i = 0; i <= chars.length; i++) {
			System.out.println(chars[i]);
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}

		System.out.println("Program is here at line number 20");
		
	}

}
