package com.meritamerica.assignment1;

public class AccountHolder extends MeritAmericaBankApp{
	AccountHolder(String firstName, String lastName, String middleName, int socSecNumber, double checkingBalance, 
			double savingsBalance){
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.socSecNumber = socSecNumber;
		
	}
	
	private String firstName;
	private String lastName;
	private String middleName;
	private int socSecNumber;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the socSecNumber
	 */
	public int getSocSecNumber() {
		return socSecNumber;
	}
	/**
	 * @param socSecNumber the socSecNumber to set
	 */
	public void setSocSecNumber(int socSecNumber) {
		this.socSecNumber = socSecNumber;
	}
	
	
	
	
	
}