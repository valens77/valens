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
public interface AbstractFactory {
	//制造发动机  
    public Engine createEngine();  
    //制造空调   
    public Aircondition createAircondition();
}

