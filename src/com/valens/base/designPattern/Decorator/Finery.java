/**
 * 
 */
package com.valens.base.designPattern.Decorator;

/**
 * @Description 装饰模式 
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class Finery extends Person {
	protected Person person;

	public void decorate(Person person) {
		//防止死循环,
		if(!this.getClass().equals(person.getClass())){
			this.person = person;
		}
	}

	public void show() {
		if (person != null) {
			person.show();
		}
	}
}
