package day06_operators;

public class Task3 {

	public static void main(String[] args) {

//      Leap Year Checker: 
//      Create a Java program that checks whether a given year is a leap year
//      or not. 
//      Use the modulus operator to determine 
//      if the year is divisible by 4 and 100 but not by 400.
      
//      a year, occurring once every four years, 
//      that has 366 days including February 29 as an intercalary day.
		
		int year = 2024;
		
		boolean isLeapYear = year % 4 == 0 || year % 100 ==0;
		
		String msg = (year % 4 ==0) ? "Leap Year" : "Common Year";
		
		System.out.println(year + " is "+ msg);
		
		
		
	}

}
