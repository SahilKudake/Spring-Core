package com.spring.demo.autowireing.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose : Program using autowiring by type
 * 
 * @author Sahil Kudake
 *
 */
public class AutowiringByType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByType.xml");
		Employee employee = context.getBean("autowiringByType",Employee.class);
		employee.display();

	}

}
