/**
 * 
 */
package com.valens.base.designPattern.Prototype;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public interface IPrototype {
	  /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object cloneShallow();
    public Object cloneDeep() throws Exception;
}

