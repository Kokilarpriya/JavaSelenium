package com.TechForum.Interface;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.brake();
		c.drive();
		c.turnLeft();
		System.out.println("----------------------------");
		Train t = new Train();
		t.brake();
		t.drive();
		t.turnLeft();
		t.getNumberofPeople();
	}

}
