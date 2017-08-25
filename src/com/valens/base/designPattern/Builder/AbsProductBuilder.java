/**
 * 
 */
package com.valens.base.designPattern.Builder;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public abstract class AbsProductBuilder {
	abstract ProductCook builderProduct();
	abstract void builderProductPartA();
	abstract void builderProductPartB();
	abstract void builderProductPartC();
}

