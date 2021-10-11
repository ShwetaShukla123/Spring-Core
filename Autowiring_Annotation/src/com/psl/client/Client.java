package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Bus;
import com.psl.beans.Car;

public class Client {

	public static void main(String[] args) {
//		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring_byName.xml");
//		Car car = (Car)ap.getBean("c");
//		car.display();
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		Car car = (Car)ap.getBean("c");
		car.display();
		
		Bus bus = (Bus)ap.getBean("b");
		bus.display();
	}
}
