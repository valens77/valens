/**
 * 
 */
package com.valens.base.designPattern.Decorator;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Sneakers extends Finery {
	public void show() {
		super.show();
		System.out.println(""+this.getClass().getSimpleName());
	}
}

