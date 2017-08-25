/**
 * 
 */
package com.valens.base.designPattern.StrategyPattern.cash;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class CashContext {
	private CashSuper cs=null;
	public CashContext(CashSuper cs){
		this.cs=cs;
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
			
}

