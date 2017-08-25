/**
 * 
 */
package com.valens.base.designPattern.STATE;

/**
 * @Description 状态模式
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class WorkTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-22
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work wk=new Work();
		wk.hour=9;
		while (!wk.finish&&!wk.isSleep) {
			wk.writeProgram();
			wk.setHour(wk.getHour()+2);
			
		}
	}

}

