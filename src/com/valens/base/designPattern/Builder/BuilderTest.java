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
public class BuilderTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-19
	 */
	public static void main(String[] args) {
		ProductBuilder pBuilder=new ProductBuilder();
		ProductBuilderB pBuilderB=new ProductBuilderB();
		
		Director  d=new Director();
		d.Construct(pBuilder);//指挥pBuilder进行builder
		
		ProductCook pc=pBuilder.builderProduct();
		System.out.println(pc.toString());
		
		d.Construct(pBuilderB);
		pc=pBuilderB.builderProduct();
		System.out.println(pc.toString());
		 
		

	}

}

