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
public class Caretaker {
	public Memento memento;

	/**
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}

