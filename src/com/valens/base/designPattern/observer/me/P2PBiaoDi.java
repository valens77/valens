package com.valens.base.designPattern.observer.me;

import java.util.ArrayList;
import java.util.Observable;

public class P2PBiaoDi implements IP2pBiaoDi{
	private Double biaoDiTotalMoney=1000d;//总额
	public Double biaoDiLeftMoney=biaoDiTotalMoney;//剩余筹款金额
	private Object biaoDiMsg="";
	private ArrayList<P2PBidder> p2pBidders=new ArrayList();//投标人
	public Double getBiaoDiTotalMoney() {
		return biaoDiTotalMoney;
	}

	public void setBiaoDiTotalMoney(Double biaoDiTotalMoney) {
		this.biaoDiTotalMoney = biaoDiTotalMoney;
		biaoDiLeftMoney=biaoDiTotalMoney;
	}

	public Double getBiaoDiLeftMoney() {
		return biaoDiLeftMoney;
	}

	public Object getBiaoDiMsg() {
		return biaoDiMsg;
	}

	public void setBiaoDiMsg(Object biaoDiMsg) {
		this.biaoDiMsg = biaoDiMsg;
	}

	public void noticeP2Per() {
		System.out.println("标满 了");
		for(P2PBidder p2pBidder:p2pBidders){
			p2pBidder.showToubiaoMsg(p2pBidder.getToubiaoMoney());
		}
	}

	public boolean touBiao(P2PBidder p) {
		if(p.getToubiaoMoney()>biaoDiLeftMoney){
			System.out.println("可筹款金额不足:可筹款="+biaoDiLeftMoney);
			return false;
		}else{
			biaoDiLeftMoney-=p.getToubiaoMoney();
			p2pBidders.add(p);
		}
		return true;
	}
}
