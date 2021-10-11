package com.psl.beans;

import javax.annotation.Resource;

public class Car {
	
	//Autowiring by using name
	@Resource
	private Engine engine;
	
	public void display() {
		System.out.println("ModelYear : "+engine.getModelYear());
	}
}
