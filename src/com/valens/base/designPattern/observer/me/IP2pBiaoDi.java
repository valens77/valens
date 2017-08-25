package com.valens.base.designPattern.observer.me;

public interface IP2pBiaoDi {
	
	
	/**
	 * 投标
	 */
	public boolean  touBiao(P2PBidder p2pBidder); 
 
	/**
	 * 通知投标人
	 */
	public void  noticeP2Per(); 
}
