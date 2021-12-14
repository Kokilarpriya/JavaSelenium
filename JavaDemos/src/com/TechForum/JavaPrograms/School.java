package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class School {
	Scanner sc = new Scanner(System.in);
	public String print() {
		System.out.println();
		System.out.println("This is print method in school class.");
		System.out.println("Please enter school name:");
		String scname = sc.next();
		return scname;
	}

}
