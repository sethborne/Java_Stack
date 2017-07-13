package com.codingdojo.assignment.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount newBA1 = new BankAccount();
		String spacer = "                                                                  ";
		// ID 1
		// ID 1 - RAND ACCOUNT A
		System.out.println("OUTPUTCHECK :: The Account Number is " + newBA1.getAccountNumber());
		// CONFIRM ACCOUNT A
		
		System.out.println(spacer);
		
//		long newBA1AccountBalSave = newBA1.getSavingsBalance();
//		long newBA1AccountBalCheck = newBA1.getCheckingBalance();
//		String newBA1AccountCheck = "OUTPUTCHECK :: Account Number " + newBA1AccountNum + " has " + newBA1.getSavingsBalance() + " in Savings and " + newBA1.getCheckingBalance() + " in Checking.";
		System.out.println(newBA1.getAccountBalances());
		
		System.out.println(spacer);
		
		//way to check direct attributes
//		newBA1.checkingBalance = 500;
		
		System.out.println(spacer);
		
		newBA1.deposit("Checking", 100);
		System.out.println(newBA1.getAccountBalances());
		newBA1.withdrawl("Checking", 150);
		System.out.println(newBA1.getAccountBalances());
		newBA1.deposit("Checking", 50);
		System.out.println(newBA1.getAccountBalances());
		newBA1.withdrawl("Checking", 150);
		System.out.println(newBA1.getAccountBalances());
		newBA1.deposit("Savings", 50);
		System.out.println(newBA1.getAccountBalances());
		newBA1.deposit("Savings", 75);
		System.out.println(newBA1.getAccountBalances());
		newBA1.withdrawl("Savings", 150);
		System.out.println(newBA1.getAccountBalances());
		newBA1.withdrawl("Savings", 150);
		System.out.println(newBA1.getAccountBalances());
		
		System.out.println(spacer);
		
		System.out.println(newBA1.getAccountBalances());
		
		System.out.println(spacer);
		
		BankAccount newBA2 = new BankAccount();
		// ID 2
		// ID 2 - RAND ACCOUNT B
		System.out.println("OUTPUTCHECK :: The Account Number is " + newBA2.getAccountNumber());
		// CONFIRM ACCOUNT B
		
		System.out.println(spacer);
		

		
		System.out.println(spacer);
	}

}
