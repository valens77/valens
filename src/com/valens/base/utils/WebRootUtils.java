package com.valens.base.utils;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**
 * 工程根目录工具类
 * @author lihua
 * @version V1.0
 * @createDate 2012-9-13
 */
public class WebRootUtils {

	private static Document doc = null;
	
	/**
	 * 初始化操作
	 * @param xmlFile
	 * @throws Exception
	 */
	public static void init(String xmlFile) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		doc = db.parse(new File(xmlFile));
	}
	
	/**
	 * 获取.mymetadata中的web root folder 名称
	 * @param xmlFile
	 * @return
	 * @throws Exception
	 */
	public static String getRootName(String xmlFile) throws Exception {
		String webRoot = "WebRoot";
		init(xmlFile);
		NodeList nodeList = doc.getElementsByTagName("attribute");
		for (int i = 0, len = nodeList.getLength(); i < len; i++) {
			Element attribute = (Element) nodeList.item(i);
			if ("webrootdir".equals(attribute.getAttribute("name"))){
				webRoot = attribute.getAttribute("value");
				break;
			}
		}

		return webRoot;
	}
	
	public static void main(String[] args)throws Exception {		
		System.out.println(getRootName("E:\\D\\workspace\\MyValens\\.mymetadata"));
	}
}
