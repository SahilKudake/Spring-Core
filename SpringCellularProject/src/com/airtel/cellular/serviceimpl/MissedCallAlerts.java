package com.airtel.cellular.serviceimpl;

import com.airtel.cellular.service.Service;

public class MissedCallAlerts implements Service {

	@Override
	public void service() {
		System.out.println("Missed call service activated!");
		
	}

}
