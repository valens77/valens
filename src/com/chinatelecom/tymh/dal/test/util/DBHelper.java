package com.chinatelecom.tymh.dal.test.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DBHelper {
    
    //获取上下文  context
    public static ApplicationContext getApplicationContext(String ... xmlPath){
        return new FileSystemXmlApplicationContext(xmlPath);
    }
    
    
}
