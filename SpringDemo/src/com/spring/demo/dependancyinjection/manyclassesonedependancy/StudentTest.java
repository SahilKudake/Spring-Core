package com.spring.demo.dependancyinjection.manyclassesonedependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose : Program using depenency injection
 * 
 * @author Sahil Kudake
 *
 */
public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Beans.xml loaded!");
		Student student = context.getBean("stud", Student.class);
		student.cheating();

		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
