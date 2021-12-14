package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class PrintSum {
	// int limit = 0;
	public PrintSum() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will help you to find out:");
		System.out.println("1.Even numbers within the given limit.");
		System.out.println("2.Check if those even numbers are divisible by 3.");
		System.out.println("3.Finally print the sum of numbers satisfying these conditions.");
		System.out.println("---------------------------------------------------------------");
		System.out.print("Please enter the limit:");
		int limit = sc.nextInt();
		PrintSum ps = new PrintSum();

		ps.calculateSum(limit);
		sc.close();
	}

	public void calculateSum(int limit) {
		int sum = 0;
		// Even numbers
		System.out.print("Even numbers within the given limit are: ");
		for (int i = 0; i <= limit; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Numbers divisible by 3:
		System.out.print("Even numbers within the given limit that's divisible by 3: ");
		for (int i = 0; i <= limit; i = i + 2) {
			if (i % 3 == 0) {
				 System.out.print(i+" ");
			}
		}
		System.out.println();
		// find even numbers
		for (int i = 0; i < limit; i = i + 2) {
			if (i % 3 == 0) {
				sum = sum + i;

			}
		}
		System.out.println("Sum of even numbers within the given limit that's divisible by 3: " + sum);
		System.out.println();

	}

}
