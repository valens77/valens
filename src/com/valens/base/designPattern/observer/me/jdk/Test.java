package com.valens.base.designPattern.observer.me.jdk;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SimpleObservable doc = new SimpleObservable ();    
	 
	      SimpleObserver view = new SimpleObserver (doc);   //注册 
	      doc.setData(1);    
	      doc.setData(2);    
	      doc.setData(2);    
	      doc.setData(3); 
	      
	      
	      doc.deleteObserver(view);//销毁

	}

}
