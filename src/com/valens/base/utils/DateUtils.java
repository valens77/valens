package com.valens.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * 日期格式工具
 * 
 * @author Administrator
 * 
 */
public class DateUtils {
	private static Logger logger = Logger.getLogger(DateUtils.class.getName());

	/**
	 * 指定格式,指定日期
	 * 
	 * @param date
	 * @param format
	 * @return String
	 */
	public static String formatDate(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * 指定格式,指定日期
	 * 
	 * @param date
	 * @param format
	 * @return Date
	 */
	public static Date formatStrToDate(String date, String format) {
		try {
			if (date == null || date.equals("")) {
				return null;
			}
			return new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			logger.warning("日期转换异常!");
		}
		return null;
	}
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

	public static void main(String arg[]) {
	//	System.out.println(DateUtils.formatDate(DateUtils.getNextDay(new Date(),-61), "yyyy-MM-dd HH:mm:ss"));;
	}
}
