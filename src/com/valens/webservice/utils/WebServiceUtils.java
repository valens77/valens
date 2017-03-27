package com.valens.webservice.utils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.codehaus.xfire.transport.http.XFireServletController;

import com.ibm.wsdl.extensions.http.HTTPConstants;
public class WebServiceUtils {

	@Resource
	private WebServiceContext wsContext;

	private String getClientInfo() {

		MessageContext mc = wsContext.getMessageContext();

		HttpServletRequest request = (HttpServletRequest) (mc
				.get(MessageContext.SERVLET_REQUEST));

		return request.getRemoteAddr();
	}

	/**
	 * 
	 * 获取客户端IP地址
	 * 
	 * 适用于xfire发布的webservice
	 * 
	 * @return
	 * 
	 */
	public String getClientIpXfire() {
		String ip = "";
		try {
			HttpServletRequest request = XFireServletController.getRequest();
			ip = request.getRemoteAddr();
		} catch (Exception e) {
			System.out.println("无法获取HttpServletRequest.");
			e.printStackTrace();
		}
		return ip;
	}

	/**
	 * 
	 * 获取客户端IP地址，如调用方的IP，以便检查权限。
	 * 
	 * 适用于axis发布的webservice
	 * 
	 * @return
	 * 
	 */

	public String getClientIpAxis() {
		MessageContext mc = null;
		HttpServletRequest request = null;
		try {
			mc = MessageContext.getCurrentMessageContext();
			if (mc == null)
				throw new Exception("无法获取到MessageContext");
			request = (HttpServletRequest) mc.getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST);
			System.out.println("remote  ip:  " + request.getRemoteAddr());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return request.getRemoteAddr();
	}
}
