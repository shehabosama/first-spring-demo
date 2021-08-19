package com.shehab.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScop-applicationContext2.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach" , Coach.class);
		
		// check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		
		// print out
		System.out.println("\n pointing to the same object "+result );
		System.out.println("\n memory location for the coach"+ theCoach);
		System.out.println("\n memory location for the coach"+ alphaCoach+"\n");
		context.close();
	}

}
