package com.TechForum.Contructors;

public class Student {

	String name;
	int rollNo;
	String schoolName;
	String city;

	public Student(String name, int rollNo, String schoolName, String city) {
		// TODO Auto-generated constructor stub
		// name="ABC";
		this.name = name;
		this.rollNo = rollNo;
		this.schoolName = schoolName;
		this.city = city;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ABC", 32, "VMS", "Trichy");
		s.display();
	}

	void display() {
		System.out.println("Students details: " + name + " " + rollNo + " " + schoolName + " " + city);
	}

}
