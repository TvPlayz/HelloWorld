package day13_nestedLoop;

public class String_Concat {

	public static void main(String[] args) {
		 String str1 = "re" , str2 = "think", str3 = "ing";
		 
		 String result = str1 + str2;
		 System.out.println(result); // rethink
		 
		 
		 String result2 = str1.concat(str2);
		 System.out.println(result2);
		 
		 
		 result += str3;
		 
		 System.out.println(result);
		 
		 result2 = result2 + str3;
		 System.out.println(result2);
		 
		 String word = "";
		 char letter1 = 'j';
		 char letter2 = 'a';
		 char letter3 = 'v';
		 char letter4 = 'a';
		 
		 System.out.println(word);
		 
		 word += letter1;
		 System.out.println(word);
		 word += letter2;
		 System.out.println(word);
		 word += letter3;
		 System.out.println(word);
		 word += letter4;
		 System.out.println(word);

	}

}
