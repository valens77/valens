package com.valens.base.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import com.valens.upload.poi.PoiHeader;

/**
 * OBJECT TO MAP  ,Reflection 
 * MAP TO OBJECT 
 * 
 * @author Administrator
 * 
 */
public class MyRcUtils {
	
	private static Logger logger = Logger.getLogger(MyRcUtils.class
			.getName());
	/**
	 * 将bean转换为map
	 * @param obj
	 * @return
	 * @throws IntrospectionException
	 */
	public static Map<String,Object> convertBeanToMap(Object obj) throws IntrospectionException
	{
	    BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass()); 
	    Map<String, Object> params = new HashMap<String, Object>(0);  
        try {  
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
            for (int i = 0; i < descriptors.length; i++) {  
                PropertyDescriptor descriptor = descriptors[i];
                String name = descriptor.getName();  
                if (!"class".equals(name)) {  
                    params.put(name.toUpperCase(), descriptor.getReadMethod().invoke(obj)); 
//                    System.out.println("map.put(\""+name.toUpperCase()+"\",\""+descriptor.getReadMethod().invoke(obj)+"\");");
                    System.out.println("map.put(\""+name.toUpperCase()+"\","+beanInfo.getBeanDescriptor().getName().substring(0,1).toLowerCase()+beanInfo.getBeanDescriptor().getName().substring(1)+".get"+name.substring(0,1).toUpperCase()+name.substring(1)+"());");
                  //拼写BaseStoredProcedure 所用入参指定   storedProcedure.declareParameter(new SqlParameter("",OracleTypes.VARCHAR));
                }  
            }  
        } catch (Exception e) {  
            logger.info("convertBeanToMap error :"+e.getMessage());
        }  
        return params;  
    } 
	/**
	 * LIST MAP TO LIST OBJECT
	 * 
	 * @param list
	 * @param c
	 *            OBJECT TYPE
	 * @return List<Object>
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static List listMapToList(List<Map<Object,Object>> list, Class c)
			throws InstantiationException, IllegalAccessException {
		List<Object> retList = new ArrayList<Object>();
		if (list != null) {
			for (Map<Object,Object> map : list) {
				Object t=null;
				if(map.getClass().getName().equals(c.getName())){
					t = map;
				}else{
					t = mapToObject(map,c);
				}
				retList.add(t);
			}
		}
		return retList;
	}
	/**
	 * LIST MAP TO LIST OBJECT
	 * 
	 * @param list
	 * @param c
	 *            OBJECT TYPE
	 * @return Object
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Object listMapToObject(List<Map<Object,Object>> list, Class c,ConsEnum cons)
	throws InstantiationException, IllegalAccessException {
		Object retList =null; ;
		if(cons==ConsEnum.Set){
			retList=new HashSet<Object>();
		/*}else if(cons==ConsEnum.Map){
			retList=new HashMap();*/
		}else{
			retList=new ArrayList<Object>();
		}
		if (list != null) {
			for (Map<Object,Object> map : list) {
				Object t = mapToObject(map,c);
				if(cons==ConsEnum.Set){
					((Set)retList).add(t);
				}else{
					((List)retList).add(t); 
				}
			}
		}
		return retList;
	}

	/**
	 * MAP TO OBJECT
	 * 
	 * @param map MAP对象
	 * @param c  对象类路径
	 * @return OBJECT
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Object mapToObject(Map map, Class c)
			throws InstantiationException, IllegalAccessException {
		Object object = null;
		if (map != null&&c!=null) {
			Set<Object> set = map.keySet();
			object = c.newInstance();
			Field[] filds = c.getDeclaredFields();
			for (Object key : set) {
				for (Field filed : filds) {
					Class property = filed.getType();
					//Class properyClass=filed.getDeclaringClass();
					Class properyClass=getPrinltn(filed);
					if (filed.getName().equalsIgnoreCase(key.toString())) {//Object 类型无法用
					//if (key.toString().equalsIgnoreCase(filed.getName())) {//不区分大小写
						filed.setAccessible(true);
						Object value = map.get(key);
						if (value == null) {
							filed.set(object, value);
							break;
						}else{
							/*System.out.println(filed.getName()+"==="+value.getClass() + "===name"
									+ value.getClass().getName());*/
							if("".equals(value)){//值为空 需要考虑 FILED类型
								 
								if(property.getName().equals("java.util.Set")){
									filed.set(object, new HashSet());
									break;
								}else if(property.getName().equals("java.util.Map")){
									filed.set(object, new HashMap());
									break;
								}else if(property.getName().equals("java.util.List")){
									filed.set(object, new ArrayList());
									break;
								}
							}
						}
						if (value.getClass().getName().equals(
								"java.util.LinkedHashMap")||value.getClass().getName().equals(
								"java.util.HashMap")) {
							//System.out.println(property);
							if(property.getName().equals("java.util.Map")){
								filed.set(object, value);
							}else{
								Object newObject = mapToObject((Map) value,
										property);
								filed.set(object, newObject);
							}
									 
						} else if (value.getClass().getName().equals(
								"java.util.ArrayList")) {
							/*System.out.println(property);
							System.out.println(properyClass);
							*/
							Object newObject=null;
							if(property.getName().equals("java.util.Set")){
								newObject= listMapToObject((List<Map<Object,Object>>) value,
										getPrinltn(filed),ConsEnum.Set);
							}else {
								newObject= listMapToObject((List<Map<Object,Object>>) value,
										properyClass,null);
							}
							filed.set(object, newObject);

						} else {
							/*System.out.println(filed.getName() + "=="
									+ property.getName());
							if (property.getName().equals("java.util.Set")) {
								System.out.println("java.util.Set==" + value);
								System.out.println( value.getClass().getName());
							}*/
							//filed.set(object, value);
							setFiledValue(filed, value, object);
						}
						break;
					}
				}
			}
		}
		return object;
	}
	/**
	 *  Set according to the different types of property values 
	 * @param filed
	 * @param value
	 * @param object
	 */
	private static void setFiledValue(Field filed, Object value, Object object) {

		filed.setAccessible(true);
		String type = filed.getType().getName();
		boolean isNull = value == null || value.equals("");
		try {
			if ("int".equals(type) || Integer.class.getName().equals(type)) {

				if (!isNull) {
					filed.set(object, Integer.parseInt(value + ""));
				}
			} else if ("double".equals(type)
					|| Double.class.getName().equals(type)) {
				if (!isNull) {
					filed.set(object, Double.parseDouble(value + ""));
				}
			} else if ("float".equals(type)
					|| Float.class.getName().equals(type)) {
				if (!isNull) {
					filed.set(object, Float.parseFloat(value + ""));
				}
			} else if ("boolean".equals(type)
					|| Boolean.class.getName().equals(type)) {
				if (!isNull) {
					filed.set(object, Boolean.parseBoolean(value + ""));
				}
			} else if (String.class.getName().equals(type)) {
				filed.set(object, String.valueOf(value));
			} else if (Date.class.getName().equals(type)) {
				if (!isNull) {
					String date=value.toString().replace("-", "").replace(":", "").replace("/", "")+"000000000000000000000";
					filed.set(object, new SimpleDateFormat("yyyyMMddHHmmss").parse(date.substring(0,16)));
				}
			} else {
				filed.set(object, mapToObject((Map)value,getPrinltn(filed)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * OBJECT TO MAP  
	 * 
	 * @param obj
	 *            实体对象
	 * @return Map<String,Object>
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Map<String,Object> objectToMap(Object obj)
	throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
			if(obj!=null){
				
			/*	XmlListTypeEnums listType = XmlListTypeEnums
				.getXmlListTypeEnums(obj.getClass().getName());
		if (listType != null) {
			if (listType == XmlListTypeEnums.List
					|| listType == XmlListTypeEnums.ArrayList) {
				Iterator i = ((List) obj).iterator();
				while (i.hasNext()) {
				}
			} else if (listType == XmlListTypeEnums.Set
					|| listType == XmlListTypeEnums.HashSet) {
				Iterator i = ((Set) obj).iterator();
				while (i.hasNext()) {
				}
			} else if (listType == XmlListTypeEnums.Map
					|| listType == XmlListTypeEnums.HashMap) {
				Set set = ((Map) obj).keySet();
				Iterator i = set.iterator();
			 
			}
		 return null;
		}*/
				
				Field[] fields=obj.getClass().getDeclaredFields();
				if(fields!=null&&fields.length>0){
						for(Field field:fields){
							   // 获取原来的访问控制权限  
							  boolean accessFlag =field.isAccessible();  
							field.setAccessible(true);
							map.put(field.getName(), getValue(field,obj));
							field.setAccessible(accessFlag);
						}
					
				}
			}
		return map;
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
	
	/**
	 * Get the object property value
	 * @param field
	 * @param obj
	 * @return
	 */
	private static Object getValue(Field field,Object obj){
		if(field!=null&&obj!=null){
			Object o=null;
			try {
				o = field.get(obj);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
			}
			return  o!=null? o.toString():null;
		}
		return null;
	}
	
	/**
	 * 获取泛型类型
	 * @param field
	 * @return Class
	 */
	public static Class getPrinltn(Field field){
		Type type = field.getGenericType(); 
		if (type instanceof ParameterizedType) {     
		    ParameterizedType paramType = (ParameterizedType) type;     
		    Type[] actualTypes = paramType.getActualTypeArguments();     
		    for (Type aType : actualTypes) {         
		        if (aType instanceof Class) {         
		            Class clz = (Class) aType;             
		            //System.out.println(clz.getName()); //输出java.lang.String    
		            return clz;
		        }     
		    } 
		}
		//System.out.println("OVER");
		return Object.class;
		
	}

	public static void main(String[] s) throws  
			 Exception {
		List<PoiHeader> header = new ArrayList<PoiHeader>();
		header.add(new PoiHeader("name", "姓名"));
		header.add(new PoiHeader("age", "年龄"));
		header.add(new PoiHeader("sex", "性别"));
		header.add(new PoiHeader(1, "性别"));
		List<Map<Object, Object>> data = new ArrayList<Map<Object, Object>>();
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "埃米");
		map.put("age", "17");
		map.put("sex", "boy");
		map.put(1, 1);
		data.add(map);
		System.out.println(MyRcUtils.objectToMap(new PoiHeader("name", "姓名")));
		logger.info(MyRcUtils.listMapToList(data,HashSet.class).toString());
	}
}
 enum ConsEnum{
	Set("Set","java.util.HashSet")
	;
	ConsEnum(String name,String value){
		
	}
	String name="";
	String value="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}

