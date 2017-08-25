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
public abstract class Player implements Iplayer {
	String name;
	public Player(String name){
		this.name=name;
	}

}

