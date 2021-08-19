package com.shehab.springdemo.task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomeFortuneApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				BasketBallCoach theCoach = context.getBean("myBasketBallCoach", BasketBallCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
