package com.valens.base.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * WEB Controller Utils
 * @author xiaohua
 * 
 */
public class WebUtils {
	
	/**
	 * 获取请求端IP
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	/**
	 * 输出字符信息
	 * @param msg
	 * @param res
	 */
	public static void OuterMsg(String msg,HttpServletResponse res){
		try {
			res.getOutputStream().println(msg);
			res.getOutputStream().flush();
			res.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
