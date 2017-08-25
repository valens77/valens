/**
 * 
 */
package com.valens.base.designPattern.StrategyPattern.cash;

/**
 * @Description 反利/满减
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class CashReturn extends CashSuper {
	private double moenyCondition=0d;
	private double moenyReturn=0d;
	public CashReturn(String moenyCondition,String moenyReturn){
		this.moenyCondition=Double.parseDouble(moenyCondition);
		this.moenyReturn=Double.parseDouble(moenyReturn);
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.StrategyPattern.cash.CashSuper#acceptCash(double)
	 */
	@Override
	public double acceptCash(double money) {

		double result=money;
		if(money>=moenyCondition){
			result=money-Math.floor(money/moenyCondition)*moenyReturn;
		}
		return result;
	}

}

