/**
 * 
 */
package com.valens.base.designPattern.Facade;

/**
 * @Description 门面模式
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class FacadeTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade=new Facade(); 
		facade.methodA();//客户端不需要知道SubSystem? 处理
		facade.methodB();
	}

}

