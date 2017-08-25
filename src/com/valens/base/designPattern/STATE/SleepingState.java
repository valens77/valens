/**
 * 
 */
package com.valens.base.designPattern.STATE;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class SleepingState extends State{

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.STATE.State#writeProgram(com.valens.base.designPattern.STATE.Work)
	 */
	@Override
	public void writeProgram(Work work) {
		System.out.println("累趴下！"+work.getHour());
		work.isSleep=true;
		
	}

}

