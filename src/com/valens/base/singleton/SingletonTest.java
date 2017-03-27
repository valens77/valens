package com.valens.base.singleton;


public class SingletonTest {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Thread t=new Thread(new Runnable(){
				@Override
				public void run() {
					try {
						//Singleton.getInstance();//饿汉
						//Singleton.getSingleton();
						//Singleton.getSingletonSynchronized();
						Singleton.getSingletonDoubleChecked();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			});
			 t.start();
		}
	}
}
/**
 * 懒汉式 非安全
 * @author huang_xiaohua
 *
 */
class Singleton{
	private static Singleton singleton=null;//懒汉
	private static int singletonInt=0;
	//private volatile static Singleton instance; //声明成 volatile
	private Singleton(){
		System.out.println("the Singleton init !");
	}
	
	/**
	 * //Single Checked  unsynchronized
	 * @return
	 * @throws InterruptedException 
	 */
	public static Singleton getSingleton() throws InterruptedException{
		String str="Single Checked 加载";
		if(singleton==null){
			Thread.currentThread().sleep(1000l);
			singleton=new Singleton();
			System.out.println(str+"the getSingleton "+singletonInt+++" times init!");
		}
		return singleton;
	}
	/**Single Checked  synchronized
	 * @return
	 * @throws InterruptedException 
	 */
	public static synchronized Singleton getSingletonSynchronized() throws InterruptedException{
		String str="synchronized  getSingleton 加载:";
		if(singleton==null){
			Thread.currentThread().sleep(1000l);
			singleton=new Singleton();
			System.out.println(str+"the getSingleton "+singletonInt+++" times init!");
		}
		return singleton;
	}
	
	/**
	 * //Double Checked synchronized
	 * @return
	 */
	private static int singletonD=0;
	@SuppressWarnings("static-access")
	public static Singleton getSingletonDoubleChecked() throws InterruptedException{
		String str="Double Checked 加载";
		if(singleton==null){//1
			Thread.currentThread().sleep(1000l);
			synchronized (Singleton.class) {
				if(singleton==null){//2
					Thread.currentThread().sleep(1000l);
					//需将singleton 加 volatile  修饰
					singleton=new Singleton();
					System.out.println(str+"the getSingletonD "+singletonD+++" times init!");
				}
			}
		}
		return singleton;
	}
	/**
	 * 饿汉
	 */
	private final static Singleton singletonB;
	static{
		//singletonB=new Singleton();//饿汉
		singletonB=null;
	}
	public static Singleton getInstance(){
		System.out.println("饿汉 加载");
        return singletonB;
    }
	/**
	 * 静态内部类方式:懒加载
	 * @author huang_xiaohua
	 *
	 */
	private static class SingletonHolder{
		private final static Singleton  instance=new Singleton();
	}
	public static Singleton getSingletonC(){
		System.out.println("懒加载 getSingletonC");
		return SingletonHolder.instance;
	}
	/**
	 * @param args
	 */
	public static void main1111(String[] args) {
		for(int i=0;i<100;i++){
			Thread t=new Thread(new Runnable(){
				@Override
				public void run() {
					try {
						//Singleton.getInstance();//饿汉
						Singleton.getSingleton();
						//Singleton.getSingletonSynchronized();
						//Singleton.getSingletonDoubleChecked();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			});
			 t.start();
		}
	}
}
/**
 * 枚举 式:防止反序列化导致重新创建新的对象
 */
enum SingletonEnum{
	instance;
	private SingletonEnum(){
		
	}
	public String toString(){
		return this.name();
	}
	
}