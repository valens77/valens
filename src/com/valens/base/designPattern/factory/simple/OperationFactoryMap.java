/**
 * 
 */
package com.valens.base.designPattern.factory.simple;

import java.util.HashMap;

/**
 * @Description  简单工厂模式:计算器
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public  class OperationFactoryMap {
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
		 SUB,
		 /**
		  * 乘法
		  */
		 MUL;
	 }
	 /**
	  * 超过三个条件的 就if 其他的 都使用map..所以俺代码里面没什么明显的判断
	  */
	 static HashMap<OperationEnum,Class> OperatonMap=new HashMap();
	 static {
		 OperatonMap.put(OperationEnum.ADD, OperationAdd.class);
		 OperatonMap.put(OperationEnum.ADD, OperationSub.class);
		 OperatonMap.put(OperationEnum.MUL, OperationMul.class);
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
		 if(operate!=null){
			 try {
				 Class class1=OperatonMap.get(operate);
				 if(class1!=null){
					 operation=(Operation)class1.newInstance();
				 }
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		return operation;
	}
	
}

