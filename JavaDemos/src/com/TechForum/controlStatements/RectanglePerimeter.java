package com.TechForum.controlStatements;

import java.util.Scanner;

public class RectanglePerimeter {

	double perimeter;

	public static void main(String[] args) {
		// Calculate the perimeter of a rectangle
		new RectanglePerimeter().getValues();
	}

	public void getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle:");
		double b = sc.nextDouble();
		perimeter = new RectanglePerimeter().perimeterCalculator(l, b);
		System.out.println("Perimeter of rectangle is " + perimeter);
		sc.close();
	}

	public double perimeterCalculator(double length, double breadth) {
		perimeter = 2 * (length + breadth);
		return perimeter;
	}

}
