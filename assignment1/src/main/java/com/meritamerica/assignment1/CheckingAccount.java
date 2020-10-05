package com.meritamerica.assignment1;


public class CheckingAccount extends MeritAmericaBankApp{
	
	double checkingBalance = 0.00;
	int year;
	
	private double withdraw(double subtract) {
		checkingBalance -= subtract;
		return checkingBalance;
	}
	
	private double deposit(double increase) {
		checkingBalance += increase;
		
		return checkingBalance;
	}
	
	// This is the method for the compounded interest
	private double futureBalance() {
		double interestRate = Math.pow(checkingBalance, year);
		return interestRate;
		
	}
	
}