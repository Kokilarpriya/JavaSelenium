package com.TechForum.Casting;

class Parent{
	String name;
	void method() {
		System.out.println("Method from Parent");
	}
}

class child extends Parent{
	int id;
	void method() {
		System.out.println("Method from child");
	}
}

public class CastingTest {
 public static void main(String[] args){
	 //upcasting - will be done internally, 
	 //generalization or widening
	 //access parent class methods
	 //only overriden methods in child class
	 Parent p = new child();
	 p.name = "Priya";
	 System.out.println(p.name);
	 p.method();
	 
	 //downcasting - narrowing
	 //Parent p = null;
	 child c = (child)p;
 }
}


