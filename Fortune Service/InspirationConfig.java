package com.amyhareven.SpringDemo;

import org.springframework.context.annotation.*;

@Configuration
public class InspirationConfig {
	
		//define bean for random fortune
		@Bean
		public FortuneService randomFortuneService() {
			return new RandomFortuneService();
		}
		
		//define bean for Coach AND inject dependency 
		@Bean
		public Coach LifeCoach() {
			return new LifeCoach(randomFortuneService());
		}
	}
	
