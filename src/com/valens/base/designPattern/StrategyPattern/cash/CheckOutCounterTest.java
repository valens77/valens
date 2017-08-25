/**
 * 
 */
package com.valens.base.designPattern.StrategyPattern.cash;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class CheckOutCounterTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-16
	 */
	public static void main(String[] args) {

		CheckOutCounter coc=new CheckOutCounter();
		GoodItems item=new GoodItems();
		item.setCount(1);
		item.setPrice(3.5d);
		item.setName("王老吉");
		coc.addItems(item);
		  item=new GoodItems();
		item.setCount(3);
		item.setPrice(2.5d);
		item.setName("啤酒");
		coc.addItems(item);
		coc.printItems();
		System.out.println(coc.getTotalMoney());
		coc.checkOut(coc.getTotalMoney());
		coc.checkOutNext();
		
		 item=new GoodItems();
			item.setCount(3);
			item.setPrice(2.5d);
			item.setName("桃子");
			coc.addItems(item);
			coc.printItems();
			coc.checkOut(coc.getTotalMoney());
			
			coc.printItemsAll();
		
			 
		
		
	}

}

