package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	// create an array of strings
	private String[] fortunes = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
//	// create a random number generator 
//	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = new Random().nextInt(fortunes.length);
		String theFortune = fortunes[index];
		return theFortune;
	}

}
