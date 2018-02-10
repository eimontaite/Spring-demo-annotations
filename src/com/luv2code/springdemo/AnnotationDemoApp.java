package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container; using the default bean ID
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach bBallCoach = context.getBean("basketballCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(bBallCoach.getDailyWorkout());
		
		// call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
