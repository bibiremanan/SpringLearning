package com.ibs.training.spring.Spring_DependencyInjection;

public class Airtel {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public Service getService() {
		return service;
	}


	public void activateService(){
		service.service();
	}

}