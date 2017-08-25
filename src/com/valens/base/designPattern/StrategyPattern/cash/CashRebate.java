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
public class CashRebate extends CashSuper {
	
	
	private double moneyRebate=1d;
	
	public CashRebate(String moneyRebate){
		this.moneyRebate=Double.parseDouble(moneyRebate);
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.StrategyPattern.cash.CashSuper#acceptCash(double)
	 */
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return moneyRebate*money;
	}

}

