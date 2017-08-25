/**
 * 
 */
package com.valens.base.designPattern.factory.simple;

import com.valens.base.designPattern.factory.simple.OperationFactory.OperationEnum;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class SimpleFactoryTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-16
	 */
	public static void main(String[] args) {
		
		Operation  operation=OperationFactory.createOperation(OperationEnum.ADD);
		operation.setNumberA(100d);
		operation.setNumberB(200);
		System.out.println(operation.getResult());
		
		   operation=OperationFactoryMap.createOperation(OperationFactoryMap.OperationEnum.MUL);
		   operation.setNumberA(12);
		   operation.setNumberB(13);
		   System.out.println(operation.getResult());
	}

}

