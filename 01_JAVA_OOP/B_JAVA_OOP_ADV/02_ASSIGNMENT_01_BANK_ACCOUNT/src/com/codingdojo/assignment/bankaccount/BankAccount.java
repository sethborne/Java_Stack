package com.codingdojo.assignment.bankaccount;

import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
	//attributes
	private String accountNumber;
	private long checkingBalance;
	//instance variable
	private long savingsBalance;
	//class variable/static field for # of accounts created
	private static int numberOfAccounts = 0;
	//class variable for the # in an Account
	
	//Constructor Function
	public BankAccount() {
		numberOfAccounts += 1;
		System.out.println("INSTANTIATION :: The AccountID is " + numberOfAccounts);
		this.setAccountNumber(getRandomAccountNumber());
		String testAccountNumber = getAccountNumber();
		System.out.println("INSTANTIATION :: For AccountID " + numberOfAccounts + ", the Random Account Number is: " + testAccountNumber);
//		
		this.checkingBalance = 0;
		this.savingsBalance = 0;
	}
	// create a private method that returns a random 10 digit account number
	public static String getRandomAccountNumber() {
		// string of numbers to pull
		// String stringCharsForAccountNumber = "ABCDEFGHJKMNPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz"
		String stringCharsForAccountNumber = "0123456789";
		int numValAccountNumberLength = 10;
		StringBuilder randomAccountNumber = new StringBuilder( numValAccountNumberLength );
		//loop for random accountNumber
		Random rand = new Random();
		for(int i = 0; i < numValAccountNumberLength; i += 1){
			randomAccountNumber.append(stringCharsForAccountNumber.charAt(rand.nextInt(stringCharsForAccountNumber.length())));
		}
		String stringRandomAccountNumber = randomAccountNumber.toString();
		return stringRandomAccountNumber;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(long checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public long getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(long savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public void deposit(String accountType, int depositAmount) {
		if ( accountType == "Checking" || accountType == "checking" ) {
//			System.out.println("You are in the Checking Deposit Loop!");
//			System.out.println("METHODCHECK depositChecking :: " + this.accountNumber + " has " + this.getCheckingBalance() + " in Checking at Start of Transaction.");
			this.setCheckingBalance(this.checkingBalance += depositAmount);
			//check
//			System.out.println("METHODCHECK depositChecking :: " + this.accountNumber + " has " + this.getCheckingBalance() + " in Checking.");
			System.out.println("METHODCHECK depositChecking :: " + this.accountNumber + " has successfully deposited " + depositAmount + " in Checking");
		}
		else if ( accountType == "Savings" || accountType == "savings" ) {
//			System.out.println("You are in the Saving Deposit Loop!");
//			System.out.println("METHODCHECK depositSavings :: " + this.accountNumber + " has " + this.getSavingsBalance() + " in Savings at Start of Transaction.");
			this.setSavingsBalance(this.savingsBalance += depositAmount);
//			System.out.println("METHODCHECK depositSavings :: " + this.accountNumber + " has " + this.getSavingsBalance() + " in Savings.");
			System.out.println("METHODCHECK depositSavings :: " + this.accountNumber + " has successfully deposited " + depositAmount + " in Savings");
		}
		else {
			System.out.println("Invalid Parameters Listed.  Please try Your Deposit Again.");
		}
	}
	public void withdrawl(String accountType, int withdrawlAmount) {
		if ( accountType == "Checking" || accountType == "checking" ) {
//			System.out.println("You are in the Checking Withdrawl Loop!");
//			System.out.println("METHODCHECK withdrawlChecking :: " + this.accountNumber + " has " + this.getCheckingBalance() + " in Checking at Start of Transaction.");
			if( this.getCheckingBalance() < withdrawlAmount ) {
				System.out.println("METHODCHECK withdrawlChecking :: " + this.accountNumber + " tried to withdrawl " + withdrawlAmount + " and only has " + this.getCheckingBalance()  + ". Insufficent Funds in Checking for Withdrawl.  Transaction Cancelled.");
			}
			else {
				this.setCheckingBalance(this.checkingBalance -= withdrawlAmount);
			}
//			System.out.println("METHODCHECK withdrawlChecking :: " + this.accountNumber + " has " + this.getCheckingBalance() + " in Checking.");
		}
		else if ( accountType == "Savings" || accountType == "savings" ) {
//			System.out.println("You are in the Saving Withdrawl Loop!");
			if( this.getCheckingBalance() < withdrawlAmount ) {
				System.out.println("METHODCHECK withdrawlSavings :: " + this.accountNumber + " tried to withdrawl " + withdrawlAmount + " and only has " + this.getSavingsBalance() + ". Insufficent Funds in Savings for Withdrawl.  Transaction Cancelled.");
			}
			else {
				this.setSavingsBalance(this.savingsBalance -= withdrawlAmount);
			}
		}
		else {
			System.out.println("Invalid Parameters Listed.  Please try Your Withdrawl Again.");
		}
	}
	public String getAccountBalances() {
		int totalAccountBalance = (int)this.getSavingsBalance() + (int)this.getCheckingBalance();
		String strAccountBalances = "METHODCHECK :: Account Number " + this.accountNumber + " has " + this.getSavingsBalance() + " in Savings and " + this.getCheckingBalance() + " in Checking, for an Account Total of " + totalAccountBalance + " .";
		return strAccountBalances;
	}
}
