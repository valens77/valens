package com.valens.base.utils.db;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;


public class PROUtil {  
	
	// 获取上下文
    static String path2="conf/dao-db-config.xml";
	public static void main(String[] args) {
		try {File file=new File(path2);
		System.out.println(file.getAbsolutePath());
			printAll();
		} catch (Exception e) {
			System.out.println("请仔细输入，类名，数据库表，字段名");
		}
	}
	public static void printAll() throws  Exception{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请选择功能：1.生成存储过程插入模板 2.生成取出模板 3.实体类set方法 4.根据数据库表生成实体类 5.生成Update模板,7.生成mapper, 6.退出");
			String input = sc.nextLine();
			if("1".equals(input)) {
				System.out.println("请输入完整类名 如：java.lang.String");
				String clsName = sc.nextLine().replace("\n", "").trim();
				System.out.println("请输入该实体类关联的数据库表名");
				String tableName = sc.nextLine().replace("\n", "").trim().toUpperCase();
				PROUtil.printProByClass(Class.forName(clsName).newInstance(), tableName);
				continue;
			} else if("2".equals(input)) {
				System.out.println("请输入完整类名 如：java.lang.String");
				String clsName = sc.nextLine().replace("\n", "").trim();
				PROUtil.printGetPro(Class.forName(clsName).newInstance());
				continue;
			} else if("3".equals(input)) {
				System.out.println("请输入完整类名 如：java.lang.String");
				String clsName = sc.nextLine().replace("\n", "").trim();
				PROUtil.printSetMethod(Class.forName(clsName).newInstance());
				continue;
			} else if("4".equals(input)){
				System.out.println("请输入数据库表名");
				String tableName = sc.nextLine().replace("\n", "").trim();
				PROUtil.getModel(tableName);
				continue;
			} else if("5".equals(input)){
				System.out.println("请输入完整类名 如：java.lang.String");
				String clsName = sc.nextLine().replace("\n", "").trim();
				PROUtil.printUpdatePro((Class.forName(clsName).newInstance()));
				continue;
			}
			else if("7".equals(input)){
			    System.out.println("请输入完整类名 如：java.lang.String");
                String clsName = sc.nextLine().replace("\n", "").trim();
                PROUtil.printSetMethodForMapper(Class.forName(clsName).newInstance());
                continue;
			}
			else if("6".equals(input)) {
				break;
			} else {
				System.out.println("输入错误，请重新输入");
				continue;
			}
		}
	}
	
	

			
	static ApplicationContext context = DBHelper
			.getApplicationContext(path2);
	// 获取bean
	static DataSource ds = (DataSource) context.getBean("dataSource");
	/**
	 * 根据一个类，生成存储过程参数及变量代码！
	 * @param obj
	 * @throws Exception 
	 */
	public static void printProByClass(Object obj,String tableName) throws Exception {
		System.out.println("CREATE OR REPLACE PROCEDURE SP_接口名称_功能名称(");
		printParamterAndType(obj);
		System.out.println();
		System.out.println(") AS");
		System.out.println(" /* 过程、函数简要描述信息");
		System.out.println("**********************************************************");
		System.out.println("*  输入参数:");
		printParamter(obj);
		System.out.println();
		System.out.println("**********************************************************");
		//printVarAndType(obj);
		getProcParam(tableName);
		System.out.println();
		System.out.println("**********SELECT 语句************");
		System.out.println();
		printSelect(obj);
		System.out.println();
		System.out.println();
		System.out.println("**********INSERT 语句************");
		System.out.println();
		printInsert(obj,tableName);
	}
	/**
	 * 通过表名生成存储过程参数
	 * @param tabName
	 * @throws Exception
	 */
	public static void getProcParam(String tabName) throws Exception {
		// 初始化需要数据
        Connection conn = ds.getConnection();
        conn.setAutoCommit(true);
        PreparedStatement ps;
        String sql="select a.column_name,data_type,data_length,c.comments from all_tab_columns a, user_col_comments c where a.table_name='"+tabName+"'and a.TABLE_NAME=c.table_name  and a.COLUMN_NAME=c.column_name";
        ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        String ss="";
        while (rs.next()) {
			String column_name=rs.getString(1);
			String data_type =rs.getString(2);
			int data_length =rs.getInt(3);
			if(data_type.indexOf("CHAR")>-1){
				data_type += "("+data_length+")";
			}
			String comments=rs.getString(4);
			if (comments != null &&comments.contains("\n") ) {
				comments = comments.replace("\n", "   ");
			}
			ss=("V_"+column_name.toUpperCase()+ "  "+tabName+"."+column_name.toUpperCase()+"%type := "+column_name.toLowerCase() +";\t\t --"+comments+"\n") +ss;
//			ss=("private "+data_type + "  "+column_name.toLowerCase()+";\t\t//"+comments+"\n") +ss;
        }
        System.out.print(ss);
	}
	/**
	 * 打印对象map.put("ACTIONCODE", event.getActionCode());
	 * @param obj
	 * @param className 对象的命名
	 */

	public static void printHashMap(Object obj,String className) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String fn = fields[i].getName();
			System.out.print("map.put(\"" +  fn.toUpperCase() + "\", ");
			System.out.print(className+".get");
			System.out.print(Character.toUpperCase(fn.charAt(0)));
			System.out.print(fn.substring(1));
			System.out.println("());");
		}
	}
	/**
	 * 打印对象的所有set方法(主要用于测试)
	 * @param obj 
	 * @param className 对的的命名
	 */
	public static void printSetMethod(Object obj){
		String clsName= obj.toString().substring(obj.toString().lastIndexOf(".")+1,obj.toString().lastIndexOf("@"));
		String className = clsName.substring(0, 1).toLowerCase()+clsName.substring(1);
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String fn = fields[i].getName();
			System.out.print(className+".set");
			System.out.print(Character.toUpperCase(fn.charAt(0)));
			System.out.print(fn.substring(1));
			String type = fields[i].getType().toString();
			String type2 = "";
			try {
				type2 = type.substring(type.lastIndexOf("."));
			} catch (StringIndexOutOfBoundsException e) {
				type2 = type;
			}
			if(type2.equals(".String")) {
				System.out.println("(\"t_"+fn+"\");");
			} else if(type2.equals(".Date")) {
				System.out.println("(new Date());");
			} else if(type2.equals("long")) {
				System.out.println("(123);");
			} else if(type2.equals("int")) {
				System.out.println("(123);");
			} else if(type2.equals("double")) {
				System.out.println("(123);");
			} else if(type2.equals("float")) {
				System.out.println("(123);");
			} else {
				System.out.println("(type没识别);");
			}
		}
		System.out.println("提示：有些数据可能过长，执行插入操作可能会出现。数据过长或者精度太高");
	}
	
	   /**
     * 打印对象的所有set方法(主要用于测试)
     * @param obj 
     * @param className 对的的命名
     */
    public static void printSetMethodForMapper(Object obj){
        String clsName= obj.toString().substring(obj.toString().lastIndexOf(".")+1,obj.toString().lastIndexOf("@"));
        String className = clsName.substring(0, 1).toLowerCase()+clsName.substring(1);
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String fn = fields[i].getName();
            System.out.print(className+".set");
            System.out.print(Character.toUpperCase(fn.charAt(0)));
            System.out.print(fn.substring(1));
            
            
            
            
            String type = fields[i].getType().toString();
            String type2 = "";
            try {
                type2 = type.substring(type.lastIndexOf("."));
            } catch (StringIndexOutOfBoundsException e) {
                type2 = type;
            }
            
            
            System.out.print("("  + "resultset.get");
            
            if(type2.equals(".String")) {
                System.out.println("String(\""+fn+"\"));");
            } else if(type2.equals(".Date")) {
                System.out.println("Date(\""+fn+"\"));");
            } else if(type2.equals("long")) {
                System.out.println("Long(\""+fn+"\"));");
            } else if(type2.equals("int")) {
                System.out.println("Int(\""+fn+"\"));");
            } else if(type2.equals("double")) {
                System.out.println("Double(\""+fn+"\"));");
            } else if(type2.equals("float")) {
                System.out.println("Float(\""+fn+"\"));");
            } else {
                System.out.println("(type没识别);");
            }
        }
        System.out.println("提示：有些数据可能过长，执行插入操作可能会出现。数据过长或者精度太高");
    }
	/**
	 * 生成参数及类型（有些类型不完善，请检查）
	 * @param class
	 */
	public static void printParamterAndType(Object obj) {
		//该类所有变量
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(i%2 ==0 && i !=0) {
				System.out.println();
			}
			if(i%2 == 0) {
				System.out.print("\t");
			}
			String fn = fields[i].getName();
			String type = fields[i].getType().toString();
			System.out.print(fn); 
			printVarType(type);
			System.out.print(", ");
			
		}
	}
	/**
	 * 只生成参数
	 * @param class
	 */
	public static void printParamter(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(i%3 ==0 && i !=0) {
				System.out.println();
			}
			if(i%3 ==0 ) {
				System.out.print("\t");
			}
			String fn = fields[i].getName();
			String type = fields[i].getType().toString();
			System.out.print(fn+", "); 
		}
	}
	/**
	 * 用于存储过程中的定义变量
	 * @param obj
	 */
	public static void printVarAndType(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String fn = fields[i].getName();
			System.out.println("\t"+"V_"+fn);
			//String type = fields[i].getType().toString();
			//printVarType(type);
			//System.out.println(" := "+ fn+";");
		}
		System.out.println("---------------------");
		for (int i = 0; i < fields.length; i++) {
			String fn = fields[i].getName();
			//System.out.print("\t"+"V_"+fn);
			//String type = fields[i].getType().toString();
			//printVarType(type);
			System.out.println(" := "+ fn+";");
		}
	}
	/**
	 * 打印该变量的数据类型
	 */
	private static void printVarType(String type) {

		//XSystem.out.print(type);
		String type2 = "";
		try {
			type2 = type.substring(type.lastIndexOf("."));
		} catch (StringIndexOutOfBoundsException e) {
			type2 = type;
		}
		if(type2.equals(".String")) {
			System.out.print(" VARCHAR2");
		} else if(type2.equals(".Date")) {
			System.out.print(" TIMESTAMP");
		} else if(type2.equals("long")) {
			System.out.print(" INT");
		} else if(type2.equals("int")) {
			System.out.print(" INT");
		} else if(type2.equals("double")) {
			System.out.print(" DOUBLE");
		} else if(type2.equals("float")) {
			System.out.print(" FLOAT;");
		} else {
			System.out.print("**type***");
		}
	}
	/**
	 * 打印数据库表的列名
	 */
	public static void printTableColum(String tableName) throws Exception{
		String DRIVER 
		= "oracle.jdbc.driver.OracleDriver";
		String url
		= "jdbc:oracle:thin:@172.16.164.81:1521:npos ";
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(url, "npos", "123456");
		DatabaseMetaData data = conn.getMetaData();
		ResultSet rs = data.getColumns(null, null, tableName, null);
		System.out.println(tableName);
		int i =1;
		while(rs.next()){
			if(i%5 ==0) {
				System.out.println();
			}
			i++;
			System.out.print(rs.getString("COLUMN_NAME")+",");
		}
	}
	/**
	 * select 语句
	 */
	public static void printSelect(Object obj) {
		System.out.print("select ");
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(i%4 ==0 && i !=0) {
				System.out.println();
			}
			String fn = fields[i].getName();
			System.out.print(fn.toUpperCase());
			System.out.print(" into "+"out_"+fn+", ");			
		}
	}
	public static void printInsert(Object obj,String tableName) {
		System.out.println("INSERT INTO "+tableName+"( ");
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if(i == 0) {
				System.out.print("\t");
			}
			if(i%4 ==0 && i !=0) {
				System.out.println();
				System.out.print("\t");
			}
			String fn = fields[i].getName();
			System.out.print(fn.toUpperCase());
			if(i != fields.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println(")");
		System.out.println("VALUES(");
		for (int i = 0; i < fields.length; i++) {
			if(i == 0) {
				System.out.print("\t");
			}
			if(i%4 ==0 && i !=0) {
				System.out.println();
				System.out.print("\t");
			}
			String fn = fields[i].getName();
			System.out.print("V_"+fn.toUpperCase());
			if(i != fields.length-1) {
				System.out.print(", ");
			} 
		}
		System.out.println();
		System.out.println(");");
	}
//	/**
//	 * 只打印定义变量(一般用于insert语句values)
//	 */
//	public static void printVar(Object obj) {
//		Field[] fields = obj.getClass().getDeclaredFields();
//		for (int i = 0; i < fields.length; i++) {
//			if(i%5 == 0) {
//				System.out.println();
//			}
//			String fn = fields[i].getName();
//			System.out.print("V_"+fn.toUpperCase()+", ");
//		}
//	}
	public static void printGetPro(Object obj) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("要想生成存储过程，我得先了解了解你的情况O(∩_∩)O哈！");
		System.out.println("亲，请输入存储过程名称");
		String proName= sc.nextLine();
		System.out.println("你要从哪个数据库表读取数据？");
		String tableName = sc.nextLine();
		System.out.println("亲，您要用哪个属性作为where条件查询呢？如果是多个请用逗号分隔(注意是英文逗号)");
		String whereBy = sc.nextLine().toUpperCase();
		System.out.println("请输入，该存储过程的功能描述。");
		String desc = sc.nextLine();
		System.out.println("CREATE OR REPLACE PROCEDURE "+proName+"(");
		//生成参数以及类型
		printOneVarAndType(obj,whereBy,tableName);
		printDesc(desc,whereBy);
		//打印初始化参数
		printV_var(whereBy,tableName);
		printBegin(proName,whereBy);
		printSelect(tableName,whereBy);
		printEnd();
		System.out.println("**************Java代码*************");
		printJava(obj,proName,whereBy);
	}
	
	public static void printUpdatePro(Object obj) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("要想生成存储过程，我得先了解了解你的情况O(∩_∩)O哈！");
		System.out.println("亲，请输入存储过程名称");
		String proName= sc.nextLine();
		System.out.println("你要在哪个数据库表修改数据？");
		String tableName = sc.nextLine();
		System.out.println("亲，您要用哪个属性作为where条件查询呢？如果是多个请用逗号分隔(注意是英文逗号)");
		String whereBy = sc.nextLine().toUpperCase();
		System.out.println("亲，您要修改哪些字段呢？如果是多个请用逗号分隔(注意是英文逗号)");
		String updateSet = sc.nextLine().toUpperCase();
		System.out.println("请输入，该存储过程的功能描述。");
		String desc = sc.nextLine();
		System.out.println("CREATE OR REPLACE PROCEDURE "+proName+"(");
		//生成参数以及类型
		printOneVarAndType(obj,whereBy+","+updateSet,tableName);
		printDesc(desc,whereBy+","+updateSet);
		//打印初始化参数
		printV_var(whereBy+","+updateSet,tableName);
		printBegin(proName,whereBy+","+updateSet);
		printUpdate(tableName,whereBy,updateSet);
		printEnd();
		System.out.println("**************Java代码*************");
		printJava(obj,proName,whereBy+","+updateSet);
	}
	
	private static void printUpdate(String tableName, String whereBy,String updateSet) {
		System.out.println();
		System.out.println("--修改" +"\r"+
				"UPDATE "+tableName +"\r"+
				" SET " +printUpdateSetVar(updateSet)+" \r"+
				" WHERE "+printWhereByVar(whereBy)+";");
	}
	private static String printWhereByVar(String whereBy) {
		List<String> whereBys = java.util.Arrays.asList(whereBy.split(","));
		String str = "";
		for (String s : whereBys) {
			str +=s+" = V_"+s;
			if(s != whereBys.get(whereBys.size()-1)) {
				str = str+" and ";
			}
		}
		return str;
	}
	private static String printUpdateSetVar(String updateSet) {
		List<String> whereBys = java.util.Arrays.asList(updateSet.split(","));
		String str = "";
		for (String s : whereBys) {
			str +=s+s+" = V_"+s;
			if(s != whereBys.get(whereBys.size()-1)) {
				str = str+", ";
			}
		}
		return str;
	}
	public static void printJava(Object obj, String proName,String whereBy) {
		String clsName= obj.toString().substring(obj.toString().lastIndexOf(".")+1,obj.toString().lastIndexOf("@"));
		String objName = clsName.substring(0, 1).toLowerCase()+clsName.substring(1);
		List<String> whereBys = java.util.Arrays.asList(whereBy.split(","));
		System.out.println(
			"SimpleJdbcCallOperations simpleJdbcCall = getSimpleJdbcCall();" +"\r"+
			"logger.debug(\"update"+clsName+" Start the "+whereBy+" is :\" );" +"\r"+
			"simpleJdbcCall.withProcedureName(\""+proName+"\");" +"\r"+
			"Map<String,Object> map=new HashMap<String, Object>();"
		);	
		for (String s : whereBys) {
			System.out.println("map.put(\""+s.toUpperCase()+"\", "+s.toLowerCase()+");");
		}
		System.out.println(
			"SqlParameterSource in=new MapSqlParameterSource().addValues(map);" +"\r"+
			"Map<String, Object> out = simpleJdbcCall.execute(in);" +"\r"
		);
		
	}
	private static void printEnd() {
		System.out.println(
				"  PLOG.INFO(V_PRO_NAME, '查询完成!');"+"\r"+
				"  V_ERR_MSG := V_PRO_NAME || '数据处理失败 ';"+"\r"+
				"  PLOG.INFO(V_PRO_NAME, '过程结束,结束日期: ' || V_PAR_DATE);"+"\r"+
				"  /*数据异常记录信息后回滚*/"+"\r"+
				"EXCEPTION"+"\r"+
				"  WHEN OTHERS THEN"+"\r"+
				"    ROLLBACK;"+"\r"+
				"    V_ERR_CODE := SQLCODE;"+"\r"+
				"    PLOG.ERROR(V_PRO_NAME, V_ERR_CODE, V_ERR_MSG || '  ' || SQLERRM);"+"\r"+
				""+"\r"+
				"END"		
		);
	}
	public static void printV_var(String whereBy,String tableName) throws Exception {
		List<String> whereBys = java.util.Arrays.asList(whereBy.split(","));
		Connection conn = ds.getConnection();
        conn.setAutoCommit(true);
        PreparedStatement ps;
        String sql="select a.column_name,data_type,data_length,c.comments from all_tab_columns a, user_col_comments c where a.table_name='"+tableName+"'and a.TABLE_NAME=c.table_name  and a.COLUMN_NAME=c.column_name";
        ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
       while(rs.next()) {
    	   String column_name=rs.getString(1);
    	   String data_type =rs.getString(2);
    	   String comments = rs.getString(4);
    	   int data_length =rs.getInt(3);
    	   if(data_type.indexOf("CHAR")>-1){
				data_type += "("+data_length+")";
    	   }
    	   if(whereBys.contains(column_name)){
    		   System.out.print(" V_"+column_name+"   "+ data_type);
        	   System.out.print(" := "+column_name+";");
        	   System.out.println("   --"+comments);
    	   }
    	   
       }
	}
	private static void printOneVarAndType(Object obj, String whereBy, String tableName ) throws Exception {
		List<String> whereBys = java.util.Arrays.asList(whereBy.split(","));
		Connection conn = ds.getConnection();
        conn.setAutoCommit(true);
        PreparedStatement ps;
        String sql="select a.column_name,data_type,data_length," +
        		"c.comments from all_tab_columns a, user_col_comments " +
        		"c where a.table_name='"+tableName+"'and a.TABLE_NAME=c.table_name  " +
				"and a.COLUMN_NAME=c.column_name";
        ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()) {
    	   String column_name=rs.getString(1);
    	   String data_type =rs.getString(2);
    	   if(whereBys.contains(column_name)){
    		   System.out.println("\t"+column_name+"   "+ data_type+",	");
    	   }
        }
        System.out.println("\t"+"ref_cursor   OUT sys_refcursor");
	}
	private static void printSelect(String tableName, String whereBy) {
		System.out.println();
		System.out.println(" -- 查询" +"\r"+
				" OPEN ref_cursor FOR" +"\r"+
				"    SELECT *" +"\r"+
				"      FROM " +tableName +"\r"+
				"     WHERE "+printWhereByVar(whereBy)+";");
				//"     WHERE "+whereBy+" = V_"+whereBy+";");
	}
	private static void printBegin(String proName, String whereBy) {
		System.out.println(
				"BEGIN" +"\r"+
				"  V_ERR_MSG  := '数据初始化失败';" +"\r"+
				"  V_PRO_NAME := '"+proName+"';" +"\r"+
				"  V_PAR_DATE := TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MM:SS');" +"\r"+
				"  PLOG.INFO(V_PRO_NAME, '开始运行，日期: ' || V_PAR_DATE);" +"\r"+
				"  PLOG.INFO(V_PRO_NAME, '"+whereBy+" is : ' || V_"+whereBy+");");
	}
	private static void printDesc(String desc,String whereBy) {
		List<String> whereBys = java.util.Arrays.asList(whereBy.split(","));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(
			     ")  AS"+"\r"+
			     " /* 过程、函数简要描述信息"+"\r"+
			     " **********************************************************"+"\r"+
			     " *  存储过程名  :  "+desc+"\r"+
			     " *  建立日期      : "+sdf.format(new Date())+"\r"+
			     " *  模块          : 数据迁移--电渠平台二期"+"\r"+
			     " *  功能描述      : "+desc+"\r"+
			     " *  输入参数      ： "+Arrays.toString(whereBys.toArray())+"\r"+
			     " *  输出参数      ：ref_cursor"+"\r"+
			     " *   备注             :"+"\r"+
			     " *------------------------------------------------------------"+"\r"+
			     " *  修改历史"+"\r"+
			     " *  序号    日期             修改人      修改原因"+"\r"+
			     " *  1"+"\r"+
			     " ************************************************************ */"+"\r"+	
			     " V_PAR_DATE VARCHAR2(30); -- 操作日期"+"\r"+
			     " V_PRO_NAME VARCHAR2(40); -- 存储过程名"+"\r"+
			     " V_ERR_CODE VARCHAR2(50); -- 错误代码"+"\r"+
			     " V_ERR_MSG  VARCHAR2(3000); -- 错误信息"+"\r"			    
				);
	}
	/**
	 * 通过表名生成Model
	 * @param tabName
	 * @throws Exception
	 */
	public static void getModel(String tabName) throws Exception {
		// 初始化需要数据
        Connection conn = ds.getConnection();
        conn.setAutoCommit(true);
        PreparedStatement ps;
        String sql="select a.column_name,data_type,data_length,c.comments from all_tab_columns a, user_col_comments c where a.table_name='"+tabName+"'and a.TABLE_NAME=c.table_name  and a.COLUMN_NAME=c.column_name";
       System.out.println(sql);
        ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        String ss="";
        while (rs.next()) {
			String column_name=rs.getString(1);
			String data_type =rs.getString(2);
			//判断生成数据类型
			if(data_type.indexOf("CHAR")>-1){
				data_type="String";
			}else if(data_type.indexOf("TIMESTAMP")>-1 || data_type.equals("DATE")){
				data_type="Date";
			}else if(data_type.indexOf("INTEGER")>-1){
				data_type="int";
			}else if(data_type.indexOf("DECIMAL")>-1 || data_type.indexOf("NUMBER")>-1){
				data_type="double";
			}else{
				data_type="String";
			}
			int data_length =rs.getInt(3);
			String comments=rs.getString(4);
			ss=("private "+data_type + "  "+column_name.toLowerCase()+";\t\t//"+comments+"\n") +ss;
		}
        System.out.print(ss);
	}
}
