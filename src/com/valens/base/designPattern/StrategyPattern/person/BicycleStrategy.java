/**
 * 
 */
package com.valens.base.designPattern.StrategyPattern.person;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class BicycleStrategy implements ITravelStrategy {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.StrategyPattern.person.TravelStrategy#travel()
	 */
	@Override
	public void travel() {
		System.out.println(this.getClass());

	}

}

