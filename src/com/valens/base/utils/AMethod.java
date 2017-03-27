package com.valens.base.utils;

import java.util.ArrayList;
import java.util.List;
/**
 * 一些算法
 * @author valens
 *
 */
public class AMethod {
	/**
	 * 
	 * @param obje 数组
	 * @param isUp 升序
	 */
	public static void  mop(Integer[] arr,boolean isUp){
		// 冒泡排序:
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				int temp = arr[i];
				if (arr[i] > arr[j]&&isUp) {//升序
						arr[i] = arr[j];
						arr[j] = temp;
				}else if(!isUp&&arr[i] < arr[j]){//降序
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 分类
	 * @param arr
	 * @return
	 */
	public static List<List<Integer>>  sort(Integer[] arr){
	List<List<Integer>> resultList = new ArrayList<List<Integer>>();

		List<Integer> indexList = new ArrayList<Integer>();//索引数组
		for (int i = 0; i < arr.length; i++) {
			if (!indexList.contains(i)) {
				int curr = arr[i];
				List<Integer> tempList = new ArrayList<Integer>();
				tempList.add(curr);
				for (int j = i + 1; j < arr.length; j++) {
					int next = arr[j];
					if (curr==next) {
						tempList.add(curr);
						indexList.add(j);
					}
				}
				resultList.add(tempList);
			}
		}
		return resultList;
	}
}
