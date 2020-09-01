package com.amyhareven.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext (InspirationConfig.class);

		//get the bean from spring container
		Coach theCoach = context.getBean("LifeCoach", Coach.class);

		//call a method on bean
		System.out.println(theCoach.getDailyInspiration());

		//call method to get fortune
		System.out.println(theCoach.getDailyFortune());

		//close context
		context.close();

	}

}
