package com.psl.beans;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeSet cricketers;
	private HashMap cc;
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public void setCc(HashMap cc) {
		this.cc = cc;
	}
	
	public void display() {
		System.out.println("Fruits data .............");
		for(Object fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("Cricketers data.............");
		for(Object cricketer: cricketers) {
			System.out.println(cricketer);
		}
			
		System.out.println("Country Capital Data.........");
		Set keys= cc.keySet();
		for(Object c : keys) {
			System.out.println("Country : "+c +", Capital : "+cc.get(c));
		}
	}
	
}
