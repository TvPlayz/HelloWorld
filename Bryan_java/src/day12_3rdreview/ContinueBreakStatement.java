package day12_3rdreview;

public class ContinueBreakStatement {

	public static void main(String[] args) {
		// break;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
				if (i == 2)
					break; // it will stop the loop right away
		}
		
		System.out.println("end of the loop");
		
		// continue;

		for (int i = 0; i < 5; i++) {
			if (i == 3)
				continue; // it will go back to the beginning of the loop
			System.out.println(i);
		}
		
		System.out.println("end of the loop");
	}

}
