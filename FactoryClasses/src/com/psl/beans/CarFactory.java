package com.psl.beans;

public class CarFactory {

	public static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	
	//spring will create singleton object of car
	// static factory approach
	public static Car getInstance() throws Exception{
		Car c = (Car)Class.forName(carName).newInstance();
		return c;
		
	}
	
	
}
