package day25_method;

public class MethodWithParameters {

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
		
//		sayHello(classmates[6]);

		for (String name : classmates) {
			sayHello(name);
//			MethodDemo.sayHello(name);
		}
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello, "+name);
	}

}
