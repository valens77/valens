package com.valens.base.utils;

/**
 * 
 * @Description ascii码转码工具
 * @author Huangxiaohua
 * @CreateDate 2017-3-27
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class CnToUnicodeUtils {
	/**
	 * @Description 将中文转成ascii码
	 * @param str
	 * @return  String
	 * @author Huangxiaohua
	 * @CreateDate 2017-3-27
	 */
	public static String toUnicod(String str) {
		// String str = "中国加油！";
		String result = "";
		if (str != null) {
			char[] c = str.toCharArray();
			for (char tmp : c) {
				result += "\\u" + Integer.toHexString(tmp);
			}
		}
		System.out.println(result);
		return result;
	}
	/**
	 * @Description TODO
	 * @param str
	 * @return  String
	 * @author Huangxiaohua
	 * @CreateDate 2017-3-27
	 */
	public static String toAscii(String s) {
		 String str = "";  
		 String tempString=null;
		   for (int i = 0; i < s.length(); i++) {  
		    int ch = (int) s.charAt(i);  
		    tempString="0000"+Integer.toHexString(ch);
		    tempString=tempString.substring(tempString.length()-4, tempString.length());  
		    str = str + "\\u"+tempString;  
		   }  
		   System.out.print(str);
		return str;
	}

	public static String tenTo16(int d) {
		
		return Integer.toHexString(d);
	}

	public static Object sixteenToten(String d) {
		return Integer.parseInt(d, 16);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CnToUnicodeUtils.toUnicod("[中国电信]");
		//CnToUnicodeUtils.toAscii("[中国电信]");
		System.out.println("\u005b\u4e2d\u56fd\u7535\u4fe1\u005d");
		//System.out.println(CnToUnicodeUtils.tenTo16(189));
		//System.out.println(CnToUnicodeUtils.sixteenToten("bd"));
		 /*Integer factor = Integer.valueOf("123");  
		    String s;  
		    s = String.format("%d", factor);  
		    System.out.println(s);  
		    s = String.format("%x", factor);  
		    System.out.println(s);  
		    s = String.format("%o", factor);  
		    System.out.println(s);*/
		   //System.out.println( CnToUnicodeUtils.toUnicod("1"));
		  // System.out.println( CnToUnicodeUtils.toUnicod("79825@01.jpg"));
		   
		   /*byte[] bb={0x05,0x00,0x03,0x10};
		   for(int i=0;i<bb.length;i++){   
			   System.out.println(Integer.toHexString(bb[i]));
			   System.out.println(Integer.toHexString(bb[i]));
		   }*/
	}
}
