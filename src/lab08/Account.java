package lab08;

import java.io.PrintStream;

import java.util.Random;
//import java.lang.Math;

public class Account {
	private int id; 
	private String owner; 
	private double balance;
	
	public Account (String owner, double balance) {
		Random r = new Random();
	    int id = r.nextInt(123456);
	    
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
		
	public void setBalance(double balance) {
		this.balance = balance;
		
	};
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Deposit cannot be less than 0"); 
		}

	}
	
	public void withdraw(double amount) {
		double currentBalance = getBalance();
		
		if (currentBalance < amount) {
			System.out.println("Amount exceeds your balance.");
		} else {
			currentBalance -= amount;
			setBalance(currentBalance);
		}
	}
	
	public void addInterest() {
		double interestRate = 0.025;
		double currentBalance = getBalance();
		double interest = currentBalance * interestRate;
		setBalance(currentBalance += interest);
	}
	
	public PrintStream getDetails() {
		return System.out.printf("Hello %s\nUser ID: %d\nYour Balance: £%.2f\n", owner, id, balance);
	}
}
