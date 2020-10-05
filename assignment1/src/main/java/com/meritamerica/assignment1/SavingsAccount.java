package com.meritamerica.assignment1;

public class SavingsAccount extends MeritAmericaBankApp{
	
	double savingsBalance = 0.00;
	int year;
	
	private double withdraw(double subtract) {
		savingsBalance -= subtract;
		return savingsBalance;
	}
	
	private double deposit(double increase) {
		savingsBalance += increase;
		
		return savingsBalance;
	}
	
	private double futureBalance() {
		double interestRate = Math.pow(savingsBalance, year);
		return interestRate;
		
	}

}

