package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class CirclePerimeter {
	double perimeter;
	double area;

	public static void main(String[] args) {
		// Calculate the perimeter of a circle
		new CirclePerimeter().getValues();
	}

	public void getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double r = sc.nextDouble();
		perimeter = 2 * Math.PI * r;
		System.out.println("****************************************************");
		System.out.println("Perimeter of the circle is: " + perimeter);
		System.out.print("Perimeter of circle rounded off to two digits: ");
		System.out.printf("%.2f", perimeter);
		System.out.println();
		System.out.println("****************************************************");
		area = perimeter * r;
		System.out.println("Area of the circle is: "+area);
		System.out.print("Area of circle rounded off to two digits: ");
		System.out.printf("%.2f", area);
		//double roundOff = (double) Math.round(perimeter);
		//System.out.printf("%.2d", perimeter);
		//System.out.println("Permeter of circle rounded off to two digits :"+roundOff);
		sc.close();
	}

}
