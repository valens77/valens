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
public class Pursuit implements IGiveGift {
	String name="";
	SchoolGirl girl=null;
	public Pursuit(SchoolGirl girl,String pname){
		this.girl=girl;
		this.name=pname;
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveDolls()
	 */
	@Override
	public void giveDolls() {
		 System.out.println(girl.getName()+":送你洋娃娃!");


	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveFlowers()
	 */
	@Override
	public void giveFlowers() {
		 System.out.println(girl.getName()+":送你鲜花!");

	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.proxy.IGiveGift#giveChocolate()
	 */
	@Override
	public void giveChocolate() {
		 System.out.println(girl.getName()+":送你巧克力!");

	}

}

