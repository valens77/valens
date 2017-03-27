package com.valens.base.utils;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class BASE64Utils {
	private static BASE64Decoder decode=new BASE64Decoder();
	private static BASE64Encoder encode=new BASE64Encoder();
	
	public static String getEncoder(byte[] str){
		if(str!=null){
			return encode.encode(str);
		}
		return null;
	}
	public static byte[] getDecoder(String str) throws IOException{
		if(str!=null){
			return decode.decodeBuffer(str);
		}
		return null;
	}
	public static void main(String []s) throws IOException{
		String str="123amwotw";
		str=BASE64Utils.getEncoder(str.getBytes());
		System.out.println(str);
		str=new String(BASE64Utils.getDecoder(str));
		System.out.println(str);
	}
}
