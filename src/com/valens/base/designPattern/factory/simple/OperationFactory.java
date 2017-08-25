/**
 * 
 */
package com.valens.base.designPattern.factory.simple;

/**
 * @Description  简单工厂模式:计算器
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public  class OperationFactory {
	/**
	 * 
	 * @Description 已定义的计算器种类枚举
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-16
	 * @updater     
	 * @updateDate 
	 * @remark
	 * @version v1.0
	 */
	 static enum OperationEnum{
		 /**
		  * 加法
		  */
		 ADD,
		 /**
		  * 减法
		  */
		 SUB;
	 }
	 /**
	  * @Description 创建计算器
	  * @param operate
	  * @return  Operation
	  * @author Huangxiaohua
	  * @CreateDate 2017-6-16
	  */
	public static Operation createOperation(OperationEnum operate){
		Operation operation=null;
		switch (operate) {
			case ADD:
				operation=new OperationAdd();
				break;
			case SUB:
				operation=new OperationSub();
				break;
		default:
			break;
		}
		return operation;
	}
	
}

