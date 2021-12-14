package com.TechForum.Methods;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// MethodOverloading example
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter Number1: ");
		int a = sc.nextInt();
		System.out.println("Please enter Number2: ");
		int b = sc.nextInt();
		System.out.println("Please enter Number3: ");
		int c = sc.nextInt();
		System.out.println("Please enter Number4: ");
		int d = sc.nextInt();
		System.out.println("Please enter Number5: ");
		int e = sc.nextInt();
		new MethodOverloading().product(a);
		new MethodOverloading().product(a, b);
		new MethodOverloading().product(a, b, c);
		new MethodOverloading().product(a, b, c, d);
		new MethodOverloading().product(a, b, c, d, e);
		System.out.println("Please enter Decimal Number1: ");
		double f = sc.nextDouble();
		System.out.println("Please enter Decimal Number2: ");
		double g = sc.nextDouble();
		new MethodOverloading().product(f,g);
		sc.close();

	}

	public void product(int a) {
		int ans = a * 1;
		System.out.println("Method 1 - passing one parameter: Product of 1 and "+a+ " is = " + ans);
		System.out.println();
	}
	
	public void product(int a, int b) {
		int ans = a * b;
		System.out.println("Method 2 - passing two parameters: Product of "+a+ " and "+ b +" is = " + ans);
		System.out.println();
	}


	public void product(int a, int b, int c) {
		int ans = a * b * c;
		System.out.println("Method 3 - passing three parameters: Product of " + a+","+b+","+c+" is = " + ans);
		System.out.println();
	}

	public void product(int a, int b, int c, int d) {
		int ans = a * b * c * d;
		System.out.println("Method 4 - passing four parameters: Product of "+a+","+b+","+c+","+d+" is = "+ ans);
		System.out.println();
	}

	public void product(int a, int b, int c, int d, int e) {
		int ans = a * b * c * d * e;
		System.out.println("Method 5 - passing five parameters: Product of "+a+","+b+","+c+","+d+","+e+" is = "+ ans);
		System.out.println();
	}
	

	public void product(double a, double b) {
		double ans = a * b;
		System.out.println("Method 6 - passing two parameters with different datatypes:  Product of "+a+ " and "+ b +" is = " + ans);
		
	}
}
