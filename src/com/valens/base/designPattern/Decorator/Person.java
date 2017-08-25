/**
 * 
 */
package com.valens.base.designPattern.Decorator;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Person {
	
	private String name;
	public Person(){
		
	}
		public Person(String name){
		this.name=name;
	}
	public void show(){
		System.out.println(this.name+"的形象展示:");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}

