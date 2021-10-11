package com.psl.beans;

public class Car {
	
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display() {
		System.out.println("ModelYear : "+engine.getModelYear());
	}
}
