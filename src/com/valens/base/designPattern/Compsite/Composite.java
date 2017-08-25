/**
 * 
 */
package com.valens.base.designPattern.Compsite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class Composite extends Componet {
	

	/**
	 * @param name
	 */
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Componet> children=new ArrayList<Componet>();
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#add(com.valens.base.designPattern.Compsite.Componet)
	 */
	@Override
	public void add(Componet c) {
		children.add(c);
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#remove(com.valens.base.designPattern.Compsite.Componet)
	 */
	@Override
	public void remove(Componet c) {
		children.remove(c);
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#display(int)
	 */
	@Override
	public void display(int depth) {
		System.out.println(getG(depth)+name);
		for (Componet c : children) {
			c.display(depth+2);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Compsite.Componet#showFun()
	 */
	@Override
	public void showFun() {
		System.out.println("我具有输送营养的功能");
		
	}

}

