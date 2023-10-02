package day07_controlFLowStatement;

public class Task01 {

	public static void main(String[] args) {
		
		double n1 = -1.0;
		double n2 = 4.5;
		double n3 = -5.3;
		
		if (n1 >= n2 && n1 >= n3 )
			System.out.println(n1 + " is the largest Number");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the larest Number");
		else
			System.out.println(n3 + " is the largest Number");
			

	}

}
