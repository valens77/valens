/**
 * 
 */
package com.valens.base.designPattern.factory.simple;

/**
 * @Description  简单工厂模式:计算器
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public abstract class Operation { 
	protected double numberA;
	protected double numberB;
	public abstract double getResult();
	/**
	 * @return the numberA
	 */
	public double getNumberA() {
		return numberA;
	}
	/**
	 * @param numberA the numberA to set
	 */
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	/**
	 * @return the numberB
	 */
	public double getNumberB() {
		return numberB;
	}
	/**
	 * @param numberB the numberB to set
	 */
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	
}

