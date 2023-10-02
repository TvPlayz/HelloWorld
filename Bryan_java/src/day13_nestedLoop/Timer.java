package day13_nestedLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
//		 int time = 5;
		 for (int day = 6; day >= 0; day--) {
		 for (int hour = 23 ; hour >= 0; hour--) {
		 for (int minute = 59 ; minute >= 0; minute--) {
//			 System.out.println(minute);
		 

		 for (int second = 59 ; second >= 0; second--) {
			 System.out.println(day+ ":"+hour+ ":"+minute+ ":"+ second);
			 Thread.sleep(1000);
		 			}
		 		}
		 	}
		 }
		
	}
}
