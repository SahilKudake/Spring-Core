package com.spring.demo.autowireing.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByName {

	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("AutowiringByName.xml");
		Employee employee = application.getBean("autowiringByName",Employee.class);
		employee.display();
	}
}
