package day33_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {

	public static void main(String[] args) {
		
		Employee atifa = new Employee();
		atifa.setName("Atifa");
		atifa.setId(10001);
		atifa.setSalary(95000);
		atifa.setJobTitle("QA Engineer");

		System.out.println(atifa);
		atifa.work();
		
		Employee zach = new Employee("Zach", "SDET",125000,10002);
		
		Employee gautam = new Employee("Gautam", "Manual Tester", 80000, 10003);
		
		Employee bryan = new Employee("Bryan", "Scrum Master",120004, 10004);
		
		Employee saroj = new Employee("Saroj", "Java Developer", 150000, 10005);
		
		ArrayList<Employee> team1 = new ArrayList<>();
		
		team1.add(saroj);
		team1.add(bryan);
		team1.addAll(Arrays.asList(zach, gautam, atifa));
		
		for(int i = 0; i < team1.size(); i++) {
//			System.out.println(team1.get(i));
			team1.get(i).work();
//			team1.get(i).getSalary();
			System.out.println(team1.get(i).getSalary());
		}
		
	}

}
