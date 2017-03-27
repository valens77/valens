package com.valens.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService 
public class TestJdk6WebService {
	static{
		//TestJdk6WebService j6=new TestJdk6WebService();
	
		/*Endpoint.publish(
				"http://172.16.164.124:8080/java6ws/J6Ws",
				j6);*/
		
}
	public synchronized String doService(String str) {
		System.out.println("doService:" + str);
		System.out.println("doService:" + str);
		System.out.println("doService:" + str);
		System.out.println("doService:" + str);
		System.out.println("doService:" + str);
		return null;
	}
	public synchronized void doService2(String str) {
		System.out.println("doService2:" + str);
		System.out.println("doService2:" + str);
		System.out.println("doService2:" + str);
		System.out.println("doService2:" + str);
		System.out.println("doService2:" + str);
	}

	public static void main(String str[]) {
		Endpoint.publish(
				"http://127.0.0.1:8085/java6ws/J6Ws",new TestJdk6WebService()
				);
	}
}
