package day03_variable;

public class VariableNamingConventions {

	public static void main(String[] args) {
//		1, first character of the variable are letter or _ or $
		String name;
		int _distance;
		double $balance;
		
		int age = 4;
		
		
//		2. After the first initial letter , variable names may also contain letter
		
		String user12;
		String userx_____________$;
		String card_of_3453453card = "";
		
		// 3. The name can be of any length. don't get carried away.
		
		String myPhoneNumberrrrrrrrrr____$$$$3412342 = "234234";
				
		
		// 4. Uppercase characters are distinct from lowercase characters.  Using ALL uppercase letters are primarily used to identify constant variables.  Remember that variable names are case-sensitive
		
		int speed = 55;
		int SPEED = 65;
		int Speed = 35;
		
		System.out.println(speed); // 55
		System.out.println(SPEED); // 65
		System.out.println(Speed); // 35
		
		speed= 0;
		
		System.out.println(speed); // 0
		
		 final int DAYS_IN_WEEK = 7;
		 System.out.println(DAYS_IN_WEEK);
		 
//		 The final local variable DAYS_IN_WEEK cannot be assigned. It must be blank and not using a compound assignment
		 
		 final int DAYS_IN_WEEKS = 27;
		 System.out.println(DAYS_IN_WEEKS);
		 
//		 You cannot use a java keyword (reserved word) for a variable name.
		 
//		 String continue = "value";
		 String whileTESTING = "value";
		 
		 int  numberOfStudent;
		 int  colorOfMyCar;
		 
		 double accountbalaneofsomebody;
		 double accountBalaneOfSomebody;
		  
	}

}
