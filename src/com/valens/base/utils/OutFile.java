package com.valens.base.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 写文件
 * 
 * @author Administrator
 * 
 */
public class OutFile {
	private static Logger logger = LoggerFactory.getLogger(OutFile.class);
	/**
	 * 输出文件
	 * 
	 * @param savePath
	 *            文件完整路径
	 * @param is
	 * @throws IOException
	 */
	public static String  outFile(String savePath, InputStream is)
			throws IOException {
		String fileRealPath="";
		logger.debug("==write file start!target={}",savePath);
		int endIndex = savePath.lastIndexOf("/") >= 0 ? savePath
				.lastIndexOf("/") : savePath.lastIndexOf("\\");
		String dir = savePath.substring(0, endIndex);
		File conFile = new File(dir);
		if (!conFile.exists()) {
			logger.debug("==write file !create dir={}",dir);
			conFile.mkdirs();
		}
		File file_out = new File(savePath);
		fileRealPath=file_out.getAbsolutePath();
		logger.debug("==write file !really path={}",fileRealPath);
		FileOutputStream os = new FileOutputStream(file_out);
		byte[] bytes = new byte[1024];
		int c;
		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(is,"UTF-8")); String tempStr="";
		 * while((tempStr=br.readLine())!=null){
		 * System.out.println("====="+tempStr); }
		 */
		while ((c = is.read(bytes)) != -1) {
			os.write(bytes, 0, c);
		}
		is.close();
		os.close();
		return fileRealPath;
	}

	/**
	 * 输出文件
	 * 
	 * @param filePath
	 *            读取文件路径
	 * @param os
	 * @throws IOException
	 */
	public static void outFile(String filePath, OutputStream os)
			throws IOException {
		int endIndex = filePath.lastIndexOf("/") >= 0 ? filePath
				.lastIndexOf("/") : filePath.lastIndexOf("\\");
		String dir = filePath.substring(0, endIndex);
		File conFile = new File(dir);
		if (!conFile.exists()) {
			conFile.mkdirs();
		}
		File file_in = new File(filePath);
		FileInputStream is = new FileInputStream(file_in);
		byte[] bytes = new byte[1024];
		int c;
		while ((c = is.read(bytes)) != -1) {
			os.write(bytes, 0, c);
		}
		is.close();
		os.close();
	}
	
	
	public static void responsStr(){
		
	}
	
}
