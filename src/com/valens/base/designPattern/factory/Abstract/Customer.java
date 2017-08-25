/**
 * 
 */
package com.valens.base.designPattern.factory.Abstract;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-20
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Customer {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-20
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生产宝马320系列配件  
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();    
        factoryBMW320.createEngine();  
        factoryBMW320.createAircondition();  
            
        //生产宝马523系列配件    
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();    
        factoryBMW320.createEngine();  
        factoryBMW320.createAircondition();
	}

}

