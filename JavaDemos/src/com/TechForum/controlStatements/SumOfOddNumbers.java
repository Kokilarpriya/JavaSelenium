package com.TechForum.controlStatements;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a limit to find the sum of odd numbers:");
		int value = sc.nextInt();
		
		
		new SumOfOddNumbers().getSum(value);
		sc.close();
	}
	
	public void getSum(int num) {
		int sum = 0;
		int limit = num+num;
		/*
		 * System.out.println("Odd numbers within the given limit are: "); for(int
		 * i=1;i<=num;i=i+2) { System.out.print(i); System.out.print(" "); sum=sum+i; }
		 */
		
		System.out.println();
		System.out.println("First "+num+" odd numbers are:");
		for(int i=1;i<=limit;i=i+2) {
			System.out.print(i);
			System.out.print(" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println();
		System.out.println("Sum of the above odd numbers is: "+sum);
		
		
	}
	
}
