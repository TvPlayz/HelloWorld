package week03HW;

public class Task02_CampusTime {

	public static void main(String[] args) {
		
		int time = 25;
		
		if (time >= 1 && time <= 8 )
			System.out.println("it is CLosed");
		else if (time >= 8 && time <= 23)
			System.out.println("It is Open");
		else if (time <= 24)
		System.out.println("It is Closed");
		else System.out.println("Invlaid");
		
			

	}

}
