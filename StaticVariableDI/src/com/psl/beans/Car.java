package com.psl.beans;

public class Car {
	
	private static String carName;

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public static void printCarName() {
		System.out.println("Car Name : "+carName);
	}
}
