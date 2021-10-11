package com.psl.beans;

public class Test {
	
	//singleton object of class Test
	
	public static Test t;
	
	public static Test getInstance() {
		if(t==null) {
			t = new Test();
			return t;
		}
		else {
			return t;
		}
	}
	
	private Test() {
		System.out.println("Test Object");
	}
	
	//Avoiding cloning of test class
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
