package com.airtel.cellular.serviceimpl;

import com.airtel.cellular.service.Service;

public class HelloTuneImpl implements Service{

	@Override
	public void service() {
		System.out.println("Hello tune service activated on your phone!");
		
	}

}
