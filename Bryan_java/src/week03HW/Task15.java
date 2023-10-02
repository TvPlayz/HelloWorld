package week03HW;

public class Task15 {

	public static void main(String[] args) {
		
		int line = 5;

		for (int i = 0; i < line; i++) {
			for (int j = line; j > i; j--) {
				System.out.print(line - i);
			}
			System.out.println();
		}
	}
}
