package com.amyhareven.SpringDemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] fortuneArray = { 
			"Daily Random Fortune: Don’t pursue happiness – create it.",
			"Daily Random Fortune: Success lies in the hands of those who want it.",
			"Daily Random Fortune: The journey is the reward."
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(fortuneArray.length);
		
		String theFortune = fortuneArray[index];
		
		return theFortune;
	}
	
}
