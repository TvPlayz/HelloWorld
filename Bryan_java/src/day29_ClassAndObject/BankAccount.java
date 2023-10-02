package day29_ClassAndObject;

public class BankAccount {
	
	// instance variables
	String accountName;
	long accountNumber;
	double balance;
	
	public void setInfo(String name , long accountNum, double accountBalance) {
		accountName = name;
		accountNumber = accountNum;
		balance = accountBalance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void showBalance() {
		System.out.println("As of today balance is $"+ balance);
	}
	
	public String getInfo() {
		String msg = "BankAccount Class"+" account name : "+ accountName + " , account number : "+ accountNumber+" , account balance : "+ balance;
			return msg;
	}

}
