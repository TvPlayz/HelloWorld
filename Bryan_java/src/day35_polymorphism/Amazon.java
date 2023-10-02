package day35_polymorphism;

public class Amazon {

	public static void main(String[] args) {
	
		Employee john = new Tester("John","1234123412",20, "2021231234","123456","SDET", 120000, 60, false);
		
		Employee alex = new Chef("Alex","1234123415",20, "2021231235","123457", "Chef", 75000, 45, true);
		
		Employee david = new UberDriver("David","1234123419",45,"2021231234","123458", "UberDriver", 55000, 45, false);

	}

}
