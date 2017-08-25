package com.valens.base.designPattern.observer.me;


public class Test {
	public static void main(String[] args) {
		P2pUser aUser=new P2pUser("a18900001",100);
		P2pCompany company=new P2pCompany();
		
		P2pUser aUser2=new P2pUser("a18900002",900);
		P2PBiaoDi 
				p2p=new P2PBiaoDi();
		         p2p.setBiaoDiMsg("标的:001,金额 1000元");
		
		company.faBiao(p2p);
		
		company.touBiaoAuto(aUser);
		company.touBiaoAuto(aUser2);
		
		p2p=new P2PBiaoDi();
		p2p.setBiaoDiMsg("标的:001,金额 1200元");
		p2p.setBiaoDiTotalMoney(1200d);
		company.faBiao(p2p);
		
		company.touBiaoAuto(aUser);
		company.touBiaoAuto(aUser);
		company.touBiaoAuto(aUser);
		company.touBiaoAuto(aUser2);
	}
}
