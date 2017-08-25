/**
 * 
 */
package com.valens.base.designPattern.TemplateMethod;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class StudentB extends Paper {
	

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.TemplateMethod.Paper#answer1()
	 */
	@Override
	String answer1() {
		// TODO Auto-generated method stub
		return "B";
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.TemplateMethod.Paper#answer2()
	 */
	@Override
	String answer2() {
 
		return "A";
	}

}

