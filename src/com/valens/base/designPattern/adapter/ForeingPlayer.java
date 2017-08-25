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
public abstract class ForeingPlayer  {
	 String name=""
			;
	public ForeingPlayer(String name){
		this.name=name;
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Player#attack()
	 */
	protected abstract void 进攻();  

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Player#defense()
	 */
	protected abstract void 防守();  

}

