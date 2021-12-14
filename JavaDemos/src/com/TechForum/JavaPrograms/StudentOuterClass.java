package com.TechForum.JavaPrograms;

public class StudentOuterClass {
	public StudentOuterClass() {
		System.out.println("This is the constructor of student outer class.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is an outer class.");
	}
	
	// inner class
	 class StudentInnerClass{
		 
		public void print() {
			System.out.println();
			System.out.println("This is the print method of student inner class.");
		}
	}

}
