package com.valens.base.utils;

public enum XmlListTypeEnums {

	Map("java.util.Map", java.util.Map.class), HashMap("java.util.HashMap",
			java.util.HashMap.class), Set("java.util.Set", java.util.Set.class), HashSet(
			"java.util.HashSet", java.util.HashSet.class), List(
			"java.util.List", java.util.List.class), ArrayList(
			"java.util.ArrayList", java.util.ArrayList.class);
	private String className = "";
	private Class classType;

	private XmlListTypeEnums(String className, Class c) {
		this.className = className;
		this.classType = c;
	}

	public static XmlListTypeEnums getXmlListTypeEnums(String className) {
		XmlListTypeEnums[] xmlLists = XmlListTypeEnums.values();

		for (XmlListTypeEnums xmlList : xmlLists) {
			if (xmlList.className.equals(className)) {
				return xmlList;
			}
		}
		return null;
	}
}
