package com.shehab.springdemo.task;

import com.shehab.springdemo.Coach;

public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice to put the ball in the basket";
	}

	public BasketBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
