package com.TechForum.Inheritance;

public class SeniorCitizen extends BankAccount {
	void applyFixedDeposit() {
		super.interestRate= 10.5;
		System.out.println("Interest Rate for SeniorCitizen :"+interestRate);
	}
}
