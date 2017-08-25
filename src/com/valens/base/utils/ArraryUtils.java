package com.valens.base.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraryUtils {

	/**
	 * @Description List 转数组
	 * @param l
	 * @param class1
	 * @return Object
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-2
	 */
	public static Object trans(List l, Class class1) {
		Object osObjects = Array.newInstance(class1, l.size());
		System.arraycopy(l.toArray(), 0, osObjects, 0,
				Math.min(Array.getLength(l.toArray()), l.size()));
		return osObjects;
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*String[] str = { "订单号", "面额", "状态" };
		String[] str1 = { "订单号1", "面额1", "状态1" };
		String[] str2 = { "订单号2", "面额2", "状态2" };
		Object[] obs = ArraryUtils.arrayAdd(str, 1);
		 str=(String[])HzsRechangeBillJob.arrayAdd(str,1); 
		for (Object data : obs) {
			System.out.println(data);
		}
		byte b[] = { 01, 02 };
		System.out.println(b);
		Object object = ArraryUtils.concatAll(str, str1, str2);
		System.out.println(object);*/
		
		List dataList=new ArrayList();
		for(int i=0;i<20;i++){
			//dataList.add(new ArraryUtils());
			dataList.add(i);
		}
		System.out.println(dataList);
		List avg=ArraryUtils.subAvgList(dataList, 7);
		for(Object l:avg){
			System.out.println(l);
		}
		List list=ArraryUtils.subList(dataList,7);
		for(Object l:list){
			System.out.println(l);
		}
	}
	/**
	 * 将LIST 平均分成NUM份
	 * @param list
	 * @param num
	 * @return
	 */
	public static List subAvgList(List list,int num){
		if(num<1){
			num=1;
		}
		int size=list.size();
		int ys=size%num;//余数
		int end=0;
		int zs=size/num;//整数
		List retList=new ArrayList();
		for(int i=0;i<num;i++){
			if(i>=size){
				break;
			}
			if(ys>0){
				retList.add(copyList(list.subList(end, end+zs+(ys-1>=0?1:0))));
				end+=zs+(ys-1>=0?1:0);
				ys--;
			}else{
				retList.add(copyList(list.subList(end, end+zs)));
				end+=zs;
			}
		}
		return retList;
	}
	/**
	 * @Description 分隔List集合,按指定大小(batchNum),将集合分成多个:非平均. 会清空源LIST
	 * @param src 
	 * @param batchNum  每个List batchNum
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException  List
	 * @author Huangxiaohua
	 * @CreateDate 2017-8-25
	 */
	public static <T>List  subList(List src,int batchNum) throws IOException, ClassNotFoundException {
		List retList=new ArrayList(); 
		retList.add(src);
		if (null != src && src.size() > 0) {
			retList.clear();
			int pointsDataLimit = 10;// 限制条数
			if(batchNum>0){
				pointsDataLimit=batchNum;
			}
			Integer size = src.size();
			// 判断是否有必要分批
			if (pointsDataLimit < size) {
				int part = size / pointsDataLimit;// 分批数
				//System.out.println("共有 ： " + size + "条，！" + " 分为 ：" + part+ "批");
				//
				for (int i = 0; i < part; i++) {
					// 1000条
					List<Integer> listPage = src.subList(0,pointsDataLimit);  
					retList.add(copyList(listPage));
					// 剔除
					src.subList(0, pointsDataLimit).clear();
				}
				if (!src.isEmpty()) {
					// 表示最后剩下的数据
					retList.add(copyList(src.subList(0, src.size())));
					src.subList(0, src.size()).clear();
					//retList.add(deepCopy(dataList));
				}
			}
		} 
		return retList;
	}
	/**
	 * @Description TODO
	 * @param src
	 * @return  List<T>
	 * @author Huangxiaohua
	 * @CreateDate 2017-8-25
	 */
	public static <T>List<T> copyList(List<T> src){
		 List<T> dest=new ArrayList<T>(); 
		 dest.addAll(src); 
		return dest;
	}
	/**
	 * @Description 深复制(Serializable)
	 * @param srcList
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException  List<T>
	 * @author Huangxiaohua
	 * @CreateDate 2017-8-25
	 */
	public static <T> List<T> deepCopy(List<T> srcList ) throws IOException, ClassNotFoundException{
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();  
	    ObjectOutputStream out = new ObjectOutputStream(byteOut);  
	    out.writeObject(srcList);  
	    ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());  
	    ObjectInputStream in = new ObjectInputStream(byteIn);  
	    @SuppressWarnings("unchecked")  
	    List<T> dest = (List<T>) in.readObject();  
	    out.close();
	    in.close();
	    return dest;  
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
	 * 复制一个数组 在源数组上多一个index数据 EG:OBJECT A[]=[1,2,3,4] arrayAdd(A,2)=[1,2,3,3,4]
	 * 
	 * @param src
	 *            [] 源数组
	 * @param srcIndex
	 *            源数组需要COPY的index
	 * @return newSrc
	 */
	public static Object[] arrayCopy(Object[] src, int startIndex, int endIndex) {
		boolean falg = false;

		Object[] retObject = new Object[src.length + 1];
		if (src == null || startIndex < 0 || startIndex > src.length - 1) {
			return retObject;
		}
		for (int i = 0, sz = retObject.length; i < sz; i++) {
			if (falg) {
				retObject[i] = src[i - 1];
			} else {
				retObject[i] = src[i];
			}
			if (i == startIndex) {
				falg = true;
				retObject[++i] = src[startIndex];
			}
		}
		return retObject;
	}
}
