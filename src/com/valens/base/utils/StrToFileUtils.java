package com.valens.base.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * 写文件
 * 
 * @author xiaohua
 * 
 */
public class StrToFileUtils {

	/**
	 * 写文件
	 * 
	 * @param path
	 *            文件路径
	 * @param strXml
	 *            字符串
	 */
	public static void fileWriteXML(String path, String strXml) {
		FileOutputStream outSTr = null;
		BufferedOutputStream Buff = null;
		File conFile = null;
		try {
			int endIndex = path.lastIndexOf("/") >= 0 ? path.lastIndexOf("/")
					: path.lastIndexOf("\\");

			String dir = path.substring(0, endIndex);
			conFile = new File(dir);
			if (!conFile.exists()) {
				conFile.mkdirs();
			}
			conFile = new File(path);
			outSTr = new FileOutputStream(conFile);
			Buff = new BufferedOutputStream(outSTr);
			Buff.write(strXml.getBytes("UTF-8"));
			Buff.flush();
			Buff.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Buff.close();
				outSTr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 写文件
	 * 
	 * @param path
	 * @param strXml
	 * @param isAdd
	 *            是否 追加在原文件后面
	 */
	public static void fileWrite(String path, String str, boolean isAdd) {
		FileOutputStream outSTr = null;
		BufferedOutputStream Buff = null;
		File conFile = null;
		try {
			String dir = "";
			if (path.lastIndexOf("\\") > -1) {
				dir = path.substring(0, path.lastIndexOf("\\"));
			} else {
				dir = path.substring(0, path.lastIndexOf("/"));
			}
			conFile = new File(dir);
			if (!conFile.exists()) {
				conFile.mkdirs();
			}
			conFile = new File(path);
			outSTr = new FileOutputStream(conFile, isAdd);
			Buff = new BufferedOutputStream(outSTr);
			Buff.write(str.getBytes("UTF-8"));
			Buff.write("\n".getBytes());
			Buff.flush();
			Buff.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Buff.close();
				outSTr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void  main(String[] s) {
		
		for(int i=0;i<10;i++){
			StrToFileUtils.fileWrite("D:/test/fileWrite.txt",""+i,true);
		}
	}
}