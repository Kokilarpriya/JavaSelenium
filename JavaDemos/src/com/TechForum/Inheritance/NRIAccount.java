package com.TechForum.Inheritance;

public class NRIAccount extends BankAccount{
	void applyFixedDeposit() {
		interestRate = 6.5;
		//super.interestRate= 6.5;
		System.out.println("Interest Rate for NRIAccount :"+interestRate);
		
	}
}
