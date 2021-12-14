package com.TechForum.OOPSVehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleService vs = new VehicleService();
		Car c1 = vs.createCar("Ferarri","SF90","sports");
		c1.getManufacturerInformation();
		Car c2 = vs.createCar("Hyundai","Elantra","sedan");
		c2.getManufacturerInformation();
		Car c3 = vs.createCar("Maserati","GrandTurismo","sports");
		c3.getManufacturerInformation();
		System.out.println();
		Bike b1 = vs.createBike("Kawasaki", "Ninja H2", "sports");
		b1.getManufacturerInformation();
		Bike b2 = vs.createBike("Royal Enfield", "Classic 350", "cruiser");
		b2.getManufacturerInformation();
		Bike b3 = vs.createBike("Yamaha", "Y2F", "sports");
		b3.getManufacturerInformation();
		System.out.println();
		System.out.println("--------Compare Car1(sports) and Car2(sedan)-----------");
		int speedCompare1 = vs.compareCarMaxSpeed(c1,c2) ;
		System.out.println("Final comparison result:"+speedCompare1);
		System.out.println();
		System.out.println("--------Compare Car1(sports) and Car3(sports)-----------");
		int speedCompare2 = vs.compareCarMaxSpeed(c1,c3) ;
		System.out.println("Final comparison result:"+speedCompare2);
		System.out.println();
		System.out.println("--------Compare Bike1(sports) and Bike2(cruiser)-----------");
		int speedCompare3 = vs.compareBikeMaxSpeed(b1,b2) ;
		System.out.println("Final comparison result:"+speedCompare3);
		System.out.println();
		System.out.println("--------Compare Bike1(sports) and Bike3(sports)-----------");
		int speedCompare4 = vs.compareBikeMaxSpeed(b1,b3) ;
		System.out.println("Final comparison result:"+speedCompare4);
		
		
	}

}
