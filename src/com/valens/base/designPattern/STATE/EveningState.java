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
public class EveningState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.valens.base.designPattern.STATE.State#writeProgram(com.valens.base
	 * .designPattern.STATE.Work)
	 */
	@Override
	public void writeProgram(Work work) {
		System.out.println("傍晚时间 没心情干活"+work.getHour());
		// TODO Auto-generated method stub
		if (work.finish) {
			work.setCurrent(new RestState());
			work.writeProgram();
		}else  if(work.hour>22){
			 work.setCurrent(new SleepingState());
			 work.writeProgram();
		 } 
	}

}
