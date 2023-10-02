package day10_doWhileLoopAndForLoop;

public class WhileLoopReview {

	public static void main(String[] args) {
		
		int num = 0;
		
		if (num < 5) 
			System.out.println(num);
		
		if (num < 5) {
			System.out.println(num);
		num = 10;
		}
		
		System.out.println(num); // 10
		
		
		while (num < 5) {
			System.out.println(num);
		}
		
		
		while (num > 5) {
			System.out.println(num);
			num--;
		}
		
		
		
		
		
	}
}
