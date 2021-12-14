package com.TechForum.OOPSVehicle;

public class VehicleService {
	/*
	 * create a Car object and return it
	 */
	public Car createCar(String name, String modelName, String type) {
		Car c = new Car(name, modelName,type);
		return c;

	}

	/*
	 * create a bike object and return it
	 */
	public Bike createBike(String name, String modelName, String type) {
		Bike b = new Bike(name, modelName,type);
		return b;

	}

	/*
	 * Method should compare the speed only if the vehicle is of "SPORTS" type.
	 * Method should return 0 when speeds are equal otherwise should return maximum
	 * vehicle speed. Method returns -1 if the type is not "SPORTS"
	 */
	public int compareCarMaxSpeed(Car first, Car second) {
		
		String type1 = first.getType();
		//System.out.println("type1="+type1);
		String type2 = second.getType();
		//System.out.println("type2="+type2);
		if(type1!=null && type1=="sports"){
			if(type2!=null && type2=="sports") {
				int speed1 = first.maxSpeed(first.getType());
				System.out.println("Car1 speed:"+speed1+"kmh");
				int speed2 = second.maxSpeed(second.getType());
				System.out.println("Car2 speed:"+speed2+"kmh");
				if(speed1>speed2) {
					System.out.println(first.getName() +" speed is higher.");
					return speed1;
				}else if (speed1<speed2) {
					System.out.println(second.getName()+" speed is higher.");
					return speed2;
				}else if(speed1 == speed2) {
					System.out.println("Car speeds are equal.");
					return 0;
				}
			}
			else {
				System.out.println("**Can compare speeds only if both are sports car**");
				return -1;
			}
		}
		else {
			System.out.println("**Can compare speeds only if both are sports car**");
			return -1;
		}
		
		
		return 0;
		/*
		 * Downcast the vehicles to their respective concrete types
		 */

	}
	
public int compareBikeMaxSpeed(Bike first, Bike second) {
		
		String type1 = first.getType();
		//System.out.println("type1="+type1);
		String type2 = second.getType();
		//System.out.println("type2="+type2);
		if(type1!=null && type1=="sports"){
			if(type2!=null && type2=="sports") {
				int speed1 = first.maxSpeed(first.getType());
				System.out.println("Bike1 speed:"+speed1+"kmh");
				int speed2 = second.maxSpeed(second.getType());
				System.out.println("Bike2 speed:"+speed2+"kmh");
				if(speed1>speed2) {
					System.out.println(first.getName() +" speed is higher.");
					return speed1;
				}else if (speed1<speed2) {
					System.out.println(second.getName()+" speed is higher.");
					return speed2;
				}else if(speed1 == speed2) {
					System.out.println("Bike speeds are equal.");
					return 0;
				}
			}
			else {
				System.out.println("**Can compare speeds only if both are sports bikes**");
				return -1;
			}
		}
		else {
			System.out.println("**Can compare speeds only if both are sports bikes**");
			return -1;
		}
		
		
		return 0;
		/*
		 * Downcast the vehicles to their respective concrete types
		 */

	}

	/*
	 * public int compareMaxSpeed(Vehicle first, Vehicle second) { Car car = (Car)
	 * first; Bike bike = (bike) second; return 0;
	 * 
	 * }
	 */
}