/**
 * 
 */
package com.valens.base.designPattern.Memento;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class GameBoss {
	public int hp,ap;
	private int initHp,initAp;
	public GameBoss(int hp,int ap){
		this.hp=hp;
		this.ap=ap;
		this.initAp=ap;
		this.initHp=hp;
	}
	public void resetBoss(){
		this.hp=initHp;
		this.ap=initAp;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
}

