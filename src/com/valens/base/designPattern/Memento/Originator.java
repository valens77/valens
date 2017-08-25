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
public class Originator {
	public String state;
	public   Memento createMemento(){
		return new Memento(state);
	}
	public   void setMemento(Memento memento){
		 this.state=memento.getState();
		return;
	}
	
	public void show(){
		System.out.println("state:"+this.state);
	}
}

