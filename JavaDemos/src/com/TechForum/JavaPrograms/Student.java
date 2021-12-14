package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);

	public String print() {
		System.out.println("This is print method in student class.");
		System.out.println("Please enter student name:");
		String sname = sc.next();
		return sname;
		
	}
}
