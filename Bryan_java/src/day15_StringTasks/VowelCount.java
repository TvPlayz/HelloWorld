package day15_StringTasks;

public class VowelCount {

	public static void main(String[] args) {

//		Vowel Counter:
//		Build a program that counts the number of vowels (a, e, i, o, u) in a given string.

//		String str = "java";
//		otput : 2

//		input = "techcircle";
//		
//		ouptut = 3

		String vowels = "techcircle";
		int count = 0;

//		char letter = 'e';
//		System.out.println(vowels.indexOf(letter)); // 0
//		
//		if (vowels.indexOf(letter) > -1) {}
		
		for (int i = 0; i < vowels.length(); i++) {
			if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'o'|| vowels.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total number of vowels in string are: " + count);

	}

}
