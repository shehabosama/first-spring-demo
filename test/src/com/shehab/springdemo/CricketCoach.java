package com.shehab.springdemo;

public class CricketCoach implements Coach{

	// define a private field for the dependency literal values 
	private String emailAddress;
	private String team;
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	// create a one arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside on-arg constructor");
	}
	

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach inside-setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach inside-setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	// dependency by setter
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(" inside setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
