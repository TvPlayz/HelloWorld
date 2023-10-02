package day08_2ndreview;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// Switch statement
		// if data match the case, the code in that case will be running
		String role = "recruit";
		int roleNumber = 1;
		// var : string
		switch (role) {
		case "admin":
			System.out.println("You can access anything");
			break;
		case "guest":
		System.out.println("You're just a guest");
		System.out.println("do not click here");
		System.out.println("get out!");
		break;
		default:
			System.out.println("please enter correct role.");
			System.out.println("either 'admin' or 'guest'");
		}

		System.out.println("after break");
	}

}
