package com.valens.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlRequestUtils {


	//将请求结果转换成字符转
	public static String convertToString(InputStream inputStream){
		
		StringBuilder result = new StringBuilder();
		InputStreamReader inputStreamReader=null;
		BufferedReader bufferedReader=null;
		String line = null;
		try {
			 inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
			 bufferedReader = new BufferedReader(inputStreamReader);
			while((line = bufferedReader.readLine()) != null){
				result.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
			try{
				if(inputStreamReader!=null){inputStreamReader.close();}
				if(inputStream!=null){inputStream.close();}
				if(bufferedReader!=null){bufferedReader.close();}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return result.toString();
	}


	public static String convertToString(FileInputStream inputStream){
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder result = new StringBuilder();
		String line = null;
		try {
			while((line = bufferedReader.readLine()) != null){
				result.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				inputStreamReader.close();
				inputStream.close();
				bufferedReader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return result.toString();
	}
	
	public static String getUrlRequest(String urlStr) throws Exception{
		URL url = new URL(urlStr);
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		//设置请求为get
		urlConnection.setRequestMethod("GET");
		urlConnection.connect();
		
		//请求连接地址
		InputStream inputStream = urlConnection.getInputStream();
		
		//将文件流转换成String字符串
		String responseStr = convertToString(inputStream);
		return responseStr;
	}
	
	public static void main(String[] args) {
		try{
			//String urlStr="http://172.16.10.38:9295/reconciliation/reconciliationSummary/exportReconciliationFileRepeat.do";
			//String urlStr2="http://172.16.10.38:9298/reconciliationClient/getOrderAllInfoByOrderId?orderId=600000000000008314113059176297";
			String urlStr2="http://172.16.20.29:9296/reconciliationThree/reconciliationSummary/getOrderAllInfoByOrderId.do?orderId=600000000000008314113059176297";
			String resultStr=	getUrlRequest(urlStr2);
			System.out.println(resultStr);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
