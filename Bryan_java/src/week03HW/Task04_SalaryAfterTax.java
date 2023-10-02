package week03HW;

import java.util.Scanner;

public class Task04_SalaryAfterTax {

	public static void main(String[] args) {
		
		double tax = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Are you married: Y/N: ");
		String marry = scan.next().toUpperCase();
		System.out.println("Enter your salary: ");
		int salary = scan.nextInt();

		switch (marry) {
		case "Y":
			if (salary <= 80000) {
				tax = salary * 0.15;
			} else if (salary > 80000 && salary <= 100000) {
				tax = 12000 + ((salary - 80000) * 0.2);
			} else if (salary > 100000 && salary <= 130000) {
				tax = 16000 + ((salary - 100000) * 0.25);
			} else
				tax = 23500 + ((salary - 130000) * 0.3);
			break;

		case "N":
			if (salary <= 80000) {
				tax = salary * 0.2;
			} else if (salary > 80000 && salary <= 100000) {
				tax = 16000 + ((salary - 80000) * 0.25);
			} else if (salary > 100000 && salary <= 130000) {
				tax = 21000 + ((salary - 100000) * 0.3);
			} else
				tax = 30000 + ((salary - 130000) * 0.35);
			break;
		default:
			System.out.println("Invalid input!!!!");

		}
		System.out.println("You have to pay tax $ " + tax);

		scan.close();


	}

}
