package com.spring.demo.autowireing.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String name;

	private MarkList marks;

	@Autowired
	@Qualifier("hindimarks")
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	@Qualifier("hindimarks")
	public void setMarks(MarkList marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name: " + name + "\nMarks: " + marks.toString());
	}

}
