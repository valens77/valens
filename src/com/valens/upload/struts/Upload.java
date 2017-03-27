package com.valens.upload.struts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 * STRUTS文件上传工具
 * 
 * @author Administrator
 * 
 */
public class Upload {
	private static Logger logger = Logger.getLogger(Upload.class.getName());

	/**
	 * 功能：导入文件上传，返回服务器文件路径清单
	 * 
	 * @param form
	 *            strus FORM
	 * @param seqNumber 构造文件名流水数
	 * @return ArrayList<String>
	 * @throws IOException
	 * @throws ImportExcelException
	 */
	public static ArrayList<String> uploadFile(ActionForm form, String seqNumber)
			throws IOException {
		Map formFiles = form.getMultipartRequestHandler().getFileElements();// 获得表单中所有文件的信息
		ArrayList<String> pathList = new ArrayList<String>();// new
		// ExtendedArrayList(String.class);
		try {
			String filePath;
			String uploadFileDir = "";// ConfigLoader.loadUploadConfig().getSavePath();
			// //配置文件中的文件上传目录
			String subDir = "tmp"; // 文件上传目录下的子目录，文件的实际存储位置
			// 判断目录是否存在，如果不存在则创建该目录
			File fileDir = new File(uploadFileDir + File.separator + subDir);
			if (!fileDir.exists()) {
				// mkdirs 可以创建多级目录
				fileDir.mkdirs();
			}
			// 如果有文件列表不为空，逐一保存文件。
			if (formFiles != null) {
				Iterator fileIt = formFiles.values().iterator();
				while (fileIt.hasNext()) {
					// 取文件
					FormFile forms = (FormFile) fileIt.next();
					if (forms.getFileSize() == 0)
						continue;
					// 取扩展名
					String oldName = forms.getFileName();
					String extName = getExtName(oldName);
					// 取日期
					String sta_date = String.format("yyyyMMdd", new Date());
					String year_month = sta_date.substring(0, 6);
					// 构造文件路径
					filePath = uploadFileDir + File.separator + subDir
							+ File.separator + year_month + seqNumber + extName;
					byte[] buf = forms.getFileData();

					OutputStream out = new FileOutputStream(new File(filePath));
					out.write(buf);
					out.close();
					// 放入文件列表
					pathList.add(filePath);
				}
			}
		} catch (IOException e) {
			logger.warning(e.getMessage());
			throw e;
		} finally {
		}
		return pathList;
	}

	/**
	 * 获得文件名称
	 * 
	 * @param fullName
	 * @return String
	 */
	private static String getExtName(String fullName) {
		String extName = "";
		int index = fullName.lastIndexOf(".");
		if (index > -1) {
			extName = fullName.substring(index, fullName.length());
		}
		return extName;
	}
}
