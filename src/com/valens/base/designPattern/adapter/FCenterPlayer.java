/**
 * 
 */
package com.valens.base.designPattern.adapter;

/**
 * @Description 中国球员 只能听中文
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class FCenterPlayer extends ForeingPlayer {

 

	/**
	 * @param name
	 */
	public FCenterPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.ForeingPlayer#进攻()
	 */
	@Override
	public void 进攻() {
		System.out.println(this.getClass().getSimpleName()+name+" 外籍 进攻！");
	}


	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.ForeingPlayer#防守()
	 */
	@Override
	public void 防守() {
		System.out.println(this.getClass().getSimpleName()+name+" 外籍 防守！");
		
	}

}

