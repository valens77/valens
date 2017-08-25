/**
 * 
 */
package com.valens.base.designPattern.Compsite;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public abstract class Componet {
	String name;
	public Componet(String name){
		this.name=name;
	}
	public abstract void add( Componet c);//通常用ADD,REMOVE方法来添加或移除树叶,树枝
	public abstract void remove( Componet c);
	public abstract void display( int depth);
	public abstract void showFun();
	public String getG(int depth){
		String string="-";
		String resultString="";
		for(int i=1;i<depth;i++){
			resultString+=string;
		}
		return resultString;
	}
}

