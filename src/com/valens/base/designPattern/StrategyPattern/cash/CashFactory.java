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
public class CashFactory {
	 static enum CashEnum {
		Normal, Rebate, Return;
	}

	public static CashSuper createCashAccept(CashEnum type) {
		CashSuper cashSuper = null;
		switch (type) {
		case Normal:
			cashSuper=new CashNormal();
			break;
		case Rebate:
			cashSuper=new CashRebate("0.9");
			break;
		case Return:
			cashSuper=new CashReturn("500","50");
			break; 
		default:
			cashSuper=new CashNormal();
			break;
		}
		return cashSuper;

	}
}
