package com.valens.base.utils;

import java.util.ArrayList;
import java.util.List;

public class ThreadUtils {
	/**
	 * 检查线程LIST 是否存在活的线程 并返回该线程(顺序取一个)
	 * 既 返回NULL时说明线程已执行完
	 * @param listThread
	 * @return
	 */
	public Thread isAliveThread(List<Thread> listThread) {
		Thread aliveThread=null;
		for (Thread t : listThread) {
			boolean isOver = t.isAlive();
			if (isOver) {// 有未执行完的线程
				aliveThread=t;
				break;
			} else {
				continue;
			}
		}
		return aliveThread;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List list=new ArrayList();
		 list.add("123");
		 list.add("456");
		 list.add("789");
		 Object temp=null;
		 for(Object obj:list){
			 System.out.println(obj);
			 temp=obj;
		 }
		 list.remove(temp);
		 for(Object obj:list){
			 System.out.println(obj);
		 }

	}

}
