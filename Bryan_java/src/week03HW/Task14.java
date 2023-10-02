package week03HW;

public class Task14 {

	public static void main(String[] args) {
		
		int line = 5;

		for (int i = 1; i <= line; i++) {
			for (int j = line; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
