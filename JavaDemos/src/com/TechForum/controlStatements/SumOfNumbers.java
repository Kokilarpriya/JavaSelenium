package com.TechForum.controlStatements;

import java.util.Scanner;

public class SumOfNumbers {
	static Scanner sc = new Scanner(System.in);
	
 public static void main(String[] args) {
	 SumOfNumbers son = new SumOfNumbers();
	 son.getLimit();
}
 
 public void getLimit() {
	 System.out.println("Please enter the number limit: ");
	 int n = sc.nextInt();
	 int sum=0;
	 for(int i=1;i<=n;++i) {
		 sum = sum + i;		 
	 }
	 System.out.println("Sum of the first " +n+ " natural numbers is = "+ sum);
 }
}


//Get values from user to find the sum of n numbers
/*public void getValues() {
	 System.out.println("Please enter the count of numbers: ");
	 int n = sc.nextInt();
	 int sum=0;
	 for(int i=1;i<=n;++i) {
		 System.out.println("Please enter number "+i+":");
		 int x=  sc.nextInt();
		 sum = sum + x;		 
	 }
	 System.out.println("Sum of the numbers is ="+ sum);
}
*/