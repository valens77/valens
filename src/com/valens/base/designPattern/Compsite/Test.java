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
public class Test {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-23
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root=new Composite("root");
		root.add(new Leaf("leaf A"));
		root.add(new Leaf("leaf B"));
		Composite  x=new Composite("Composite X");
		x.add(new Leaf("leaf XA"));
		x.add(new Leaf("leaf XB"));
		

		Composite XC=new Composite("Composite XC");
		XC.add(new Leaf("leaf XCA"));
		XC.add(new Leaf("leaf XCB"));
		x.add(XC);
		root.add(x); 
		root.display(1);
	}

}

