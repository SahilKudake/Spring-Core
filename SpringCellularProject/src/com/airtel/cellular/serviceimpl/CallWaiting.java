package com.airtel.cellular.serviceimpl;

import com.airtel.cellular.service.Service;

public class CallWaiting implements Service {

	@Override
	public void service() {
		System.out.println("Call waiting service activated!");
		
	}

}
