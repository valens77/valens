/**
 * 
 */
package com.valens.base.designPattern.factory.method;

/**
 * @Description  社区志愿 者
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Volunteer extends LeiFeng {
	private String name = "";

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

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.method.LeiFeng#Wash()
	 */
	@Override
	public void Wash() {
		System.out.println("志愿者认真扫地");
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.method.LeiFeng#Sweep()
	 */
	@Override
	public void Sweep() {
		System.out.println("志愿者认真洗衣");
		
	}
}

