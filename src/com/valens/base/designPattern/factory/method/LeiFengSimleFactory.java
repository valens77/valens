/**
 * 
 */
package com.valens.base.designPattern.factory.method;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class LeiFengSimleFactory {
	static enum LeiFenEnum {
		Undergaduate, Volunteer;
	}

	public static LeiFeng createLeiFeng(LeiFenEnum leiFen) {
		LeiFeng leiFeng = null;
		switch (leiFen) {
		case Undergaduate:
			leiFeng = new Undergraduate();
			break;
		case Volunteer:
			leiFeng = new Volunteer();
			break;

		default:
			leiFeng = new LeiFeng(){

				@Override
				public void Wash() {
					// TODO Auto-generated method stub
					System.out.println("匿名者扫地");
				}

				@Override
				public void Sweep() {
					// TODO Auto-generated method stub
					System.out.println("匿名者扫地");
				}
				
			};
			break;
		}
		return leiFeng;

	}
}
