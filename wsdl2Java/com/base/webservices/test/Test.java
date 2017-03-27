package com.base.webservices.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJdk6WebService s=new TestJdk6WebServiceService().getTestJdk6WebServicePort();
		s.doService("1");
		s.doService2("2");
	}

}
