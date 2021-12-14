package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class Question {

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q = new Question();
		q.studentMethod();
	}
	
	Scanner sc = new Scanner(System.in);
	public void print(Question q) {
		System.out.println("Inside print method.");
		System.out.println("Job done!");
	}
	
	public void studentMethod() {
		System.out.println("Question class - Inside student method.");
		System.out.println("Invoking print method.");
		Question q = new Question();
		q.print(q);
		
		//print();
	}

}
