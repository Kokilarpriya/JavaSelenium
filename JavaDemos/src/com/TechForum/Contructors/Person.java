package com.TechForum.Contructors;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Person().display();
	}

	
	String name;
	int age;
	String address;
	
	Person(){
		name="ABC";
		age=5;
		address="India";
	}
	
	
	//only if instance is created constructor will be called 
	void display() {
		System.out.println(name+" "+age+" "+address);
	}
	
	
}

