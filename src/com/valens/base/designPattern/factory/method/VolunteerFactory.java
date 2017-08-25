/**
 * 
 */
package com.valens.base.designPattern.factory.method;

/**
 * @Description 社区志愿 者工厂
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class VolunteerFactory implements ILeiFengFactory {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.method.ILeiFengFactory#createLeiFeng()
	 */
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}

