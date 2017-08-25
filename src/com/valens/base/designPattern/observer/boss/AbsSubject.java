/**
 * 
 */
package com.valens.base.designPattern.observer.boss;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public abstract class AbsSubject {
	private List<IObserver> observers = new ArrayList<IObserver>();

	public void add(IObserver observer) {
		observers.add(observer);
	}

	void del(IObserver observer) {
		observers.remove(observer);
	}

	void notity() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

	//String notityStatus();
}
