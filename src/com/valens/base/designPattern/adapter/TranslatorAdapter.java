/**
 * 
 */
package com.valens.base.designPattern.adapter;

/**1.类的适配器模式（采用继承实现）2.对象适配器（采用对象组合方式实现）
 * 对象的适配器模式的不同之处在于Adapter角色封装了Adaptee角色，而不像类的适配器模式所采取的继承方式。其原理基本上是相似的。
 * @Description 翻译适配器
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class TranslatorAdapter extends Player {
	/**
	 * @param name
	 */
	public TranslatorAdapter(ForeingPlayer fp) {
		super(fp.name);
		this.Fp=fp;
		// TODO Auto-generated constructor stub
	}

	private ForeingPlayer Fp;//需要适配的类

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Player#attack()
	 */
	@Override
	public void attack() {
		Fp.进攻();
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Player#defense()
	 */
	@Override
	public void defense() {
		Fp.防守();
	}

}

