package test.annotation.springtest;

import org.springframework.beans.factory.annotation.Autowired;

public class ActionBean {
	@Autowired
	private ServiceBean service;

	

	public void setService(ServiceBean service) {
		this.service = service;
	}
}
