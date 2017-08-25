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
public class MethodTest {
	public static void main(String[] s) {
		System.out.println("简单工厂:");//增加新的 实现时需修改LeiFengSimleFactory中的SWITCH分支 
		//simpleFactory
		LeiFeng underGraduate=LeiFengSimleFactory.createLeiFeng(LeiFengSimleFactory.LeiFenEnum.Undergaduate);
		underGraduate.Sweep();
		LeiFeng volunteer=LeiFengSimleFactory.createLeiFeng(LeiFengSimleFactory.LeiFenEnum.Volunteer);
		volunteer.Sweep();
		System.out.println("工厂方法:");
		//MethodFactory  增加新的 实现时,只需在调用时 使用新的工厂方法类  :克服了简单工厂违背了开放-封闭(可扩展,尽量不修改)原则的缺点
			//缺点:每增加一个类.都需增加工厂类  (反射)
		ILeiFengFactory leiFengFactory=new VolunteerFactory();//new UnderGraduateFactory();
		LeiFeng L=leiFengFactory.createLeiFeng();
		L.Sweep();
	}
}
