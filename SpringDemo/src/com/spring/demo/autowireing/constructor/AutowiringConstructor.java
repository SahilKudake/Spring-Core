package com.spring.demo.autowireing.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringConstructor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByConstructor.xml");
		Employee employee = context.getBean("byConstructor",Employee.class);
		employee.display();

	}

}
