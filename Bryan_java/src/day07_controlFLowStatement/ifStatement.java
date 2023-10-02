package day07_controlFLowStatement;

public class ifStatement {
	
	public static void main(String[] args) {
		
		int num = 4;
		
		if (num > 3) {
			System.out.println(num + " is grearer than 3 ");
		}else {
			System.out.println(num + " is less than 3 ");
		}
		// even or odd
		
		long num2 = 58;
		
//		System.out.println(num2 % 2);
		
		System.out.println(num2 % 2);
		
			if (num2% 2 == 0 ) {
				System.out.println(num2 + " is even ");
			} else {
				System.out.println(num2 + " is odd ");
			}
		
			
			int count = 12;
			int total = 4;
			
			if (count < 3) {
				total = 0;
			}else {
				total += count; /// total = total + count;
			}
			
			System.out.println("Value of total is "+ total);
			
			
			
			int number = -5;
			
			if(number >= 0) {
				System.out.println(number +" is positive");
			}else {
				System.out.println(number +" is negative");
			}
			
			if(number >= 0) {
				System.out.println(number +" is positive");
			}
			if(number <= 0) {
					System.out.println(number +" is negative");	
			}
			
			
			
			
	}

}
