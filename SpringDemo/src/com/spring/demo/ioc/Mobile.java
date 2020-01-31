package com.spring.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 
		 Sim sim = context.getBean("sim", Sim.class);
		 sim.calling();
		 sim.data();
	}

}
