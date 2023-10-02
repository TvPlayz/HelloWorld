package week00HW;

//		Question 1:
public class HelloWorld_Class {

	public static void main(String[] args) {

//		Question 2:

		System.out.println("Name:");
		String name = "Bryan";
		System.out.println(name);

		System.out.println(" ");

		System.out.println("CompanyName:");
		String companyName = "TechCircle";
		System.out.println(companyName);

		System.out.println(" ");

		System.out.println("jobTitle:");
		String jobTitle = "Engineer";
		System.out.println(jobTitle);

		System.out.println(" ");

		System.out.println("gender:");
		char gender = 'M';
		System.out.println(gender);

		System.out.println(" ");

		System.out.println("salary:");
		double salary = 1030.48;
		System.out.println(salary);

		System.out.println(" ");

		System.out.println("employeeID");
		int id = 7486;
		System.out.println(id);

		System.out.println(" ");

		System.out.println("hasBenefits:");
		boolean hasBenefits = true;
		System.out.println(hasBenefits);

		System.out.println(" ");

		System.out.println("isMarried:");
		char isMarried = 'N';
		System.out.println(isMarried);

		System.out.println(" ");
//		Question 3:
		System.out.println("Hello");
		System.out.println(name);

		System.out.println(" ");
//		Question 4:

		System.out.println("Solve this Equation");
		System.out.println("9+10");
		int num1 = 9;
		int num2 = 10;

		int sum = num1 + num2;

		System.out.println(sum);

		System.out.println(" ");
//		Question 5:

		System.out.println("Solve this Equation");
		System.out.println("18/3");
		int num3 = 18;
		int num4 = 3;

		int div = num3 / num4;

		System.out.println(div);

		System.out.println(" ");
//		Question 6:
		
		System.out.println("Print the sum (additonn), multiply, subtract, divide, and remainder of two numbers");

		int num5 = 8;
		int num6 = 2;

		int sum1 = num5 + num6;
		int multi = num5 * num6;
		int subt = num5 - num6;
		int div1 = num5 / num6;
		int remainder = num5 % num6;

		System.out.println(sum1);
		System.out.println(multi);
		System.out.println(subt);
		System.out.println(div1);
		System.out.println(remainder);
		
		System.out.println(" ");
//		Question 7:
		System.out.println("Swap two numbers without using a temporary variable x = 10 & y = 20");
		
		int x = 10;
		int y = 20;
		
		x = x - y;
		y = x + y;
		x = y - x;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println(" ");
//		Primitive types challenge:
		System.out.println("Primitive types challenge:");
		
			byte byteNumber = 100;
	        short shortNumber = 1559;
	        int intNumber = 263076;
	        long longNumber = 50000 + (10 * (byteNumber + shortNumber + intNumber));
	        System.out.println(longNumber);
		

	}

}
