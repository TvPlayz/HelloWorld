package day27_arrayList;

public class CharacterClass {

	public static void main(String[] args) {
		
		char letter1 = 'a';
		char letter2 = 'D';
		char letter3 = '2';
		
		System.out.println(Character.isLetter(letter1));
		System.out.println(Character.isLetter(letter3));
		
		System.out.println(Character.isDigit(letter3));
		System.out.println(Character.isUpperCase(letter2));
		
		
		String str = "!@a1b2c309<>809";
		//letter
		
		String letters ="";
		
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (Character.isLetter(currentChar)) {
//				System.out.println(currentChar);
				letters += currentChar;
			}
		}

		System.out.println(letters);
		
		// digits
		String digits = "";
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			System.out.println(currentChar);
			
			if (Character.isDigit(currentChar)) {
				digits += currentChar;
			}
		}
		
		System.out.println(digits);
		
		String special = "";
		
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			
			if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)) {
				special += currentChar;
			}
		}
		System.out.println(special);
	}

}
