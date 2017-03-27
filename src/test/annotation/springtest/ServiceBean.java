package test.annotation.springtest;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceBean {
	@Autowired
	private DaoBean dao;

	 
	public void setDao(DaoBean dao) {
		this.dao = dao;
	}
}
