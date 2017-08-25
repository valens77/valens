/**
 * 
 */
package com.valens.base.designPattern.Memento;

import java.util.Random;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class GameRole {
	
	public GameRole(int ap,int hp,int mp){
		this.HP=hp;
		this.MP=mp;
		this.AP=ap;
	}
	/**
	 * @param boss the boss to set
	 */
	public void setBoss(GameBoss boss) {
		this.boss = boss;
	}
	/**
	 * @return the boss
	 */
	public GameBoss getBoss() {
		return boss;
	}
	private int HP,AP,MP;
	public GameBoss boss=new GameBoss(20000000,1500);
	private int playNum=1;//次数
	public void show(){
		System.out.println("攻击力:"+this.AP);
		System.out.println("防御力:"+this.MP);
		System.out.println("生命力:"+this.HP);
	}
	
	public void attactBoss(){
		System.out.println("第"+playNum+"次攻打BOSS");
		boss.resetBoss();
		Random random=new Random();
		int currtAp=0;
		for (int i = 0; i < 20; i++) {
			if(this.playNum<2){ 
				currtAp=this.AP*random.nextInt(5);
			}else if(this.playNum<5){//攻打次数大于5次后,涨BUFF  扩大攻击力
				 
				currtAp=this.AP*(10-random.nextInt(5));
			}else if(this.playNum<7){
				currtAp=this.AP*(30-random.nextInt(5));
			}else{
				currtAp=this.AP*(500-random.nextInt(5));
				 
			}
			System.out.println("此次攻击力为:"+currtAp);
			boss.hp-=currtAp;
			System.out.println("boss hp:"+boss.hp);
			 
			 if(boss.hp<=0){
					boss.hp=0;
					System.out.println("攻击次数:"+(i+1));
					break;
			 } 
			this.HP-=boss.ap;
			System.out.println("me hp:"+this.HP);
			if(this.HP<15000){
				System.out.println("抗不住了,我要回档");
				System.out.println("攻击次数:"+(i+1));
				playNum++;
				break;
			}
		}
		System.out.println("boss hp:"+(boss.hp>0?boss.hp:0));
		if(boss.hp<=0){
			System.out.println("恭喜你打败了BOSS,得到了1毛钱和1点经验值");
			System.out.println("恭喜你获得了世界首富成就");
			System.out.println("恭喜你升级了100级");
		}
	}
	
	public RoleStateBox SaveRole(){
		RoleStateBox  roleBox=  new RoleStateBox();
		roleBox.setAP(AP);
		roleBox.setHP(HP);
		roleBox.setMP(MP);
		return roleBox;
	}
	
	public void recoverRole(RoleStateBox box){
		this.AP=box.getAP();
		this.MP=box.getMP();
		this.HP=box.getHP();
	}
	
}

