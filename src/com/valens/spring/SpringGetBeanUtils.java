package com.valens.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringGetBeanUtils {
	/**
	 * 
	 * @param request
	 * @param beanId  spring中配置的BEAN ID
	 * @return Object 实例对象
	 */
	public static Object getBean(HttpServletRequest request,String beanId){
		return (WebApplicationContextUtils
				.getWebApplicationContext(request.getSession().getServletContext()).
				getBean(beanId));
	}
}
