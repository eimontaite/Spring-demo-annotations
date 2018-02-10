package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DanceJavaConfigDemo {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DanceConfig.class);
		
		// get the bean from the spring container
		Coach myDanceCoach = context.getBean("danceCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(myDanceCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(myDanceCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
