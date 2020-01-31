package com.spring.demo.autowireing.byname;

public class Employee {

	private int id;
	private String name;
	private Address address;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("Id is "+id+"\nName is "+name+"\nAddress is "+address.toString());
		
	}
}
