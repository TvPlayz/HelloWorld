package day09_loop;

public class Task03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		
		while (y >= 100) {
		x *= y;
		y--;
		
		}

		System.out.println(x);
	}

}
