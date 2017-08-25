/**
 * 
 */
package com.valens.base.designPattern.Builder;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Director {
	/**
	 * @Description 指挥建造者 做事
	 * @param builder  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public void Construct(AbsProductBuilder builder){
		builder.builderProductPartA();
		builder.builderProductPartB();
		builder.builderProductPartC();
	}
}

