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
public class FactoryBMW523 implements AbstractFactory {

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.Abstract.AbstractFactory#createEngine()
	 */
	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new EngineB();    
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.factory.Abstract.AbstractFactory#createAircondition()
	 */
	@Override
	public Aircondition createAircondition() {
		// TODO Auto-generated method stub
		return new AirconditionB();    
	}

}

