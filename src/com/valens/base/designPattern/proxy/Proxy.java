/**
 * 
 */
package com.valens.base.designPattern.proxy;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class Proxy implements IGiveGift {
	Pursuit gg = null;

	public Proxy(Pursuit gg) {
		this.gg = gg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveDolls()
	 */
	@Override
	public void giveDolls() {
		System.out.println("帮助"+gg.name+"送洋娃娃:");
		gg.giveDolls();//真实请求的GG的请求
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveFlowers()
	 */
	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("帮助"+gg.name+"送鲜花:");
		gg.giveFlowers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveChocolate()
	 */
	@Override
	public void giveChocolate() {
		System.out.println("帮助"+gg.name+"送巧克力:");
		// TODO Auto-generated method stub
		gg.giveChocolate();
	}

}
