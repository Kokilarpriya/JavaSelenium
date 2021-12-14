package com.TechForum.controlStatements;

import java.util.Scanner;

public class IfAverage{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		IfAverage a = new IfAverage();
		a.getValues();
		
	}
	
	public void getValues() {
		
		System.out.println("Please enter student's marks");
		System.out.println("Enter the marks for English:");
		int a = sc.nextInt();
		System.out.println("Enter the marks for Tamil:");
		int b = sc.nextInt();
		System.out.println("Enter the marks for Math:");
		int c = sc.nextInt();
		System.out.println("Enter the marks for Science:");
		int d = sc.nextInt();
		System.out.println("Enter the marks for Social:");
		int e = sc.nextInt();
		System.out.println("Enter student's name:");
		String name = sc.next();
		int total = a+b+c+d+e;
		double average = total/5;
		
		
		if(average>=90) {
			System.out.println(name +" passed with distinction with an average of "+average);
		} else if(average>=80 && average<90){
			System.out.println(name +" passed in first class with an average of "+average);
			
		}else if(average>=60 && average<80) {
			System.out.println(name+ " passed in second class  with an avergae of "+average);
		}
		else {
			System.out.println(name +" failed in the exam  with an avergae of "+average);
		}		
		
	}

}
