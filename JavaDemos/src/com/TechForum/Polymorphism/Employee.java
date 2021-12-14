package com.TechForum.Polymorphism;


public class Employee extends Person {

	Employee() {
		super();
	}
	
	/*
	 * Employee(String name, String occupation, double salary) {
	 * super("Mark","QE",100000); }
	 */
    private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    //overridden method
	public String getName() {
		Person p = new Person();
		
		p.setName("Jeff");
		String name = p.getName();
		//System.out.println("Name :"+name);
		return name;
	}
	
	public String getOccupation() {
		return "Scrum Master";
	}
	
	
}
