/**
 * 
 */
package com.valens.base.designPattern.proxy;

/**
 * @Description 代理模式
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ProxyTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		SchoolGirl mmGirl=new SchoolGirl("李妖妖");
		Pursuit gg=new Pursuit(mmGirl,"戴力");
		 Proxy proxy=new Proxy(gg);
		 proxy.giveDolls();
		 proxy.giveChocolate();
		 proxy.giveFlowers();

	}

}

