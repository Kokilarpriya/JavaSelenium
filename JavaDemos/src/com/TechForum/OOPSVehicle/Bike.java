package com.TechForum.OOPSVehicle;

public class Bike extends AbstractManufacturer implements Vehicle {
    /*
    Parameterized constructor to initialize instance variables
     */
    public Bike(String name, String modelName, String bikeType) {
       this.setName(name);
       this.setModelName(modelName);
       this.setType(bikeType);
    }

    /*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(final  String bikeType) {
    	if(bikeType == "sports") {
    		return 300;
    	}else if(bikeType == "cruiser") {
    		return 170;
    	}else {
    		return 0;
    	}
        
    }
    /*
    should return in the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	String name = getName();
    	String modelName = getModelName();
    	String type = getType();
    	String result = "Bike{Manufacturer name:"+name+",Model Name:"+modelName+",Type:"+type+"}";
    	System.out.println("Bike details: "+result);
    	
		return result;

    }
}
