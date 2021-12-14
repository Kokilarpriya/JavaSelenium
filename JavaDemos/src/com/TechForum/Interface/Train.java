package com.TechForum.Interface;

public class Train implements IVehicle,IPublicTransport {

	@Override
	public void getNumberofPeople() {
		// TODO Auto-generated method stub
		System.out.println("There are 100 people");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The train is in drive mode");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The train is turning left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The train is in brake mode");
	}

}
