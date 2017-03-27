package com.valens.upload.poi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	/**
	 * List all  xls files in specific path
	 * 
	 * @param folderPath
	 * @return
	 */
	public static List<File> listXlsFiles(String folderPath) {
		List<File> results = new ArrayList<File>();
		File parentF = new File(folderPath);
		File[] flist = parentF.listFiles();
		int len = flist.length;
		for (int i = 0; i < len; i++) {
			if (flist[i].isFile() && FileUtil.getExtension(flist[i]).equals("xls")){
				results.add(flist[i]);
			}
		}
		return results;
	}


	/**
	 * Return the extension portion of the file's name .
	 * 
	 * @see #getExtension
	 */
	public static String getExtension(File f) {
		return (f != null) ? getExtension(f.getName()) : "";
	}

	public static String getExtension(String filename) {
		return getExtension(filename, "");
	}

	public static String getExtension(String filename, String defExt) {
		if ((filename != null) && (filename.length() > 0)) {
			int i = filename.lastIndexOf('.');

			if ((i > -1) && (i < (filename.length() - 1))) {
				return filename.substring(i + 1);
			}
		}
		return defExt;
	}

	

}
