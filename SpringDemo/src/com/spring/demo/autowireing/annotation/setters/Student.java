package com.spring.demo.autowireing.annotation.setters;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	
	private MarkList marks;

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setMarks(MarkList marks) {
		this.marks = marks;
	}
	
	public void display() {
		if(marks!=null) {
			System.out.println("Name "+name+"\nMarks "+marks.toString());
		}
		else {
			System.out.println("Error");
		}
	}
}
