/**
 * 
 */
package com.valens.base.designPattern.STATE;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-20
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ForenoonState extends State {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.STATE.State#writeProgram(com.valens.base.designPattern.STATE.Work)
	 */
	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.hour<12){
			System.out.println("上午时间 精神好!"+work.getHour());
		}else{
			work.setCurrent(new AfternoonState());
			work.writeProgram();
		}
	}

}

