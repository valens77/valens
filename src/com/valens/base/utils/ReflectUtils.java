/**
 * 
 */
package com.valens.base.utils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-5-27
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ReflectUtils {
	/**
	 * @Description 获取声明的属性
	 * @param c
	 * @param isGetFather 是否获取父节点
	 * @return Field[]
	 * @author Huangxiaohua
	 * @CreateDate 2017-5-27
	 */
	public static Field[] getClassFiled(Class c,boolean isGetFather) {
		Field[] fields=c.getDeclaredFields() ;
		if (isGetFather&&!c.getSuperclass().getName().equals(Object.class.getName())  ) {
				return ArraryUtils.concatAll(fields, getClassFiled(c.getSuperclass(),true));
		}
		return fields;
	}
	/**
	 * 获取泛型类型
	 * @param field
	 * @return Class
	 */
	public static Class getFieldFanXin(Field field){
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
	 	
}

