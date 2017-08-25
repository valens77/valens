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
public class CashTest {

	/**
	 * @Description TODO
	 * @param args
	 *            void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		double money = 100;
		CashContext cc = new CashContext(
				CashFactory.createCashAccept(CashFactory.CashEnum.Normal));
		cc.getResult(money);

	}

}
