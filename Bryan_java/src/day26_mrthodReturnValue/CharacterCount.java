package day26_mrthodReturnValue;

public class CharacterCount {

	public static void main(String[] args) {

        System.out.println(characterCount("java", 'a'));
        
        characterCount('t' , "techcircle");
        

        
        
    }

//	--> Method overloading
//		Having more than one method with same name and different parameters in the same class
	
    public static int characterCount(String str , char target) {
//        0123456789
//        String str = "techcircle";
//
//        char target = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
    public static void characterCount(char target, String str) {

    	String output = "";
      for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == target) {
              output+= target+ " found at index position " + i +", ";
          }
      }

      System.out.println(output);
    }
}
