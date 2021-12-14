package com.TechForum.Polymorphism;

/*
 *contains two String variables name,occupation ,one static integer variable age and one double variable salary.
 *contains a parameterised constructor with all 3 values.
 *contains static method to retrieve age of a person
 *contains final method to retrieve salary
 *contains non-static methods to retrieve syso and occupation
 */
public class Person {

	private String name;
	private String occupation;
	private static int age=34;
	private double salary;

	/* Default constructor */
	public Person() {
	}

	/* Parameterised constructor */
	public Person(String name, String occupation, double salary) {
		this.setName(name);
		this.setOccupation(occupation);
		this.setSalary(salary);

	}

	/* non-static method to get Name */

	public void setName(String name) {
		this.name = name;
		//System.out.println(name);
	}

	public String getName() {
		return name;
	}

	/* non-static method to get Occupation */
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		//System.out.println(occupation);
		this.occupation = occupation;
	}

	/* static method to get Age */

	public static void setAge(int age) {
		Person.age = age;
	}

	public static int getAge() {
		return age;
	}

	/* final method to get Salary */

	public void setSalary(double salary) {
		//System.out.println(salary);
		this.salary = salary;
	}

	public final double getSalary() {
		return salary;
	}

}
