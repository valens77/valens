/**
 * 
 */
package com.valens.base.designPattern.Iterator;

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
public class ConcreteIterator implements Iterator {
	List list =null;
	private int cursor=0;
	public ConcreteIterator(List list){
		this.list=list;
	}
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Iterator#First()
	 */
	@Override
	public Object First() {
		return list.get(0);
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Iterator#Next()
	 */
	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		if(this.hasNext()){
			return list.get(cursor++);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Iterator#isDone()
	 */
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Iterator#currentItem()
	 */
	@Override
	public Object currentItem() {
		if(cursor==0){
			return list.get(cursor);
		}
		return list.get(cursor-1);
	}
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !(cursor == list.size());
	}

}

