<%@ page import="java.text.*,java.lang.*,java.net.*,java.util.*"%>
<%@ page isELIgnored="false"%>
<%
	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat dfday = new SimpleDateFormat("yyyy-MM-dd");
	String timeToday = df.format(new Date());
	String dayToday = dfday.format(new Date());
	request.setAttribute("timeToday",timeToday);
	request.setAttribute("dayToday",dayToday);
		
	if(pageContext.getAttribute("contextPath") == null){
		String contextPath= request.getContextPath();
		pageContext.setAttribute("contextPath", contextPath, PageContext.PAGE_SCOPE);
	}
		
	boolean isIE = true;
	String userAgentHead = request.getHeader("User-Agent");
	if(userAgentHead!=null){
		if(userAgentHead.indexOf("MSIE")<0){
			isIE = false;
		}	
	}	
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
//<%@ taglib uri="http://luban.agelong.china/framework" prefix="luBan"%>
 

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
