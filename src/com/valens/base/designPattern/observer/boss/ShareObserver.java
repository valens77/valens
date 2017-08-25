/**
 * 
 */
package com.valens.base.designPattern.observer.boss;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ShareObserver implements IObserver {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.observer.boss.AbsObserver#update()
	 */
	@Override
	public void update() {
		System.out.println("看股票的赶紧关了,老板回来了!");

	}

}

