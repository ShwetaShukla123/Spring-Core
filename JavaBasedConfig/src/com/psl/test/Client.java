package com.psl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psl.beans.HelloWorld;
import com.psl.beans.HelloWorldConfig;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello World!");
	      System.out.println(helloWorld.getMessage());
	}
}
