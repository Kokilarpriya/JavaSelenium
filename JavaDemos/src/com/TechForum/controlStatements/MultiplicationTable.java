package com.TechForum.controlStatements;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to print the corresponding multiplication table:");
		int tableNumber = sc.nextInt();
		
		new MultiplicationTable().printXTable(tableNumber);
		sc.close();
	}
	
	public void printXTable(int tableValue) {
		System.out.println("**************************************");
		System.out.println("Multiplication table for the value:"+tableValue);
		System.out.println("**************************************");
		for(int i=1;i<=20;i++) {
			int ans = i*tableValue;
			System.out.println(i+"*"+tableValue+"=" +ans);
		}
	}
	
}
