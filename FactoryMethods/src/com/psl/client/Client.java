package com.psl.client;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Test;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		Test t1 = (Test)ap.getBean("t");
		Test t2 = (Test)ap.getBean("t");
		
		Calendar cal1 = (Calendar)ap.getBean("c");
		Calendar cal2 = (Calendar)ap.getBean("c");
		System.out.println(cal1.getCalendarType());
		
		System.out.println(t1==t2);
		System.out.println(cal1 == cal2);
	}

}
