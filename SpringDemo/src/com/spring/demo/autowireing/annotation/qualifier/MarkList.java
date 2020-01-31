package com.spring.demo.autowireing.annotation.qualifier;

public class MarkList {

	private String subName;
	
	private String subMarks;

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void setSubMarks(String subMarks) {
		this.subMarks = subMarks;
	}

	@Override
	public String toString() {
		return "MarkList [subName=" + subName + ", subMarks=" + subMarks + "]";
	}
	
	
}
