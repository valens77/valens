/**
 * 
 */
package com.valens.base.designPattern.Facade;

/**
 * @Description 门面/外观模式
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Facade {
	private SubSystemOne one ;
	private SubSystemTwo two ;
	private SubSystemThree three ;
	public Facade(){
		one =new SubSystemOne();
		two=new SubSystemTwo();
		three=new SubSystemThree();
	}
	public void methodA(){
		System.out.println(" 处理 methodA 业务");
		one.doSomeThing();
		two.doSomeThing();
	}
	public void methodB(){
		System.out.println(" 处理 methodB 业务");
		three.doSomeThing();
		two.doSomeThing();
	}
}

