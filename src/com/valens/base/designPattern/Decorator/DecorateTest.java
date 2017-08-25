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
public class DecorateTest {

	/** @Description 装饰模式
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		 Person person=new Person("小菜");
		 //System.out.println("第一种装扮:");
		 Sneakers sk=new Sneakers();
		 BigTrouser bt=new BigTrouser();
		 TShirts ts=new TShirts();
		 
		 sk.decorate(person);//装饰顺序
		// ts.decorate(sk);
		 bt.decorate(sk);
		 bt.show();

	}

}

