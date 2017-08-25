/**
 * 
 */
package com.valens.base.designPattern.factory.simple;

/**
 * @Description 加法
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class OperationAdd extends Operation {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.SimpleFactoryPattern.Operation#getResult()
	 */
	@Override
	public double getResult() {
		System.out.println(this.getClass().getSimpleName());
		return numberA+numberB;
	}

}

