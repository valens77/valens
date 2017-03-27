package com.valens.base.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtils {
	public void test(){
		String st = "20131209";
		String st2 = "20141209";
		System.out.println(st.substring(4,6));

		String str ="CRM_100000005_20140108.0020.201401";
		RegUtils t=new RegUtils();
		    String start = "20140101";
		String start_end = "20140108";
		//String regEx = "CRM_100000005_"
		String dateReg[]=t.getDateReg(start, start_end);
		String regEx = "^CRM_\\d{9}_"+dateReg[0]+dateReg[1]+dateReg[2]+".[0-9]{4}."+dateReg[0]+dateReg[1]+"$";
		System.out.println(regEx);
		// 同年regEx="CRM_100000005_20131208.0020.201312"
		Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(str);
		
		boolean rs = mat.find();
		System.out.println(str);
		System.out.println(rs);
		String str2="CRM_100000005_20131201.0020.201312";
		String startDate="20130101";
		String endDate="20141031";
		  dateReg=t.getDateReg(startDate, endDate);
		 
		
		String regEX2="^CRM_\\d{9}_"+dateReg[0]+dateReg[1]+dateReg[2]+".[0-9]{4}."+dateReg[0]+dateReg[1]+"$";
	 
		System.out.println("str2="+str2);
		System.out.println("reg2="+regEX2);
	 
		Pattern pat2 = Pattern.compile(regEX2, Pattern.CASE_INSENSITIVE);
		Matcher mat2 = pat2.matcher(str2);
		boolean rs2 = mat2.find();
 
		System.out.println("S2="+rs2);
		str2="CRM_100000005_201312011.0020.201312";
		String regEX3="_[0-9]{8}\\.";
		Pattern pat3 = Pattern.compile(regEX3, Pattern.CASE_INSENSITIVE);
		 Matcher mat3 =pat3.matcher(str2);
		 	mat3.find();
		 	System.out.println(mat3.find());
		System.out.println(mat3.group());
	}
	public static void main(String s[]) {
		String regEx="[a-z0-9A-Z_-]\\.css$";
		String str="1_211.css";
		System.out.println(regEx);
		// 同年regEx="CRM_100000005_20131208.0020.201312"
		Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(str);
		boolean rs = mat.find();
		System.out.println(rs);
	}
	public String[] getDateReg(String startDate,String endDate){
		
		String []dateReg=new String[3];
		if (startDate.substring(0, 4).equals(endDate.substring(0, 4))) {// 同年
			dateReg[0]=startDate.substring(0,4);
			;
			//dateReg="[0-9]{4}";
			if (startDate.substring(0, 6).equals(endDate.substring(0, 6))) {// 同月
				dateReg[1]=startDate.substring(4,6);
				dateReg[2]=getReg(startDate.charAt(6),endDate.charAt(6))+getReg(startDate.charAt(7),endDate.charAt(7));
			} else {
				dateReg[1]=getReg(startDate.charAt(4),endDate.charAt(4))+getReg(startDate.charAt(5),endDate.charAt(5));//月
				dateReg[2]="[0-3]{1}[0-9]{1}";//日
			}
		} else {
			if(endDate.contains(startDate.substring(0,3))){
				dateReg[0]=startDate.substring(0,3)+getReg(startDate.charAt(3),endDate.charAt(3));
			}else if(endDate.contains(startDate.substring(0,2))){
				dateReg[0]=startDate.substring(0,2)+getReg(startDate.charAt(2),endDate.charAt(2))+getReg(startDate.charAt(3),endDate.charAt(3));
			}else if(endDate.contains(startDate.substring(0,1))){
				dateReg[0]=startDate.substring(0,1)+
							getReg(startDate.charAt(1),endDate.charAt(1))+
							getReg(startDate.charAt(2),endDate.charAt(2))+
							getReg(startDate.charAt(3),endDate.charAt(3));
			}else{
				dateReg[0]="[0-9]{4}";
			}
			dateReg[1]="[0-1]{1}[0-9]{1}";
			dateReg[2]="[0-3]{1}[0-9]{1}";
		}
		
		return dateReg;
	}
	public String getReg(char start, char end) {
		try{
			if(Integer.parseInt(start+"")<Integer.parseInt(end+"")){
				return "[" + start + "-" + end + "]{1}";
			}else{
				return "[" + end + "-" + start + "]{1}";
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return "[" + start + "-" + end + "]{1}";
		}
	}
}
