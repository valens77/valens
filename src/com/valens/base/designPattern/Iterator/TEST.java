/**
 * 
 */
package com.valens.base.designPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class TEST {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-23
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate aggregate=new ConcreteAggregate();
		aggregate.add("a");
		aggregate.add("c");
		aggregate.add("b");
		aggregate.add(2);
		aggregate.add(1);
		aggregate.add('F');
		Iterator iterator=aggregate.createIterator();
		while(iterator.hasNext()){
			Object object =iterator.Next();
			System.out.println(object);
		}
		
		List list=new ArrayList();
	}

}

