package com.spring.demo.autowireing.constructor;

public class Address {

	private String city;
	
	private String pinCode;

	

	public Address(String city, String pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
