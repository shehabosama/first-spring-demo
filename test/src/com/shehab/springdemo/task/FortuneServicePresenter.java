package com.shehab.springdemo.task;

import java.util.Random;

public class FortuneServicePresenter implements FortuneService {

	int selectedFortueIndex;
	Random rand;
	String[] fortunes = {"To day is your lucky day", 
			"try to be effective this is your time",
			"do it your are the shehab that we know him"};
	public FortuneServicePresenter() {
		rand = new Random();
	}
	
	@Override
	public String getFortune() {
		selectedFortueIndex = rand.nextInt(3);
		return fortunes[selectedFortueIndex];
	}

}
