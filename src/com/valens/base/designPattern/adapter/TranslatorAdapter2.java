/**
 * 
 */
package com.valens.base.designPattern.adapter;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class TranslatorAdapter2 extends FCenterPlayer implements Iplayer {

	/**
	 * @param name
	 */
	public TranslatorAdapter2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Iplayer#attack()
	 */
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		this.进攻();
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Iplayer#defense()
	 */
	@Override
	public void defense() {
		// TODO Auto-generated method stub
		this.防守();
	}

	 
 

}

