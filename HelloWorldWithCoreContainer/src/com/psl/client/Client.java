package com.psl.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.psl.beans.Test;

public class Client {
	
	public static void main(String[] args) {
		//find xml
		Resource resource = new ClassPathResource("com/psl/resources/spring.xml");
		//load xml into container
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		//create Test class object
		Object o = beanFactory.getBean("t");
//		Object o1 = beanFactory.getBean("t");
//		Object o2 = beanFactory.getBean("t");
//		System.out.println(o==o1);--->true
//		System.out.println(o==o2);--->true //IOC container is creates only singleton object
		Test test = (Test)o;
		test.hello();
	}
	
}