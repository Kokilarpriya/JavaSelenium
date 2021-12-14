package com.TechForum.JavaPrograms;

public class StudentSchoolCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		String studentName = s.print();

		School sc = new School();
		String schoolName = sc.print();

		System.out.println("-----------------------------------------------------");
		System.out.println("Student name is: " + studentName + " and School name is: " + schoolName);
	}

}
