package day14_StringDay2;

public class AccessingEachCharacterOfString {

	public static void main(String[] args) {
//					 0123
		String str ="Java";
		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
		
//		0~3
		
//		for (int i = 0 ; i < 4 ; i++) {
////			System.out.println(i);
//			System.out.println(str.charAt(i));
//		}
		
		System.out.println(str.length()); // 4
		
		for (int i = 0 ; i < str.length() ; i++) {
//			System.out.println(i);
			System.out.println(str.charAt(i));
		}
		
		String word ="RechCircle";
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		

	}

}
