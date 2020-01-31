package com.airtel.cellular.model;

import com.airtel.cellular.service.Service;

public class Airtel {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
		
	}

}
