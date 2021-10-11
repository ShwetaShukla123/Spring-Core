package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Bus;
import com.psl.beans.Car;
import com.psl.beans.Truck;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		System.out.println("-----------Car-----------");
		Car car = (Car)ap.getBean("c");
		System.out.println(car.getClass().getCanonicalName());
		System.out.println(car.myCarEngine().getName());
		
		System.out.println("-----------Bus------------");
		Bus bus = (Bus)ap.getBean("b");
		System.out.println(bus.getClass().getCanonicalName());
		System.out.println(bus.myBusEngine().getName());
		
		System.out.println("-----------Truck------------");
		Truck truck = (Truck)ap.getBean("t");
		System.out.println(truck.getClass().getCanonicalName());
		System.out.println(truck.myTruckEngine().getName());
		
	}
}