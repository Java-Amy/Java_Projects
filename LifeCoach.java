package com.amyhareven.SpringDemo;

public class LifeCoach implements Coach {

	private FortuneService fortuneService;
	
	public LifeCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyInspiration() {
		return "Daily Inspiration: You can do it!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
