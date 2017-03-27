package com.valens.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * 日期格式工具
 * 
 * @author Administrator
 * 
 */
public class FormatDateUtils {
	/**
	 * 获取指定日期的前N天数,before小于0,在日期前,大于0在日期后
	 * @param date 日期
	 * @param before  
	 * @return Date
	 */
	public static Date getNextDay(Date date,int before) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, before);
		date = calendar.getTime();
		return date;
	}
	/**
	 * 指定格式,指定日期
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}
	/**
	 * 指定格式,指定日期
	 * @param date
	 * @param format
	 * @return
	 */
	public static Date formatStrToDate(String date, String format) {
		try {
			if(date==null||date.equals("")){
				return null;
			}
			return new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			System.out.println("日期转换异常!");
			System.out.println("日期转换异常!");
			System.out.println("日期转换异常!");
		}
		return null;
	}
	
	public static void main(String arg[]){
		Date d=FormatDateUtils.formatStrToDate("2012-02-09 000000", "yyyy-MM-ddHHmmss");
		System.out.println(d);
	}
	
	/**
	 * 获取某月的最后一天
	 * @param date
	 * @return
	 */
	public static int getLastDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, date.getYear());
		calendar.set(Calendar.MONTH, date.getMonth());
		int endday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return endday;
	}
}
