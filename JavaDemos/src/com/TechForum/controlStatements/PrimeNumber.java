package com.TechForum.controlStatements;

public class PrimeNumber {

	public static void main(String[] args) {
		// Print prime numbers
		PrimeNumber pm = new PrimeNumber();
		pm.getPrimeNumber();		
	}
	
	public void getPrimeNumber() {
		int num=0;
		int i = 0;
		String primeNum ="";
		for(i=1;i<=20;i++) {
			int counter= 0;
			for(num = i;num>=1;num--) {
				if(i%num==0) {
					counter = counter + 1;
				}
			}
			if(counter == 2) {
				primeNum = primeNum + i + " " ;
			}
		}
		
		System.out.println("Prime number from 1 to 20 are :\" "+ primeNum+"\"");
		
		
	}

}
