package com.TechForum.Polymorphism;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Mark","QE",100000);
		//p.getName();
		//System.out.println("name in person:"+p.getName());
			Employee e = new Employee();
			e.setRole("Scrum master");
			System.out.println("Employee name in Person Class: "+p.getName());
			System.out.println("Employee name in Overriden method of Employee class: "+e.getName());
			System.out.println("Employee Occupation: "+e.getOccupation());
			System.out.println("Employee Salary: "+p.getSalary());
			System.out.println("Employee Role: "+e.getRole());
			
	}

}
