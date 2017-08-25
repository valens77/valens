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
public class Work {
	private State current;
	public int hour;//状态转换
	public boolean finish=false;//完成状态1
	public boolean isSleep=false;//完成状态2
	public void writeProgram(){
		current.writeProgram(this);
	}
	public Work(){
		current=new ForenoonState();
	}
	/**
	 * @return the current
	 */
	public State getCurrent() {
		return current;
	}
	/**
	 * @param current the current to set
	 */
	public void setCurrent(State current) {
		this.current = current;
	}
	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}
	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
	/**
	 * @return the finish
	 */
	public boolean isFinish() {
		return finish;
	}
	/**
	 * @param finish the finish to set
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
}

