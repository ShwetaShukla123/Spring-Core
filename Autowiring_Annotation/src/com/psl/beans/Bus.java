package com.psl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {

	//Autowiring on property
	
	@Autowired
	@Qualifier("e2")
	private Engine engine;

	public void display() {
		System.out.println("Bus Model Year : "+ engine.getModelYear());
	}
}