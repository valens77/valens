package com.valens.spring;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class BaseTest  {
 
	   //获取上下文  context
    public static ApplicationContext getApplicationContext(String ... xmlPath){
        return new FileSystemXmlApplicationContext(xmlPath);
    }
	public static ApplicationContext context =getApplicationContext(
			"WebRoot\\WEB-INF\\conf\\applicationContext_Job.xml" 
			);
	
	
	// 获取bean
	static DataSource ds = (DataSource) context.getBean("dataSource");
	static {
		try {
			ds.getConnection().setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
