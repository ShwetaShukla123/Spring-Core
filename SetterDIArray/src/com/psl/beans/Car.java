package com.psl.beans;

public class Car {
	
	private String[] carNames;
	private Engine[] engines;
	
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void display() {
		for(String carName : carNames) {
			System.out.println(carName);
		}
		for(Engine engine : engines) {
			System.out.println(engine.getModelYear());
		}
	}
	
}
