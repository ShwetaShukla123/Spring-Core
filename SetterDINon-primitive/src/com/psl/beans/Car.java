package com.psl.beans;

public class Car {
	
	private String carName;
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println("Car Name : "+ carName);
		System.out.println("modelYear : "+ engine.getModelYear());
	}

}
