package com.luv2code.springdemo;

public class DanceCoach implements Coach {

	FortuneService fortuneService; 
	
	public DanceCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Just dance!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
