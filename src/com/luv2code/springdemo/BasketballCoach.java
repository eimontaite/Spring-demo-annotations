package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class BasketballCoach implements Coach {
	
//	Autowired
//	@Qualifier("fileFortuneService")
	private FortuneService fortuneService; 
	
	public BasketballCoach() {
		System.out.println("BasketballCoach: inside the default constructor");
	}
	

	@Override
	public String getDailyWorkout() {
		return "Your daily workout: Practice free throws for 60 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
