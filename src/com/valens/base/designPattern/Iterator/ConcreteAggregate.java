/**
 * 
 */
package com.valens.base.designPattern.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ConcreteAggregate implements Aggregate {
	private List itemsList=new ArrayList();

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Aggregate#createIterator()
	 */
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(itemsList);
	}
	
	public int count(){
		return itemsList.size();
	}

	 public void add(Object obje){
		 itemsList.add(obje);
	 }
	 public void remove(Object obje){
		 itemsList.remove(obje);
	 }
	

}

