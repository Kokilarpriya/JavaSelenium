package com.TechForum.controlStatements;

public class switchCase {

	public static void main(String[] args) {
		// Switch case

		// Declaring a variable for switch expression.
		char city = 'd'; // Here, city is set to 'd'.
		// Switch expression with char value.
		switch (city) {
		// Case statements.
		case 'm':
			System.out.println("Mumbai");
			break;
		case 'd':
			System.out.println("Delhi");
			break;
		case 'c':
			System.out.println("Chennai");
			break;
		case 'r':
			System.out.println("Ranchi");
			break;
		default:
			System.out.println("Did not match");
			break;

		}
	}

}
