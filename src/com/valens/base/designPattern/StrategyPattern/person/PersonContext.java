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
public class PersonContext {
	private ITravelStrategy travel;
	public  PersonContext(ITravelStrategy travel) {
		this.travel=travel;
	}
	
	public void travel() {
		travel.travel();
	}
	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-16
	 */
	public static void main(String[] args) {
		PersonContext personContext=new PersonContext(new BicycleStrategy());
		personContext.travel();
	}

}

