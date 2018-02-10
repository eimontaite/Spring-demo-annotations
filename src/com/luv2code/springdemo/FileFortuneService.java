package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "src/ThingsThatWork.txt";
	private List<String> theFortunes;

	private Random randomNum = new Random();

	public FileFortuneService() {
		System.out.println("FileFortuneService: inside the default constructor");
	}

	// when the constructor is called, the bean is not yet initialized - i.e. no
	// dependencies are injected. In the @PostConstruct method the bean is fully
	// initialized and you can use the dependencies. @PostConstruct will be invoked
	// only once.
	@PostConstruct
	private void loadTheFortunesFile() {
		System.out
				.println("FileFortuneService: inside the loadTheFortunesFile method; PostConstruct method initialized");

		File theFile = new File(fileName);

		System.out.println("Reading the fortunes from: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize array list
		theFortunes = new ArrayList<String>();

		// read from file
		try (BufferedReader reader = new BufferedReader(new FileReader(theFile))) {
			String tempLine;

			while ((tempLine = reader.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	public void cleanupMethod() {
		System.out.println("FileFortuneService: inside cleanupMethod");
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = randomNum.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return ("A thing that works really well: " + tempFortune);
	}

}
