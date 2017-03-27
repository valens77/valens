package com.valens.upload.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.net.TelnetInputStream;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;

import com.valens.base.utils.FormatDateUtils;
import com.valens.base.utils.OutFile;

/**
 * FTP 工具类
 * 
 * @author Administrator
 * 
 */
public class SunFtpUtils {
	private static Logger logger = LoggerFactory.getLogger(SunFtpUtils.class);
	private FtpClient ftpClient;
	private String userName = "";
	private String password = "";
	private String url = "";
	private String ftpDir = "";
	private int port = 21;

	public String getFtpDir() {
		return ftpDir;
	}

	public void setFtpDir(String ftpDir) {
		this.ftpDir = ftpDir;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public SunFtpUtils(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		connectFtpClient();
		try {
			ftpDir = this.ftpClient.pwd();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public SunFtpUtils(String url, String userName, String password, int port) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.port = port;
		connectFtpClient();
		try {
			ftpDir = this.ftpClient.pwd();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 进入FTP默认目录
	 */
	public void cdFtpDir() {
		try {
			logger.debug("进入:" + ftpDir);
			ftpClient.cd(ftpDir);
			logger.debug("当前目录:{}", ftpClient.pwd());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 连接FTP服务器
	 * 
	 * @param server
	 *            服务器地址
	 */
	public void connectFtpClient() {
		logger.info(" 连接FTP服务器");
		try {
			this.ftpClient = new FtpClient();// getPointPortFtpClient(this.port);
			// this.ftpClient.FTP_PORT=this.port;
			logger.info("  FTP 1");
			this.ftpClient.openServer(url, this.port);
			logger.info("  FTP 2");
			ftpClient.login(userName, password);
			logger.info("  FTP 3");
			setBinary();
			logger.info("  FTP 4");
		} catch (IOException e) {
			e.printStackTrace();
			logger.info(" 连接FTP服务器失败" + e.getMessage());
		} finally {
			logger.info("  FTP 5");
		}
	}

	private FtpClient getPointPortFtpClient(int port) {
		Class c = FtpClient.class;
		Object object = null;
		try {
			object = c.newInstance();
			Field[] filds = c.getDeclaredFields();
			for (Field filed : filds) {
				Class property = filed.getType();
				Class properyClass = filed.getDeclaringClass();
				if ("FTP_PORT".equals(filed.getName())) {
					// filed.s
					// filed.get
					filed.setAccessible(true);
					filed.set(object, port);
					// filed.setAccessible(flag);
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object == null ? null : (FtpClient) object;
	}

	/**
	 * FTP 下载文件
	 * 
	 * @param ftpurls
	 *            服务器文件路径()
	 * @param localurls
	 *            保存路径
	 * @param changedServerFileName
	 *            修改服务器文件名
	 */
	public String downLoadFile(String ftpurls, String localurls) {
		String savePath = "";
		try {
			boolean flag = false;
			String prefix = FormatDateUtils.formatDate(new Date(),
					"yyyyMMddHHmmssSSS_");// 读完FTP文件后进标识
			String ftpurl = ftpurls.substring(0, ftpurls.lastIndexOf("/") + 1);// 截取出ftp上的路径
			String filename = getFileName(ftpurls);// ftpurls.substring(ftpurls.lastIndexOf("/")
			// + 1);// 截取出文件名
			String localurl = localurls + "/" + prefix + filename;// 再拼凑出本地路径
			logger.debug("localurl=" + localurl);
			logger.debug("ftpurl=" + ftpurl);
			logger.debug("filename=" + filename);
			if (ftpurl.length() != 0) {
				logger.debug("当前目录:{}", ftpClient.pwd());
				logger.debug("准备进入:" + ftpurl);
				ftpClient.cd(ftpurl);
			}
			if (!this.isExistList("", filename, false)) {
				logger.warn("当前目录{}下文件不存在:{}", ftpClient.pwd(), filename);
				return savePath;
			}
			logger.debug("当前目录:{}", ftpClient.pwd());
			TelnetInputStream is = ftpClient.get(filename);// 读取FTP文件
			savePath = OutFile.outFile(localurl, is);// 写文件
			// if(changedServerFileName!=null&&!changedServerFileName.equals("")){
			// ftpClient.rename(filename, ftpurl + prefix + filename);// 改名或移动

			// }
			logger.info("文件下载完毕:{},存诸路径:{}",
					(ftpClient.pwd() + "/" + filename), savePath);
			flag = true;
		} catch (Exception ex) {
			logger.error("文件下载异常!{}", ex.getMessage(), ex);
			// JOptionPane.showMessageDialog(null, "很报谦！ftp连接失败,所需文件暂时不能下载！！");
		} finally {
			this.cdFtpDir();
		}
		return savePath;
	}

	public void moviFile(String pointFile, String savePath) {
		try {
			if (savePath == null || "".equals(savePath.trim())) {
				// ftpClient.
			} else {
				String prefix = FormatDateUtils.formatDate(new Date(),
						"yyyyMMddHHmmssSSS_");// 读完FTP文件后进标识
				String ftpurl = pointFile.substring(0, pointFile
						.lastIndexOf("/") + 1);// 截取出ftp上的路径
				String filename = getFileName(pointFile);// ftpurls.substring(ftpurls.lastIndexOf("/")
				// + 1);// 截取出文件名
				String localurl = savePath + "/" + prefix + filename;// 再拼凑出本地路径
				logger.debug("localurl=" + localurl);
				logger.debug("ftpurl=" + ftpurl);
				logger.debug("filename=" + filename);
				if (ftpurl.length() != 0) {
					logger.debug("当前目录:{}", ftpClient.pwd());
					logger.debug("准备进入:" + ftpurl);
					ftpClient.cd(ftpurl);
				}
				// ftpClient.rename(pointFile, savePath);// 改名或移动
				ftpClient.rename(filename, "/his" + ftpurl + prefix + filename);// 改名或移动
			}
		} catch (IOException ex) {
			logger.error("文件移动异常!存着相同文件!", ex);
		} finally {
			this.cdFtpDir();
		}
	}

	// 往ftp上上传文件
	/**
	 * 
	 */
	public void upFile(String ftpurls, String localurls) {
		try {
			logger
					.info(" upFile  ftpurls ={},localurls={}", ftpurls,
							localurls);
			// String ftpurl = ftpurls.substring(0, ftpurls.lastIndexOf("/") +
			// 1);// 截取出ftp上的路径
			String filename = getFileName(localurls);// localurls.substring(localurls.lastIndexOf("/")
			// + 1);// 截取出文件名
			// String localurl = localurls + "/" + filename;// 再拼凑出本地路径
			logger.info(" upFile  FTP  filename={}! ", filename);
			if (ftpurls.length() != 0) {
				ftpClient.cd(ftpurls);
			}
			// TelnetInputStream is = ftpClient.get(filename);
			logger.info(" upFile  FTP  put start! ");
			TelnetOutputStream os = ftpClient.put(filename);
			logger.info(" upFile  FTP  put start 2! ");
			OutFile.outFile(localurls, os);
			logger.info(" upFile  FTP  put end! ");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(" upFile exception={}", e.getMessage());
			// JOptionPane.showMessageDialog(null, "很报谦！ftp连接失败,所需文件暂时不能下载！！");
		} finally {
			logger.info(" upFile FTP over!");
			this.cdFtpDir();
		}
	}

	public static String getFileName(String filePath) {
		String fileName = "";
		if (filePath.lastIndexOf("/") > -1) {
			fileName = filePath.substring(filePath.lastIndexOf("/") + 1);// 截取出文件名
		} else {
			fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);// 截取出文件名
		}
		return fileName;
	}

	/**
	 * @param pointPath
	 *            指定位置 可空
	 * @param fileName
	 *            文件名称 可空
	 * @param isRetDefulatDir
	 *            是否返回默认目录
	 * 
	 * 返回当前目录的文件名称
	 */
	public ArrayList<String> getNameList(String pointPath, String fileName,
			boolean isRetDefulatDir) throws IOException {
		if (pointPath != null && !pointPath.equals("")) {
			ftpClient.cd(pointPath);
		}
		BufferedReader dr = new BufferedReader(new InputStreamReader(ftpClient
				.nameList(fileName)));
		ArrayList<String> al = new ArrayList<String>();
		String s = "";
		while ((s = dr.readLine()) != null) {
			al.add(s);
		}
		if (isRetDefulatDir) {
			this.cdFtpDir();
		}
		return al;
	}

	/**
	 * @param pointPath
	 *            指定位置 可空
	 * 
	 * 返回当前目录的文件名称
	 */
	public boolean isExistList(String pointPath, String fileName,
			boolean isRetDefulatDir) throws IOException {
		return this.getNameList(pointPath, fileName, isRetDefulatDir).size() > 0;
	}

	/**
	 * 删文件
	 */
	public void deleteFileFromFtp(FtpClient ftpClient, String delFileName,
			String serverPath) throws Exception {
		ftpClient.cd(serverPath);
		ftpClient.sendServer("dele " + delFileName + "\r\n");
		this.cdFtpDir();
	}

	/**
	 * 断开FTP服务器
	 */
	public void closeFtpClient() {
		logger.info(" 断开FTP服务器");
		try {
			if (ftpClient.serverIsOpen()) {
				this.ftpClient.closeServer();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 设置FTP的传输格式设置为二进制格式
	 */
	public void setBinary() {
		try {
			this.ftpClient.binary();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public FtpClient getFtpClient() {
		return ftpClient;
	}

	public void setFtpClient(FtpClient ftpClient) {
		this.ftpClient = ftpClient;
	}

	public static void main(String[] str) throws IOException {
		/*
		 * String server = "172.16.20.24"; String username = "nsftp"; String
		 * password = "nsftp123";
		 * 
		 * FtpUtils ftp = new FtpUtils("172.16.20.17", "was", "was123");
		 * ftp.connectFtpClient(); logger.info("OK!");
		 * System.out.println(ftp.ftpClient.welcomeMsg);
		 * 
		 * FtpUtils ftp = new FtpUtils(server, username, password);
		 * ftp.setUrl(server); ftp.setUserName(username);
		 * ftp.setPassword(password); ftp.connectFtpClient(); // String
		 * ftpFilePath="/app/ftpdata/balacc"; String ftpFilePath = null; String
		 * ftpurls = "/app/ftpdata/balacc/proxool.xml";// 文件在ftp上的 位置 // String
		 * ftpurls="/app/ftpdata/balacc/";//文件在ftp上的 位置 String localurls =
		 * "d://balacc"; // 下载到本地的位置
		 * ftp.logger.info(ftp.getNameList(ftpFilePath, null, true).toString());
		 */
		// ftp.downLoadFile(server, username, password, ftpurls, localurls);
		org.apache.commons.net.ftp.FTPClient orgFtp = new org.apache.commons.net.ftp.FTPClient();
		String username = "";
		String password = "";
		String hostname = "";
		int port = 21;
		boolean flag = false;
		orgFtp.connect(hostname, port);
		orgFtp.login(username, password);
		orgFtp.setControlEncoding("UTF-8");
		if (org.apache.commons.net.ftp.FTPReply.isPositiveCompletion(orgFtp
				.getReplyCode())) {
			if (orgFtp.login(username, password)) {
				flag = true;
			}
		}
	}
}
