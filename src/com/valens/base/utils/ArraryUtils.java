package com.valens.base.utils;


public class ArraryUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str={"订单号","面额","状态"};
		Object[] obs=ArraryUtils.arrayAdd(str,1);
		/*str=(String[])HzsRechangeBillJob.arrayAdd(str,1);*/
		for(Object data:obs){
			System.out.println(data);
		}
		byte b[]={01,02};
		System.out.println(b);
	}
	/**
	 * 复制一个数组 在源数组上多一个index数据
	 * EG:OBJECT A[]=[1,2,3,4] arrayAdd(A,2)=[1,2,3,3,4]
	 * 
	 * @param src[] 源数组
	 * @param srcIndex 源数组需要COPY的index
	 * @return newSrc 
	 */
	public static Object[] arrayAdd(Object[] src,int srcIndex){
		boolean falg=false;
		
		Object []retObject=new Object[src.length+1];
		if(src==null||srcIndex<0||srcIndex>src.length-1){
			return retObject;
		}
		for(int i=0,sz=retObject.length;i<sz;i++){
				if(falg){
					retObject[i]=src[i-1];
				}else{
					retObject[i]=src[i];
				}
				if(i==srcIndex){falg=true;
					retObject[++i]=src[srcIndex];
				}
		}
		return retObject;
	}
	/**
	 * 复制一个数组 在源数组上多一个index数据
	 * EG:OBJECT A[]=[1,2,3,4] arrayAdd(A,2)=[1,2,3,3,4]
	 * 
	 * @param src[] 源数组
	 * @param srcIndex 源数组需要COPY的index
	 * @return newSrc 
	 */
	public static Object[] arrayCopy(Object[] src,int startIndex,int endIndex){
		boolean falg=false;
		
		Object []retObject=new Object[src.length+1];
		if(src==null||startIndex<0||startIndex>src.length-1){
			return retObject;
		}
		for(int i=0,sz=retObject.length;i<sz;i++){
			if(falg){
				retObject[i]=src[i-1];
			}else{
				retObject[i]=src[i];
			}
			if(i==startIndex){falg=true;
			retObject[++i]=src[startIndex];
			}
		}
		return retObject;
	}
}
