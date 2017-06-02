package com.valens.base.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraryUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = { "订单号", "面额", "状态" };
		String[] str1 = { "订单号1", "面额1", "状态1" };
		String[] str2 = { "订单号2", "面额2", "状态2" };
		Object[] obs = ArraryUtils.arrayAdd(str, 1);
		/* str=(String[])HzsRechangeBillJob.arrayAdd(str,1); */
		for (Object data : obs) {
			System.out.println(data);
		}
		byte b[] = { 01, 02 };
		System.out.println(b);
		Object[] object = ArraryUtils.concatAll(str, str1, str2);
		  Object[] dest=new Object[100];
		  System.arraycopy(object, 0, dest, 0, object.length);
		System.out.println(dest);
	}

	/**
	 * @Description 数组合并
	 * @param first
	 * @param rest
	 * @return T[]
	 * @author Huangxiaohua
	 * @CreateDate 2017-5-27
	 */
	public static <T> T[] concatAll(T[] first, T[]... rest) {
		int totalLength = first.length;
		T[] result = null;
		if (rest != null && rest.length > 0) {
			for (T[] array : rest) {
				totalLength += array.length;
			}
			result = Arrays.copyOf(first, totalLength);
			int offset = first.length;
			for (T[] array : rest) {
				System.arraycopy(array, 0, result, offset, array.length);
				offset += array.length;
			}
		} else {
			result = Arrays.copyOf(first, totalLength);
		}
		return result;
	}

	/**
	 * 复制一个数组 在源数组上多一个index数据 EG:OBJECT A[]=[1,2,3,4] arrayAdd(A,2)=[1,2,3,3,4]
	 * 
	 * @param src
	 *            [] 源数组
	 * @param srcIndex
	 *            源数组需要COPY的index
	 * @return newSrc
	 */
	public static Object[] arrayAdd(Object[] src, int srcIndex) {
		boolean falg = false;

		Object[] retObject = new Object[src.length + 1];
		if (src == null || srcIndex < 0 || srcIndex > src.length - 1) {
			return retObject;
		}
		for (int i = 0, sz = retObject.length; i < sz; i++) {
			if (falg) {
				retObject[i] = src[i - 1];
			} else {
				retObject[i] = src[i];
			}
			if (i == srcIndex) {
				falg = true;
				retObject[++i] = src[srcIndex];
			}
		}
		return retObject;
	}

	
	/**
	 * @Description List 转数组
	 * @param l
	 * @param class1
	 * @return  Object
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-2
	 */
	public static Object trans(List l,Class class1){
		 Object osObjects = Array.newInstance(class1, l.size());  
		 System.arraycopy(l.toArray(), 0, osObjects, 0,Math.min(Array.getLength(l.toArray()), l.size())); 
		 return osObjects;
	}
}
