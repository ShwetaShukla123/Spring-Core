package com.psl.beans;

public class Test {
	
	private String name;
	private int age;
	private String email;
	public Test(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void display() {
		System.out.println("name : "+ name);
		System.out.println("age : " + age);
		System.out.println("email : "+ email);
	}
}