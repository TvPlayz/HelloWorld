package day11_forLoop;

public class Task9 {

	public static void main(String[] args) {
		
		int month = 2;
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			System.out.println("31 Days in this Month");  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			System.out.println("30 Days in this Month");  	
		}  
		else if ( month == 2 )
		{
			System.out.println("Either 28 or 29 Days in this Month");  	
		} 
		else
			System.out.println("Please enter Valid Number between 1 to 12");

	}

}
