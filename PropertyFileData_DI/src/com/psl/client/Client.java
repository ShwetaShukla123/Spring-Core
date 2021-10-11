package com.psl.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.ConnectionPool;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		ConnectionPool cp = (ConnectionPool)ap.getBean("cp");
		cp.createConnection();
	}

}
