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
public class Leaf extends Componet {

	/**
	 * @param name
	 */
	public Leaf(String name) {
		super(name);
 
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#add(com.valens.base.designPattern.Compsite.Componet)
	 */
	@Override
	public void add(Componet c) {
		System.out.println("CAN NOT  ADD  TO A LEAF!");

	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#remove(com.valens.base.designPattern.Compsite.Componet)
	 */
	@Override
	public void remove(Componet c) {
		// TODO Auto-generated method stub
		System.out.println("CAN NOT  remove from 	A LEAF!");
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#display(int)
	 */
	@Override
	public void display(int depth) {
		System.out.println(getG(depth)+name);
		showFun();
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#showFun()
	 */
	@Override
	public void showFun() {
	 
		System.out.println("我是叶子,我的作用是光合作用");
	}


}

