package com.learncode.demospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car carA = context.getBean("cara",Car.class);
		Car carB = context.getBean("carb",Car.class);
		carA.getPrice();
		carB.getPrice()
	}

}
