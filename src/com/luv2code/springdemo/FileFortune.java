package com.luv2code.springdemo;

import java.io.File;
import java.util.Scanner;

public class FileFortune implements FortuneService {

	Scanner scan = new Scanner(new File("Strings.txt"));
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
