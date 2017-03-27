package com.valens.base.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * 系统输入工具
 * 
 * @author valens
 * 
 */
public class SystemInUtils {
	private static Logger logger = Logger.getLogger(SystemInUtils.class
			.getName());

	public static String getSystemIn(String tipMsg) {
		logger.info(tipMsg);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String porjectPath = null;
		try {
			porjectPath = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return porjectPath;
	}

	public static void main(String[] s) {
		System.out.println(SystemInUtils.getSystemIn("请输入用户名:"));
	}
}
