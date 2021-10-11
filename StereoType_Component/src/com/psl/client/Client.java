package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.car.Car;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		Car car = (Car)ap.getBean(Car.class);
		car.printData();

	}

}
