package day11_forLoop;

public class Task5 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1;i <= 100;i++) {
			sum += i;
//			System.out.println(i);
		}
		
		System.out.println(sum);
		
		
		for (int i = 1;i <= 100;i++) {
			if (i != 100) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i+ " = "+ sum);
			}
		}
		
		
		
		

	}

}
