package com.valens.design.observer.me;

public class P2pUser implements P2PBidder {
	private double toubiaoMoney = 0;

	private String account = "";

	public P2pUser(String account, double toubiaoMoney) {
		this.toubiaoMoney = toubiaoMoney;
		this.account = account;
	}

	public String getBidderName() {
		return account;
	}

	public double getToubiaoMoney() {

		return toubiaoMoney;
	}

	public void update() {

	}

	public void showHuiiaoMsg(double money) {
		
	}

	public void showToubiaoMsg(double money) {
		System.out.println(account+" 投了%d元"+money);
	}

}
