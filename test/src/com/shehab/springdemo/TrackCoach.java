package com.shehab.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService  = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "let's do it"+ fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	// add destroy method
	public void doMyCleanUpStuffYOyo() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuffYOyo");

	}

}
