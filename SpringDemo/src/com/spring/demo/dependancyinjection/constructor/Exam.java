package com.spring.demo.dependancyinjection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose : Program using dependency injection by constructor
 * 
 * @author Sahil Kudake
 *
 */
public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student sahil = context.getBean("student1", Student.class);
		sahil.displayStudentInfo();

	}

}
