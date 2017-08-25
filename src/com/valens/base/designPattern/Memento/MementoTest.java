/**
 * 
 */
package com.valens.base.designPattern.Memento;

/**
 * @Description 备忘录模式
 * @author Huangxiaohua
 * @CreateDate 2017-6-23
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class MementoTest {

	/** @Description TODO
	 * @param args  void
	 * @author Huangxiaohua
	 * @CreateDate 2017-6-23
	 */
	public static void main(String[] args) {
		 Originator originator=new Originator();
		 originator.state="on";//初始状态
		 originator.show();
		 
		 Caretaker caretaker=new Caretaker();
		 caretaker.memento=originator.createMemento();//保存 状态(将originator STATE保存到memento 中 )
		 
		 originator.state="off";
		 originator.show();
		 
		 originator.setMemento(caretaker.memento);//恢复状态  从caretaker的memento中恢复state;
		 originator.show();
		 
		 GameRole role=new GameRole(20000,40000,15000);
		 role.show();
		 
		 RoleManager rmManager=new RoleManager(); 
		 rmManager.setRoleBox(role.SaveRole());//存档
		 
		 while (true) {
			 role.show();
			//开始打BOSS
			 role.attactBoss();
			 if(role.getBoss().getHp()<=0){
				 break;
			 }else{
				 System.out.println("输入1回档,其它退出");
				 java.util.Scanner scanner=new java.util.Scanner(System.in);
				if(!"1".equals(scanner.nextLine())){
					break;
				}
				 role.recoverRole(rmManager.getRoleBox());//读档
			 }
			 
		}
		
		  
		 
		
		
		 
		 
	}

}

