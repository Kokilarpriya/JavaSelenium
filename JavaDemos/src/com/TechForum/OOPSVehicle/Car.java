package com.TechForum.OOPSVehicle;

public class Car extends AbstractManufacturer implements Vehicle {
    /*
    Parameterized constructor to initialize instance variables
     */
    public Car(String name, String modelName, String carType) {
        this.setName(name);
        this.setModelName(modelName);
        this.setType(carType);
    }

    /*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(final String carType) {
    	if (carType == "sports") {
    		//System.out.println("Car type:"+carType);
    		return 250;
    	}else if (carType == "sedan") {
    		//System.out.println("Car type1:"+carType);
    		return 190;
    	}
    	else {		
    		return 0;
    	}
    }
    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	String name = getName();
    	String modelName = getModelName();
    	String type = getType();
    	String result = "Car{Manufacturer name:"+name+",Model Name:"+modelName+",Type:"+type+"}";
    	System.out.println("Car details: "+result);
		return result;

    }
}
