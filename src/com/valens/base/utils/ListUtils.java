package com.valens.base.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
	
	/**
	 * 将LIST分成NUM份
	 * @param list
	 * @param num
	 * @return
	 */
	public static List splitList(List list,int num){
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
				retList.add(list.subList(end, end+zs+(ys-1>=0?1:0)));
				end+=zs+(ys-1>=0?1:0);
				ys--;
			}else{
				retList.add(list.subList(end, end+zs));
				end+=zs;
			}
		}
		return retList;
	}
	
	public static void main(String s[]){
		List retList=new ArrayList();
		for (int i = 0; i < 100; i++) {
			retList.add(i);
		}
 
		List list=ListUtils.splitList(retList,-1);
		for(Object o:list){
			System.out.println(o);
		}
	
	}

}
