package com.psl.beans.eng;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public String modelYear;

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	

}
