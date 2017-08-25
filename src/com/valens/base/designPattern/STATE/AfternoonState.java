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
public class AfternoonState extends State {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.STATE.State#writeProgram(com.valens.base.designPattern.STATE.Work)
	 */
	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.hour<18){
			System.out.println("下午时间 精神一般!"+work.getHour());
		}else{
			work.setCurrent(new EveningState());
			work.writeProgram();
		}
	}

}

