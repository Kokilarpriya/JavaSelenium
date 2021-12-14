package com.TechForum.Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NRIAccount nri = new NRIAccount();
		SeniorCitizen sc = new SeniorCitizen();
		System.out.println("----Calling with NRI instance------");
		nri.depositMoney();
		nri.withdrawMoney();
		nri.applyFixedDeposit();
		System.out.println("----Calling with SC instance------");
		sc.depositMoney();
		sc.withdrawMoney();
		sc.applyFixedDeposit();

	}

}
