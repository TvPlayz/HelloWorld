package day12_3rdreview;

public class TaskPrimeNumbers extends Object {

	public static void main(String[] args) {
		
//		Write program that can print all prime numbers until the input number
//
//		input:
//		> 20
//		output:
//		> 2,3,5,7,11,13,17
//
//		input:
//		> 5
//		output:
//		> 2,3,5

		int input = 3; // 7/2, 7/3, 7/4, 7/5, 7/6, 7/7
		// if
		// number that not divisible by 1 & itself
		// every round of division has to have at least 1 remainder (!= 0)
		
		/*
		if input % 2 != 0
		if input % 3 != 0
		if input % 4 != 0
		if input % 5 != 0
		if input % 6 != 0
		*/
		
		
		for (int i = 2; i < input; i++) {

		      boolean isPrime = true;
		      if (i == 0 || i == 1) isPrime = false;

		      for (int j = 2; j < i; j++) {
		        if (i % j == 0)
		          isPrime = false;
		      }

		      if (isPrime) System.out.println(i);
		    }
	}

}
