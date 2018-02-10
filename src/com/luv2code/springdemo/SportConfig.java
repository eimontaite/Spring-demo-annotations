package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
//	// support for value injection
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer
//	propertySourcesPlaceHolderConfigurer() {
//
//	return new PropertySourcesPlaceholderConfigurer();
//	}
	
	// define bean for SadFortuneService. The method name is the actual bean ID that Spring uses when assigning to the container
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for SwimCoach and inject dependency
	// calling the sadFortuneService bean defined above; non-capitalized
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
