package AccountTest;

public class Account {
	
	private double balance; //instance variables
	
	//constructor
	
	public Account(double initialBalance) {
		if(initialBalance>0.0) {
			balance = initialBalance;
		}
		
	}
	
	//methods
	public void credit(double amount) {
		balance = balance + amount ;
	}
	/*
	public void withdraw(double amount) {
		balance = balance - amount;
	}*/
	public double getBalance() {
		return balance;
	}
	
	
}
