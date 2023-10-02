package day11_forLoop;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		
//		for (variable ; condition ; change) {
//			code block
//		}
		
		// print 1 to 5
		for (int i = 1 ; i < 6 ; i++) {
//			System.out.println(i);
			
			System.out.println("Hello Cohort16 ---- "+ i);
		}
		
		// System.out.println(i);
		int i = 1;
		
		while (i < 6) {
			System.out.println("Hello Cohort16 ---- "+ i);
			i++; // i = i + 6
		}
		
		System.out.println("----------DO WHILE LOOP------------");
		
		System.out.println(i); // 6
		
		i =1;
		do {
			System.out.println("----------DO WHILE LOOP------------"+ i);
			i++;
		}while(i < 6);
		
		
		
	}

}
