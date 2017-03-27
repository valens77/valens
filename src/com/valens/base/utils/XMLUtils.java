package com.valens.base.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XMLUtils {
	private static Logger logger = Logger.getLogger(DateUtils.class.getName());

	public static Map xmlTransObject(String xmlString) throws DocumentException {

		Document doc = DocumentHelper.parseText(xmlString);
		Map<String, Object> map = new HashMap<String, Object>();
		if (doc == null)
			return map;
		Element root = doc.getRootElement();
		for (Iterator iterator = root.elementIterator(); iterator.hasNext();) {
			Element e = (Element) iterator.next();
			// System.out.println(e.getName());
			List list = e.elements();
			if (list.size() > 0) {
				map.put(e.getName(), Dom2Map(e));
			} else
				map.put(e.getName(), e.getText());
		}
		return map;
	}

	public static Object Dom2Map(Element e) {
		Map map = new HashMap();
		List list = e.elements();
		boolean isList=false;
		if (list.size() > 0) {//USER
			for (int i = 0; i < list.size(); i++) {
				Element iter = (Element) list.get(i);
				List mapList = new ArrayList();
				if (iter.elements().size() > 0) {
				Object m = Dom2Map(iter);
					if (map.get(iter.getName()) != null) {
						Object obj = map.get(iter.getName());
						if (!obj.getClass().getName().equals(
								"java.util.ArrayList")) {
							mapList = new ArrayList();
							mapList.add(obj);
							mapList.add(m);
							isList=true;
						}
						if (obj.getClass().getName().equals(
								"java.util.ArrayList")) {
							mapList = (List) obj;
							mapList.add(m);
						}
						map.put(iter.getName(), mapList);
					} else
						map.put(iter.getName(), m);
				} else {
					if (map.get(iter.getName()) != null) {
						Object obj = map.get(iter.getName());
						if (!obj.getClass().getName().equals(
								"java.util.ArrayList")) {
							mapList = new ArrayList();
							mapList.add(obj);
							mapList.add(iter.getText());
						}
						if (obj.getClass().getName().equals(
								"java.util.ArrayList")) {
							mapList = (List) obj;
							mapList.add(iter.getText());
						}
						map.put(iter.getName(), mapList);
					} else{
						map.put(iter.getName(), iter.getText());
					}
				}
			}
			
		} else
			map.put(e.getName(), e.getText());
		
		if(map!=null&&map.size()==1){
			Set set = map.keySet();
			Iterator i = set.iterator();
			while (i.hasNext()) {
				String key = i.next().toString();
				//if(map.get(key).getClass().getName().equals("java.util.ArrayList")){
					return map.get(key);
				//}
			}
		}
		
		return map;
	}

	/**
	 * 对象转XML 只支持单属性
	 * 
	 * @param o
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static String transObjectToXml(Object o, boolean isFirst) {
		StringBuffer sb = new StringBuffer();
		if (o != null) {
			try {
				if (isFirst) {
					sb.append(("<" + o.getClass().getSimpleName() + ">")
							.toUpperCase());
				}
				XmlListTypeEnums listType = XmlListTypeEnums
						.getXmlListTypeEnums(o.getClass().getName());
				if (listType != null) {
					if (listType == XmlListTypeEnums.List
							|| listType == XmlListTypeEnums.ArrayList) {
						Iterator i = ((List) o).iterator();
						while (i.hasNext()) {
							sb.append(transObjectToXml(i.next(), true));
						}
					} else if (listType == XmlListTypeEnums.Set
							|| listType == XmlListTypeEnums.HashSet) {
						Iterator i = ((Set) o).iterator();
						while (i.hasNext()) {
							sb.append(transObjectToXml(i.next(), true));
						}
					} else if (listType == XmlListTypeEnums.Map
							|| listType == XmlListTypeEnums.HashMap) {
						Set set = ((Map) o).keySet();
						Iterator i = set.iterator();
						while (i.hasNext()) {
							String key = i.next().toString();
							sb.append(("<" + key + ">").toUpperCase());
							Object value = ((Map) o).get(key);
							if (isBaseType(value.getClass())) {
								sb.append(value);
							} else {
								sb.append(transObjectToXml(((Map) o).get(key),
										true));
							}
							sb.append(("</" + key + ">").toUpperCase());
						}
					}
					return sb.toString();
				}

				Field[] filds = o.getClass().getDeclaredFields();
				for (Field filed : filds) {
					;
					boolean flag = filed.isAccessible();
					filed.setAccessible(true);
					Class type = filed.getType();
					sb.append(("<" + filed.getName() + ">").toUpperCase());
					if (isBaseType(type)) {//
						sb.append(filed.get(o));
					} else {
						sb.append(transObjectToXml(filed.get(o), false));
					}
					sb.append(("</" + filed.getName() + ">").toUpperCase());
					filed.setAccessible(flag);
				}
				if (isFirst) {
					sb.append(("</" + o.getClass().getSimpleName() + ">")
							.toUpperCase());
				}
			} catch (Exception e) {
				logger.severe("操作发生异常:" + e.getMessage());
			}
		}
		return sb.toString();
	}

	/**
	 * 获取起始节点和结束节点中间的数值<splitString></splitString>
	 * 
	 * @param xmlStr
	 *            数据值
	 * @param splitString
	 *            起始节点值
	 * @param splitString2
	 *            结束节点值
	 * @return
	 */
	public static String getLableValue(String xmlStr, String splitString,
			String splitString2) {
		// TODO 获取起始节点和结束节点中间的数值<splitString></splitString>
		String orderNo = "";
		try {
			if ((xmlStr != null)
					&& (splitString != null && !"".equals(splitString))) {
				int splitLen = splitString.length();
				int start = xmlStr.toUpperCase().lastIndexOf(
						splitString.toUpperCase());
				splitString = splitString.replace('<', '/');
				int end = xmlStr.toUpperCase().lastIndexOf(
						'<' + splitString.toUpperCase());
				if ((start > -1) && (end > -1)) {
					orderNo = xmlStr.substring(start + splitLen, end).trim();
				}
			}
			if ((xmlStr != null)
					&& (splitString2 != null && !"".equals(splitString2))
					&& ("".equals(orderNo))) {
				int splitLen = splitString2.length();
				int start = xmlStr.toUpperCase().lastIndexOf(
						splitString2.toUpperCase());
				splitString2 = splitString2.replace('<', '/');
				int end = xmlStr.toUpperCase().lastIndexOf(
						'<' + splitString2.toUpperCase());
				if ((start > -1) && (end > -1)) {
					orderNo = xmlStr.substring(start + splitLen, end).trim();
				}
			}
		} catch (Exception localException) {
		}
		return orderNo;
	}

	public static void main(String[] s) {
		try {
			RootXml o = new RootXml();
			// Object o = new VerifyFlowCardResponse();
			o.userList.add(new User());
			o.userList.add(new User("TAOTAO"));
			o.userList.add(new User("TAOTAO2"));
			o.userMap.put("userName", "tt");
			o.userMap.put("usertt", new User());

			String xml = XMLUtils.transObjectToXml(o, true);
			System.out.println(xml);
			Map map = XMLUtils.xmlTransObject(xml);
			System.out.println(map);
			Object obj = MyRcUtils.mapToObject(map, RootXml.class);
			System.out.println(obj);
			xml = XMLUtils.transObjectToXml(obj, true);
			System.out.println(xml);
			/*
			 * List listabc=new ArrayList(); listabc.add(new User());
			 * System.out.println(listabc.getClass().getName()); Iterator
			 * i=listabc.iterator(); while(i.hasNext()){ i.next(); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	private static boolean isBaseType(Class c) {
		boolean flag = false;
		if (c.getName().equals("java.lang.Integer")) {
			flag = true;
		} else if (c.getName().equals("java.lang.String")) {
			flag = true;
		}
		return flag;
	}

	private static boolean isListType(Class c) {
		boolean flag = false;
		if (c.getName().equals("java.util.List")) {
			flag = true;
		} else if (c.getName().equals("java.util.ArrayList")) {
			flag = true;
		}
		return flag;
	}

}

class RootXml {
	private User user = new User();
	public Map userMap = new HashMap();
	public List<User> userList = new ArrayList<User>();
	public Set<User> userSet = new HashSet<User>();
	private String type = "F";

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class User {
	public User() {
	}

	public User(String userName) {
		this.userName = userName;
	}

	private String userName = "xiaohua", adreess = "湖南";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdreess() {
		return adreess;
	}

	public void setAdreess(String adreess) {
		this.adreess = adreess;
	}
}

