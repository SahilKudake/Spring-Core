package com.spring.demo.autowireing.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByType.xml");
		Employee employee = context.getBean("autowiringByType",Employee.class);
		employee.display();

	}

}
