package week02HW;

public class JavaHomework {

	public static void main(String[] args) {
		
//		Task 1
//		Write a program that takes a user's age as input and prints out if the user is 
//		an adult or a minor. The legal age of adulthood is 18 years
		
		int age = 17;
		
		if (age < 18) {
			System.out.println("You are a minor!");
		}
		
		else if (age >= 18) {
			System.out.println("You are an adult!");
		}

		System.out.println("----------------------------------------------");
		
//		Task 2
//		Write a program that takes a user's score as input and prints out their letter 
//		grade based on the following scale: A = 90-100 B = 80-89 C = 70-79 D = 60-69 F = 
//		0-59
		
		int x = 69;
		
		if (x <= 100 && x >=90) {
			System.out.println("You got an A!");
		}
			
		if (x <= 89 && x >= 80) {
			System.out.println("You got a B!");
		}
		if (x <= 79 && x >= 70) {
			System.out.println("You got a C!");
		}
		
		if (x <= 69 && x >= 60) {
			System.out.println("You got a D!");
		}
		
		if (x <= 59 && x >= 0) {
			System.out.println("You got an F!");
		}
		
		System.out.println("----------------------------------------------");
		
//		Task 3:
//			Write a program that takes two integers as input and prints "The numbers are 
//			equal" if they are equal, "The first number is greater" if the first number is 
//			greater, and "The second number is greater" if the second number is greater.
		
		int num1 = 50, num2 = 50;
		
	     if (num1 == num2)
	    	 
	       System.out.println ("both are equal");
	     
	     else if (num1 > num2)
	         System.out.println (num1 + " is greater");

	     else
	         System.out.println (num2 + " is greater");
	     
	     System.out.println("----------------------------------------------");
	     
//	 	Task 4:
//			Write a program that takes a letter grade as input (A, B, C, D, or F) and prints 
//			whether the grade is passing or failing. A grade of A, B, or C is considered 
//			passing, and a grade of D or F is considered failing.
		
	     char grade = 'B';

	        switch (grade) {
	        case 'A':
	            System.out.println(" Pass ");
	            break;
	        case 'B':
	            System.out.println(" Pass ");
	            break;
	        case 'C':
	            System.out.println(" Pass ");
	            break;
	        case 'D':
	            System.out.println(" Fail ");
	            break;
	        case 'F':
	            System.out.println(" Fail ");
	            break;

	        default:
	            System.out.println(" Invalid ");
	        }
	        System.out.println("----------------------------------------------");
	        
//	   Task 5:
//	        Write a program that takes an integer as input and prints whether the number is 
//	        even or odd
	        int num01 = 10;
	        
	        if (num01 % 2 == 0) {
	        	System.out.println(num01 +" is a even number");
	        } else {
	        	System.out.println(num01 +" is a odd number");
	        }
	        
	        System.out.println("----------------------------------------------");
	        
//	        Task 6:
//	        	Write a program that takes an integer as input and checks if it's positive, 
//	        	negative, or zero.
	        
	        int num = -5;
	        
	        if(num > 0) {
	        	System.out.println(num +" Is a positive number");
	        } else {
	        	System.out.println(num +" Is a negative number");
	        }
	        
	        System.out.println("----------------------------------------------");
	        
//	        Task 7:
//	        	Write a Java Program that prints the day of the week.
//	        	Note: Your input must be between 1 to 7:
//	        		
//	        	Example:
//	        	Input: 1
//	            output: Monday
//	            Input: 7
//	            output: Sunday
	        
	        int day = 4;
			
			
			if (day == 1) {
				System.out.println("Monday");
			}else if(day == 2) {
				System.out.println("Tuesday");
			}else if (day == 3){
				System.out.println("Wednesday");
			}else if(day == 4){
				System.out.println("Thursday");
			}else if (day == 5) {
				System.out.println("Friday");
			}else if (day == 6) {
				System.out.println("Saturday");
			}else if (day == 7) {
				System.out.println("Sunday");
			}else {
				System.out.println("Invalid number of the day");
			}
	        
			System.out.println("----------------------------------------------");
			
//			Task 8:
//			Write a Java Program to print the following message.
//			Good Morning
//			5< 12
//			Good Afternoon
//			12 — 17
//			Good Evening
//			17—24
//			*/
//			When do the greetings (Good morning, afternoon, and evening) change?
//			● Good morning. 5:00 AM — 11:59 AM.
//			● Good afternoon. 12:00 PM — 4:59 PM.
//			● Good evening. 5:00 PM — 4:59 AM.
			
			int time = 4;
			
			if (time >= 0 && time < 12) {
				System.out.println("Good Morning!");
			} else {
				if (time >= 12 && time < 17) {
					System.out.println("Good Afternoon!");
				} else {
					if (time >= 17 && time <= 24) {
						System.out.println("Good Evening!");
					} else if (time < 0 || time >= 24) {
						System.out.println("Invlaid Entry!");
					}
				}
			}
			
			System.out.println("----------------------------------------------");
			
//			Task 9:
//				Create a calculator that can calculate basic operators like addition, subtraction, 
//				multiplication and division. 
//				Input:
//				a = 3, b = 4, operator = addition
//				Output = 7;
//				Input:
//				a = 3, b = 4, operator = multiplication
//				Output = 12;
			
			
			
			
	}
	

}
