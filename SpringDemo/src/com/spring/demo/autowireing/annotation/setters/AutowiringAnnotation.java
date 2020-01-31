package com.spring.demo.autowireing.annotation.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringBySetters.xml");
		Student student = context.getBean("student1",Student.class);
		student.display();

	}

}
