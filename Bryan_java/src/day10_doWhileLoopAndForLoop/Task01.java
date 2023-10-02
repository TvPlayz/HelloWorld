package day10_doWhileLoopAndForLoop;

public class Task01 {

	public static void main(String[] args) {

		int e = 1;

		do {
			if (e % 2 == 0) {
				System.out.println(e + " is an even number!");
			}
			e++;
		} while (e <= 50);

	}

}
