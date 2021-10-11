package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		Object obj = ap.getBean("t");
		Test test = (Test)obj;
		test.display();
	}

}
