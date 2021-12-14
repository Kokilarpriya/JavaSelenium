package com.TechForum.Interface;

public class Car extends MotorisedVehicle implements IVehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The car is in drive mode");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The car is turning left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The car is in brake mode");
		
	}

}
