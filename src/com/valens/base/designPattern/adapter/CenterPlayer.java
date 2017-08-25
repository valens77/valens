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
public class CenterPlayer extends Player {

	/**
	 * @param name
	 */
	public CenterPlayer(String name) {
		super(name);
	}


	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.adapter.Player#attack()
	 */
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+name+"进攻！");
	}

 
	public void defense() {
		System.out.println(this.getClass().getSimpleName()+name+"防守！");

	}

}

