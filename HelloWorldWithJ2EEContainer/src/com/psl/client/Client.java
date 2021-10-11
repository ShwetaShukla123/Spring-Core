package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Test;

public class Client {
	
	public static void main(String[] args) {
		//find xml and load into container and instantiate beans
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		Object o = ap.getBean("t");
//		Object o1 = beanFactory.getBean("t");
//		Object o2 = beanFactory.getBean("t");
//		System.out.println(o==o1);--->true
//		System.out.println(o==o2);--->true //IOC container is creates only singleton object
		Test test = (Test)o;
		test.hello();
	}
	
}
