package com.psl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	//Autowiring on constructor
	
	@Autowired
	public Car( @Qualifier("e1")
	Engine engine) {
		this.engine = engine;
	}

	private Engine engine;

	public void display() {

		System.out.println("Car Model Year : " + engine.getModelYear());
	}
}
