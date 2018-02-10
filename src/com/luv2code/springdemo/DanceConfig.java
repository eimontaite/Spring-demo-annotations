package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanceConfig {

	// define bean for my FortuneService. The method name is the actual bean ID that
	// Spring uses when assigning to the container
	@Bean
	public FortuneService fileFortuneService() {
		return new FileFortuneService();
	}

	// define bean for SwimCoach and inject dependency. Non-capitalized bean name!!!
	// calling the sadFortuneService bean defined above; non-capitalized
	@Bean
	public Coach danceCoach() {
		return new DanceCoach(fileFortuneService());

	}
}
