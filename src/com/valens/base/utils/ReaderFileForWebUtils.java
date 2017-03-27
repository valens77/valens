package com.valens.base.utils;

import java.io.File;
import java.net.URISyntaxException;
import java.util.logging.Logger;

/**
 * 读取文件
 * 
 * @author xiaohua
 * 
 */
public class ReaderFileForWebUtils {
	static Logger log = Logger.getLogger(ReaderFileForWebUtils.class.getName());

	/**
	 * 读取web-inf文件
	 * 
	 * @param path
	 * @return File
	 */
	private static File readWebInf(String path) {
		File file = null;
		try {
			file = readClass();
			log.info(file.getAbsolutePath());
			file = new File(file.getParentFile().getAbsoluteFile()
					+ getFilePath(path));
			log.info(file.getAbsolutePath());
		} catch (URISyntaxException e) {
			log.severe(path + "文件未找到");
		}
		return file;

	}

	/**
	 * 读取calss目录
	 * 
	 * @param path
	 * @return File
	 * @throws URISyntaxException
	 */
	public static File readClass() throws URISyntaxException {
		File file = null;
		try {
			file = new File(ReaderFileForWebUtils.class.getResource("/")
					.toURI());
			log.info(file.getAbsolutePath());
		} catch (URISyntaxException e) {
			log.severe(e.getMessage());
			throw e;
		}
		return file;

	}

	/**
	 * 读取calss下文件
	 * 
	 * @param path
	 * @return File
	 */
	public static File readClass(String path) {
		File file = null;
		try {
			file = readClass();
			file = new File(file.getAbsoluteFile() + "/" + path);
		} catch (URISyntaxException e) {
			log.severe(e.getMessage());
		}
		return file;

	}

	/**
	 * 读取web工程下文件
	 * 
	 * @param path
	 * @return File
	 */
	public static File readProWeb(String path) {
		File file = null;
		try {
			file = readClass();
			file = new File(file.getParentFile().getParentFile()
					.getParentFile().getAbsoluteFile()
					+ getFilePath(path));
			log.info(file.getAbsolutePath());
		} catch (URISyntaxException e) {
			log.severe(path + "文件未找到");
		}
		return file;

	}

	/**
	 * 读取web工程WebRoot下文件
	 * 
	 * @param path
	 * @return File
	 */
	public static File readProWebRoot(String path) {
		File file = null;
		try {
			file = readClass();
			file = new File(file.getParentFile().getParentFile()
					.getAbsoluteFile()
					+ getFilePath(path));
			log.info(file.getAbsolutePath());
		} catch (URISyntaxException e) {
			log.severe(path + "文件未找到");
		}
		return file;

	}

	private static String getFilePath(String path) {
		String filePath = "";
		if (path == null || "".equals(path.trim())) {
			;
		} else {
			filePath = "/" + path;
		}
		return filePath;
	}

	/**
	 * 创建文件目录
	 * 
	 * @param filePath
	 */
	public static void createFileDir(String filePath) {
		int endIndex = filePath.lastIndexOf("/") >= 0 ? filePath
				.lastIndexOf("/") : filePath.lastIndexOf("\\");
		String dir = filePath.substring(0, endIndex);
		File conFile = new File(dir);
		if (!conFile.exists()) {
			conFile.mkdirs();
		}
	}

	/**
	 * 读取web工程下bin文件
	 * 
	 * @param path
	 * @return File
	 */
	public static File readProBin(String path) {

		File file = null;
		try {
			file = readClass();
			file = new File(file.getParentFile().getParentFile()
					.getAbsoluteFile()
					+ "/bin" + getFilePath(path));
			log.info(file.getAbsolutePath());
		} catch (URISyntaxException e) {
			log.severe(path + "文件未找到");
		}
		return file;

	}

	public static void main(String[] s) {
		System.out.println(ReaderFileForWebUtils.readClass("1"));
		System.out.println(ReaderFileForWebUtils.readProBin("2"));
		System.out.println(ReaderFileForWebUtils.readProWeb("").getParentFile().getAbsolutePath()+"/shortMessage_log/");
		System.out.println(ReaderFileForWebUtils.readWebInf("4"));
		System.out.println(ReaderFileForWebUtils.readProWebRoot("5"));
	}
}
