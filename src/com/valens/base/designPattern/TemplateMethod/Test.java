/**
 * 
 */
package com.valens.base.designPattern.TemplateMethod;

/**
 * @Description 模板方法
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 *            void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper student = new StudentA();

		student.templateMethod();

		student = new StudentB();

		student.templateMethod();
	}

}
