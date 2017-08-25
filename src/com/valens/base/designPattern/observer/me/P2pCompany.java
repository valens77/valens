package com.valens.base.designPattern.observer.me;

import java.util.ArrayList;
import java.util.List;

public class P2pCompany {
	public P2pCompany(){
		
	}
	
	private ArrayList<P2PBiaoDi> faP2PBiaoDis=new ArrayList();
	private ArrayList<P2PBiaoDi> manP2PBiaoDis=new ArrayList();
	private ArrayList<P2PBiaoDi> huiP2PBiaoDis=new ArrayList();
	/**
	 * 发标
	 * @param p2p
	 */
	public void faBiao(P2PBiaoDi p2p){
		faP2PBiaoDis.add(p2p);
	}
	/**
	 * 回标
	 * @param p2p
	 */
	public void huiBiao(P2PBiaoDi p2p){
		if(manP2PBiaoDis.indexOf(p2p)>0){
			manP2PBiaoDis.remove(p2p);
			huiP2PBiaoDis.add(p2p);
		}
	}
	/**
	 * 自动 投标
	 * @param p
	 */
	public void touBiaoAuto(P2PBidder p){
		if(faP2PBiaoDis.size()>0){
			List<P2PBiaoDi>  manBiao=new ArrayList(); 
			boolean flag=false;
			for(P2PBiaoDi b:faP2PBiaoDis){
				
				flag=b.touBiao(p);
				if(b.getBiaoDiLeftMoney()==0){
					manBiao.add(b);
				}
				if(flag){
					break ;
				}
			}
			for(P2PBiaoDi b:manBiao){
				manP2PBiaoDis.add(b);
				faP2PBiaoDis.remove(b);
				b.noticeP2Per();
			}
		}
	}
}
