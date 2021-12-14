package com.TechForum.Inheritance;

public class BankAccount {
	double interestRate = 9.5;
	double depositAmount = 100.00;
	double withdrawAmount = 50.00;
	double balance = 0;
	void depositMoney() {
		System.out.println("Deposit Amount is:"+depositAmount);
	}
	
	void withdrawMoney() {
		System.out.println("Withdraw Amount is:"+withdrawAmount);
		balance = depositAmount - withdrawAmount;
		System.out.println("Balance Amount: "+balance);
	}
	
	
}
