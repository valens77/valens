package com.valens.base.utils;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * JAVA调用命令
 * 
 * @author xiaohua
 * 
 */
public class JavaCallCommand {
	private static Logger logger = Logger.getLogger(JavaCallCommand.class
			.getName());

	public void call(String commandpath) {
		/*
		 * String path = ReaderFileForWebUtils.readClass(commandpath)
		 * .getAbsolutePath(); logger.debug("Runtime.getRuntime().exec path=" +
		 * path);
		 */
		Process process;
		try {
			process = Runtime.getRuntime().exec(commandpath);
			process.waitFor();
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
