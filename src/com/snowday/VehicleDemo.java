package com.snowday;

public class VehicleDemo {
    static class Vehicle {
        int passengers;
        int fuelcap;
        int mpg;
    }

    public static void main(String[] args) {
	    Vehicle minivan = new Vehicle();
	    int range;

	    minivan.passengers = 8;
	    minivan.fuelcap = 16;
	    minivan.mpg = 21;

	    range = minivan.fuelcap * minivan.mpg;
	    System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range + ".");
    }


}


