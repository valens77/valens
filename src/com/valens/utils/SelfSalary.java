package com.valens.utils;

public class SelfSalary {
	
	private static final double 月收入税级表[]={0,1500,4500,9000,35000,55000,80000};
	private static final double 月收入税率表[]={0.03,0.1,0.2,0.25,0.3,0.35,0.45};
	private static final double 月收扣除表[]={0,105,555,1005,2755,5505,13505};
	private static final double 起征金额=3500;
	
	public static double 计算个人所得税(double 工资){
		double 个人所得税=0;
		System.out.println("工资(扣除五险一金后):"+工资);
		double 需征税金额=工资-起征金额;
		System.out.println("需征税金额:"+需征税金额);
		//double 当前档需扣金额=0;
		for(int index=月收入税级表.length-1;index>-1;index--){
			if(需征税金额>月收入税级表[index]){
				if(index!=月收入税级表.length-1){
					个人所得税=需征税金额*月收入税率表[index]-月收扣除表[index];
					break;
				}else{
					个人所得税=需征税金额*月收入税率表[index]-月收扣除表[index];
					break;
				}
			}
		}
		
		return 个人所得税;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//21270.35,21270.0,25420.0
		System.out.println("您需要扣的税金总额为:"+SelfSalary.计算个人所得税(90000));
	}
	
	

}
