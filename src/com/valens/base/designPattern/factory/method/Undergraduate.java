/**
 * 
 */
package com.valens.base.designPattern.factory.method;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class Undergraduate extends LeiFeng {
	private String name = "";

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.method.LeiFeng#Wash()
	 */
	@Override
	public void Wash() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.method.LeiFeng#Sweep()
	 */
	@Override
	public void Sweep() {
		// TODO Auto-generated method stub
		
	}

}
