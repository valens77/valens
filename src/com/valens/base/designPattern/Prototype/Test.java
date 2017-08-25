/**
 * 
 */
package com.valens.base.designPattern.Prototype;

import java.io.IOException;

import oracle.net.aso.b;

/**
 * @Description 原型 模式 
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Test {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Resume aResume=new Resume();
		aResume.setAge("18");
		aResume.setName("小乌");
		aResume.setSex("男");
		aResume.setWorkExperienceInfo("2010.7-2011.9","上海思诺博");
		Resume bResume=(Resume)aResume.clone();
		System.out.println(aResume.equals(bResume));
		bResume.setAge("19");
		bResume.setWorkExperienceInfo("2011.9-2016.3", "鸿冠");
		Resume cResume=(Resume)aResume.clone();
		cResume.setWorkExperienceInfo("2016.7-now", "now");
		cResume.setAge("20");
		aResume.display();
		bResume.display();
		cResume.display();
	}

}

