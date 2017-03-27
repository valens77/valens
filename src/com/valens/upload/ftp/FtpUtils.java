package com.valens.upload.ftp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.net.TelnetInputStream;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;

/**
 * FTP 工具类
 * 
 * @author Administrator
 * 
 */
public class FtpUtils {
	private static Logger logger = LoggerFactory.getLogger(FtpUtils.class);
	private FtpClient ftpClient;
	private String userName = "";
	private String password = "";
	private String url = "";
	private String ftpDir="";

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

	public FtpUtils(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		connectFtpClient();
		try {
			ftpDir=this.ftpClient.pwd();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 进入FTP默认目录
	 */
	public void cdFtpDir(){
		try {
			logger.debug("进入:" + ftpDir);
			ftpClient.cd(ftpDir);
			logger.debug("当前目录:{}" ,ftpClient.pwd());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 连接FTP服务器
	 *            服务器地址
	 */
	public void connectFtpClient() {
		logger.info(" 连接FTP服务器");
		try {
			this.ftpClient = new FtpClient();
			this.ftpClient.openServer(url);
			ftpClient.login(userName, password);
			setBinary();
		} catch (IOException e) {
			e.printStackTrace();
			logger.info(" 连接FTP服务器失败" + e.getMessage());
		}
	}

	/**
	 * FTP 下载文件
	 * @param ftpurls 服务器文件路径()
	 * @param localurls 保存路径
	 */
	public String downLoadFile(String ftpurls, String localurls) {
		String prefix=new SimpleDateFormat("yyyyMMddHHmmssSSS_").format(new Date());//读完FTP文件后进标识
		String ftpurl = ftpurls.substring(0, ftpurls.lastIndexOf("/") + 1);// 截取出ftp上的路径
		String filename = ftpurls.substring(ftpurls.lastIndexOf("/") + 1);// 截取出文件名
		String localurl = localurls + "/" +prefix+ filename;// 再拼凑出本地路径
		logger.debug("localurl=" + localurl);
		logger.debug("ftpurl=" + ftpurl);
		logger.debug("filename=" + filename);
		String savePath="";
		try {
			if (ftpurl.length() != 0) {
				logger.debug("当前目录:{}" ,ftpClient.pwd());
				logger.debug("准备进入:" + ftpurl);
				ftpClient.cd(ftpurl);
			}
			if (!this.isExistList("", filename,false)) {
				logger.warn("当前目录{}下文件不存在:{}" ,ftpClient.pwd(), filename);
				return savePath;
			}
			logger.debug("当前目录:{}" ,ftpClient.pwd());
			TelnetInputStream is = ftpClient.get(filename);// 读取FTP文件
			savePath=FtpUtils_OutFile.outFile(localurl, is);// 写文件
			//if(changedServerFileName!=null&&!changedServerFileName.equals("")){
				ftpClient.rename(filename, prefix+filename);//改名
			//}
			logger.info("文件下载完毕:{},存诸路径:{}",(ftpClient.pwd()+"/"+filename),savePath);
		} catch (Exception ex) {
			logger.error("文件下载异常!{}",ex.getMessage(),ex);
			// JOptionPane.showMessageDialog(null, "很报谦！ftp连接失败,所需文件暂时不能下载！！");
		}finally{
			this.cdFtpDir();
		}
		return savePath;
	}

	// 往ftp上上传文件
	/**
	 * 
	 */
	public void upFile(String ftpurls, String localurls) {
		String ftpurl = ftpurls.substring(0, ftpurls.lastIndexOf("/") + 1);// 截取出ftp上的路径
		String filename = ftpurls.substring(ftpurls.lastIndexOf("/") + 1);// 截取出文件名
		String localurl = localurls + "/" + filename;// 再拼凑出本地路径
		try {
			if (ftpurl.length() != 0) {
				ftpClient.cd(ftpurl);
			}
			TelnetOutputStream os = ftpClient.put(filename);
			FtpUtils_OutFile.outFile(localurl, os);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("文件上传异常!{}",ex.getMessage(),ex);
			//JOptionPane.showMessageDialog(null, "很报谦！ftp连接失败,所需文件暂时不能下载！！");
		}finally{
			this.cdFtpDir();
		}
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
	public ArrayList<String> getNameList(String pointPath, String fileName,boolean isRetDefulatDir)
			throws IOException {
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
		if(isRetDefulatDir){
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
	public boolean isExistList(String pointPath, String fileName,boolean isRetDefulatDir)
			throws IOException {
		return this.getNameList(pointPath, fileName,isRetDefulatDir).size() > 0;
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
		String server = "172.16.20.24";
		String username = "nsftp";
		String password = "nsftp123";
		/*
		 * FtpUtils ftp = new FtpUtils("172.16.20.17", "was", "was123");
		 * ftp.connectFtpClient(); logger.info("OK!");
		 * System.out.println(ftp.ftpClient.welcomeMsg);
		 */
		FtpUtils ftp = new FtpUtils(server, username, password);
		ftp.setUrl(server);
		ftp.setUserName(username);
		ftp.setPassword(password);
		ftp.connectFtpClient();
		// String ftpFilePath="/app/ftpdata/balacc";
		String ftpFilePath = null;
		//String ftpurls = "/app/ftpdata/balacc/proxool.xml";// 文件在ftp上的 位置
		// String ftpurls="/app/ftpdata/balacc/";//文件在ftp上的 位置
		//String localurls = "d://balacc"; // 下载到本地的位置
		ftp.logger.info(ftp.getNameList(ftpFilePath, null,true).toString());
		// ftp.downLoadFile(server, username, password, ftpurls, localurls);
	}
}
class FtpUtils_OutFile {
	private static Logger logger = LoggerFactory.getLogger(FtpUtils_OutFile.class);
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
}