package com.TechForum.JavaPrograms;

public class StudentCallInnerClass {

	public static void main(String[] args) {
		//StudentOuterClass soc = new StudentOuterClass();
		// TODO Auto-generated method stub
		StudentOuterClass.StudentInnerClass in = new StudentOuterClass().new StudentInnerClass();
		in.print();

	}

}
