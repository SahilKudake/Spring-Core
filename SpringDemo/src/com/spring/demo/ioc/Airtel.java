package com.spring.demo.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing using Airtel sim");
		
	}

	
}
