package day10_doWhileLoopAndForLoop;

public class Task03 {

	public static void main(String[] args) {
	
//      task:
//      Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
//      Sample Output:
//
//      Divided by 3:                                                          
//      3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//      , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
//                                                                             
//      Divided by 5:                                                          
//      5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
//      95,                                                                    
//                                                                             
//      Divided by 3 & 5:                                                      
//      15, 30, 45, 60, 75, 90,
		
		int num1 = 1;
		
		do {
			if (num1 % 3 == 0)
			System.out.print(num1 + " , ");
			num1++;
			
		} while (num1 <= 100);
		System.out.println();
		num1 =1;
		
		do {
			if (num1 % 5 == 0)
			System.out.print(num1 + " , ");
			num1++;
			
		} while (num1 <= 100);
		System.out.println();
		num1 =1;
		
		do {
			if (num1 % 3 == 0 && num1 % 5 == 0)
			System.out.print(num1 + " , ");
			num1++;
			
		} while (num1 <= 100);

	}

}
