package com.spring.demo.autowireing.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose : Program to show marks of student using Qualifier annotaion
 * 
 * @author Sahil Kudake
 *
 */
public class QualifierAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Qualifier.xml");
		Student student = context.getBean("qualifier", Student.class);
		student.display();
	}
}
