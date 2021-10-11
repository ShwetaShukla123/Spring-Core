package com.psl.beans;

public class CarFactory {

	public String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	//spring will create singleton object of car
	// instance factory approach
	public Car getInstance() throws Exception{
		Car c = (Car)Class.forName(carName).newInstance();
		return c;
	}
}