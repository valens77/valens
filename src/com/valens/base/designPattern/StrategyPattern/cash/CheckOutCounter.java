/**
 * 
 */
package com.valens.base.designPattern.StrategyPattern.cash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-16
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class CheckOutCounter {
	Logger logger=LoggerFactory.getLogger("CheckOutCounter");
	private List<GoodItems> listItems=new ArrayList();
	private Map map=new HashMap();
	private List<Map> listResult=new ArrayList();
	private double totalMoney=0d;
	private int totalCount=0;
	private int totalTypeCount=0;
	private String orderId=createOrderId();
	
	public void checkOut(double money){
		map.put(listItems,orderId+":"+totalMoney );
		listResult.add(map);
	}
	public void checkOutNext(){
		totalMoney=0d;
		totalTypeCount=0;
		totalCount=0;
		listItems=new ArrayList();
		map=new HashMap();
		orderId=createOrderId();
	}
	public String createOrderId(){
		return "OD"+System.currentTimeMillis();
	}
	public void addItems(GoodItems item){ 
		if(item!=null&&item.getCount()>0){
			listItems.add(item);
			totalCount=+item.getCount();
			totalTypeCount++;
			totalMoney+=item.getCount()*item.getPrice();
		}
	}
	public void printItemsAll(){ 
		for(Map map:listResult){
			Iterator i=map.keySet().iterator();
			if(i.hasNext()){
			  Object key=	i.next();
			  Object value=map.get(key);
			  logger.info(value.toString());
			  List list=(List)key;
			  printItems(list);
			}
		}
	}
		public void printItems(){ 
		 
			totalCount=0;
			totalTypeCount=0;
			totalMoney=0;
			logger.info("   name    |   num     |     price    |   total |");
			for(GoodItems gi:listItems){
				totalTypeCount++;
				totalCount+=gi.getCount();
				totalMoney+=gi.getCount()*gi.getPrice();
				logger.info("   {}    |   {}     |     {}    |   {} |",gi.getName(),gi.getCount(),gi.getPrice(),gi.getCount()*gi.getPrice());
			}
			logger.info("   {}    |   {}/{}     |     {}    |   {} |","合计",totalCount,totalTypeCount,"",totalMoney );
		 
	}
		public void printItems(List<GoodItems> list){ 
			
			totalCount=0;
			totalTypeCount=0;
			totalMoney=0;
			logger.info("   name    |   num     |     price    |   total |");
			for(GoodItems gi:list){
				totalTypeCount++;
				totalCount+=gi.getCount();
				totalMoney+=gi.getCount()*gi.getPrice();
				logger.info("   {}    |   {}     |     {}    |   {} |",gi.getName(),gi.getCount(),gi.getPrice(),gi.getCount()*gi.getPrice());
			}
			logger.info("   {}    |   {}/{}     |     {}    |   {} |","合计",totalCount,totalTypeCount,"",totalMoney );
			
		}
	
	/**
	 * @return the listItems
	 */
	public List getListItems() {
		return listItems;
	}
	/**
	 * @param listItems the listItems to set
	 */
	public void setListItems(List listItems) {
		this.listItems = listItems;
	}
	/**
	 * @return the totalMoney
	 */
	public double getTotalMoney() {
		return totalMoney;
	}
	/**
	 * @param totalMoney the totalMoney to set
	 */
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
}

