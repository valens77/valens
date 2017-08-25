/**
 * 
 */
package com.valens.base.designPattern.Iterator;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public  interface Iterator {
	public   Object First();
	public   Object Next();
	public   boolean hasNext();
	public   boolean isDone();
	public   Object currentItem();
}

