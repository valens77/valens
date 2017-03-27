package com.valens.base.utils;

import java.io.File;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

public class HostProjectConatant {
	public static String HOST_NAME="";
	public static String HOST_IP="";
	public static String HOST="";
	public static String PORT="";
	public static String POJECT_PATH="";
	static{
		System.out.println(System.getProperty("user.dir"));
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			System.out.println(addr.getHostName());
			HOST_NAME=addr.getHostName();
			HOST_IP=addr.getHostAddress();
			File file= new File(HostProjectConatant.class.getResource("/").toURI());
			PORT=file.getAbsolutePath().toString().replaceAll("[^\\d]", "");
			HOST=HOST_NAME+":"+HOST_IP+":"+PORT;
			//POJECT_PATH=System.getProperty("user.dir");
			POJECT_PATH=file.getAbsolutePath().split("webapps")[0];
		} catch (UnknownHostException e) {
			e.printStackTrace();
			HOST_NAME="EXCEPTION_UNKNOW";
			HOST_IP="EXCEPTION_UNKNOW";
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		System.out.println("HOST:"+HOST);
		System.out.println("PROJECT:"+POJECT_PATH);
	}
	public static void main(String []s){
		new HostProjectConatant();
	}
}
