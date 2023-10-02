package day29_ClassAndObject;

public class PNC {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.showBalance();
		
		account1.accountName = "Summer";
		
		account1.accountNumber = 100008L;
		
		account1.deposit(1000000);
		
		account1.showBalance();
		
		account1.withdraw(350000);
		
		account1.showBalance();
		
		account1.withdraw(500000);
		
		account1.showBalance();
		
		System.out.println(account1.getInfo());
		
		BankAccount account2 = new BankAccount();
		
		

	}

}
