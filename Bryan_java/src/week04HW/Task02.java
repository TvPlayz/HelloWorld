package week04HW;

public class Task02 {

	public static void main(String[] args) {
		
		 String str= "Bryan", reverse="";
	        char ch;
	        
	        if ((str.length() == 5)) {
	        	System.out.println("Original word " + str);
	        	for (int i=0; i<str.length(); i++)
	  	      {
	  	        ch= str.charAt(i); 
	  	        reverse= ch+reverse; 
	  	      }
	  	      System.out.println("Reversed word: "+ reverse);
	            
	        }
	        
	        if ((str.length() < 5)) {
	            System.out.println("Too short");
	            
	        }
	        
	        if ((str.length() > 5)) {
	            System.out.println("Too long");
	        }
	     
	        
	}

}
