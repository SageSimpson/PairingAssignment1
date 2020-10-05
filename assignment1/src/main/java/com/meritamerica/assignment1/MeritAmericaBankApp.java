package com.meritamerica.assignment1;

import java.util.Scanner;

public class MeritAmericaBankApp {
	public static void main (String[] args) {
//		This is the blueprint for the login and navigation of the app
			
			/*
			 * Enter bank account credentials
			 * -	if credentials are correct display welcome menu
			 * -	welcome menu give options to deposit or withdraw
			 * -	if withdraw is greater than balance displace error message
			 * */
			
			// This is the instance of the Account holder  
			AccountHolder s = new AccountHolder("Dominic", "Smith", "Fontez", 430695604, 0.00, 0.00);
			
			System.out.println("Card Holder is: " + s);
			
			//if(pin==pin) {
				System.out.println("-------------------------------------");
				System.out.println("|||||||||||||||||||||||||||||||||||||");
				System.out.println("-------------------------------------");
				System.out.println("Welcome + AccountHolder");
				System.out.println("-------------------------------------");
				System.out.println("|||||||||||||||||||||||||||||||||||||");
				System.out.println("-------------------------------------");
			//} 
			//System.out.nextln();
			System.out.println("Select From Following Options: \n"
					+ "[a] Veiw Checking Account \n"
					+ "[b] View Savings Account \n"
					+ "[z] Main Menu");
			/*switch(options) {
			  case a:
			    // view checking  account
			    break;
			  case b:
			    // view savings account
			    break;
			  case c:
				// withdraw
				break;
			  case d:
				// deposit to account
				break;  
			  default:
			    // main menu
			}*/
			
			//Exit statement
			System.out.println("Thank You For Banking With Us \n Have A Nice Day ");
		}
	}
