package com.psl.client;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext conf = new ClassPathXmlApplicationContext("com/psl/resources/spring.xml");
		
		
		loop: while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1 to save and 2 for close");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				Test test = (Test)conf.getBean("t");
				System.out.println("Enter the id : ");
				int id = sc.nextInt();
				System.out.println("Enter the name : ");
				String name = sc.next();
				System.out.println("Enter the email id : ");
				String email = sc.next();
				System.out.println("Enter the address");
				String address = sc.next();
				
				test.save(id, name, email, address);
				break;
			default :
				sc.close();
				conf.close();
				break loop;
			}
		}		
	}
}
