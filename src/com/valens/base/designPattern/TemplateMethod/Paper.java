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
public abstract class Paper {
	 
	public void question1(){
		System.out.println("杨过得到[],后来给了郭靖,炼成了屠龙刀,倚天剑.a.球磨铸铁,b.马可铁");
		System.out.println(this.getClass().getName()+"的答案:"+answer1());
	}
	public void question2(){
		System.out.println("杨过最后和杨龙女生宝宝了吗.a.有,b.没有");
		
		System.out.println(this.getClass().getName()+"的答案:"+answer2());
	}
	abstract String answer1();
	abstract String answer2();
	public void templateMethod(){
		question1();
		question2();
	}
}

