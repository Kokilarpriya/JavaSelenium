package com.TechForum.JavaPrograms;

public class SumAndProduct {

	public SumAndProduct() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling static method sum.");
		sum(10,20);
		System.out.println();
		System.out.println("Calling non static method multiply");
		SumAndProduct sap = new SumAndProduct();
		sap.multiply(10,20);
	}
	
	public static void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of the two numbers "+a+" and "+b+" is = "+sum);
	}
	
	public void multiply(int a, int b) {
		int product = a*b;
		System.out.println("Product of the two numbers "+a+" and "+b+" is = "+product);
	}

}
