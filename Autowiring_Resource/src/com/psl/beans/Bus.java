package com.psl.beans;

public class Bus {
	
	public Bus(Engine engine) {
		this.engine = engine;
	}

	private Engine engine;
	
	public void display() {
		System.out.println("Bus Engine ModelYear : "+engine.getModelYear());
	}
}
