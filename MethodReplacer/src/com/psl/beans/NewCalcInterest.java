package com.psl.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalcInterest implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		
		System.out.println("NewCalcInterest class new calInterest method..............");
		return o;
	}

}
