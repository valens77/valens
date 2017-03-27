package com.valens.base.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;
/**
 * JDK 1.6  下 WSDL2JAVA 
 * @author XIAOHUA
 *
 */
public class Wsdl2Java {
	private static Logger logger = Logger.getLogger(Wsdl2Java.class
			.getName());
	/**
	 * 
	 * @param wsdl
	 *            路径
	 * @param packageInfo
	 *            包名
	 * @param srcPath
	 *            源文件 路径
	 * @param isNoCompile
	 *            是否编译
	 */
	public static void windsOs(String wsdl, String packageInfo, String srcPath,
			boolean isNoCompile) {
		String path = "./wsdl2Java";
		String binPath = "./bin";

		StringBuffer cmdCommand = new StringBuffer("cmd.exe  /c  wsimport");

		if (srcPath != null && !"".equals(srcPath)) {// 源文件
			path = srcPath;
			System.out.println(srcPath.lastIndexOf("/"));
			int len=(srcPath.lastIndexOf("\\")==-1)?srcPath.lastIndexOf("/"):srcPath.lastIndexOf("\\");
			
			if(len>-1){
				binPath=srcPath.substring(0,len)+"/bin";
			}
		}
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		logger.info("path:"+file.getAbsolutePath());
		if (isNoCompile) {// 是否编译CLASS
			cmdCommand.append(" -Xnocompile ");
		} else {
			file = new File(binPath);
			if (!file.exists()) {
				file.mkdir();
			}
			cmdCommand.append(" -d " + binPath);
		}
		cmdCommand.append(" -keep   -s " + path + " ");
		if (packageInfo != null && !"".equals(packageInfo)) {// 包
			cmdCommand.append(" -p " + packageInfo);
		}
		cmdCommand.append(" " + wsdl);
		Process pid = null;
		try {
			System.out.println(cmdCommand.toString());
			pid = Runtime.getRuntime().exec(cmdCommand.toString());
			InputStream is = pid.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "GBK");
			BufferedReader br = new BufferedReader(isr);
			StringBuffer errorMsg = new StringBuffer();
			String msg = null;
			while ((msg = br.readLine()) != null) {
				errorMsg.append(msg);
				System.out.println(msg);
				logger.info(msg);
			}
			logger.info(errorMsg.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("error:"+e.getMessage());
		}
	}

	public static void main(String str[]) throws IOException {
		/*Wsdl2Java.windsOs(
						"http://127.0.0.1:8085/java6ws/J6Ws/doService?wsdl",
						"com.base.webservices.test", "", true);*/
		Wsdl2Java.windsOs(
				"http://10.7.3.79:9001/online/services/webMobelService?wsdl",
				"com.founder.clpcecif.webservices.yztzf.client", "", true);
	}
}
