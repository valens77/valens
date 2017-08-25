/**
 * 
 */
package com.valens.base.designPattern.adapter;

/**
 * @Description 适配器
 * @author Huangxiaohua
 * @CreateDate 2017-6-22
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class AdapterTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-22
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Iplayer b=new CenterPlayer("巴蒂尔");
		 b.attack();
		 
		 Iplayer ym=new  TranslatorAdapter(new FCenterPlayer("姚明"));
		 ym.attack();
		 ym=new  TranslatorAdapter2("姚明2");
		 ym.attack();
	}

}

