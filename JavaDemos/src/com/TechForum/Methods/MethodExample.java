package com.TechForum.Methods;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void OddNumbers(int a, int b) {
		int startNum;
		int endNum;
		if (a >= b) {
			startNum = b;
			endNum = a;
		} else {
			startNum = a;
			endNum = b;
		}
		if (startNum % 2 == 0) {
			startNum++;
		}
		System.out.println("Odd number(s) within the range are");
		for (int i = startNum; i <= endNum; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void GreaterNumber(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else if (b > a) {
			System.out.println(b + " is greater than " + a);
		} else {
			System.out.println("Both the numbers are equal");
		}
	}

	public void Calculator(int a, int b) {
		int product = a * b;
		System.out.println("Product of given numbers =" + product);
		System.out.println();
		int sum = a + b;
		System.out.println("Sum of given numbers =" + sum);
		System.out.println();
		int bigNum;
		int smallNum;
		if (a >= b) {
			bigNum = a;
			smallNum = b;
		} else {
			bigNum = b;
			smallNum = a;
		}

		int diff = bigNum - smallNum;
		System.out.println("Difference of given numbers = " + diff);
		System.out.println();
		int mod = a % b;
		System.out.println("Modulus of given numbers =" + mod);
		System.out.println();
	}

}
