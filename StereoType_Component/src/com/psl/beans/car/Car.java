package com.psl.beans.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.beans.eng.Engine;

@Component
public class Car{
	
	@Autowired
	public Engine engine;
	
	public void printData() {
		System.out.println("Car Engine Model : "+ engine.getModelYear());
	}

}
