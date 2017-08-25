/**
 * 
 */
package com.valens.base.designPattern.Builder;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ProductCook {
	private String partA="";
	private String partB="";
	private String partC="";
	public String toString(){
		return this.partA+":"+this.partB+":"+this.partC;
	}
	/**
	 * @param partC the partC to set
	 */
	public void setPartC(String partC) {
		this.partC = partC;
	}
 
	/**
	 * @param partA the partA to set
	 */
	public void setPartA(String partA) {
		this.partA = partA;
	}
 
	/**
	 * @param partB the partB to set
	 */
	public void setPartB(String partB) {
		this.partB = partB;
	}
}

