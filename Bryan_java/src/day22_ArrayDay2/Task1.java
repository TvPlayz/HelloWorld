package day22_ArrayDay2;

public class Task1 {

	public static void main(String[] args) {

		String classmates[] = new String[10];
		classmates[0] = "Bryan Chavez";
		classmates[1] = "Hello World";
		classmates[2] = "Um Lol";
		classmates[3] = "MQ QM";
		classmates[4] = "Hi Bye";
		classmates[5] = "Fly Guy";
		classmates[6] = "Cody Joe";
		classmates[7] = "Wall Blue";
		classmates[8] = "Sea Lee";
		classmates[9] = "For Me";

		for (int i = 0; i < classmates.length; i++) {
			String[] charInt = classmates[i].split(" ");
			String classChar = charInt[0];
			String firstNameChar = classChar.substring(0, 1);
			String lastnameChar = charInt[1];
			String lastNameChar = lastnameChar.substring(0, 1);
			System.out.println(classmates[i] + " --> Initial: " + firstNameChar + lastNameChar);
		}

	}

}
