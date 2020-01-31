package com.spring.demo.autowireing.constructor;

public class Employee {

	private int id;
	
	private String name;
	
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Id is "+id+ "\nName is "+name+"\nAddress is "+address.toString());
	}
}
