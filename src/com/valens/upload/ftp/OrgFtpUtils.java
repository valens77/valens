package com.valens.upload.ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import com.valens.base.utils.FileUtils;

public class OrgFtpUtils {
	private static int Create_Directory_Fail = 0, // 远程服务器相应目录创建失败
			Create_Directory_Success = 1, // 远程服务器闯将目录成功
			Upload_New_File_Success = 2, // 上传新文件成功
			Upload_New_File_Failed = 3, // 上传新文件失败
			File_Exits = 4, // 文件已经存在
			Remote_Bigger_Local = 5, // 远程文件大于本地文件
			Upload_From_Break_Success = 6, // 断点续传成功
			Upload_From_Break_Failed = 7, // 断点续传失败
			Delete_Remote_Faild = 8, // 删除远程文件失败
			Remote_File_Noexist = 9, // 远程文件不存在
			Local_Bigger_Remote = 10, // 本地文件大于远程文件
			Download_From_Break_Success = 11, // 断点下载文件成功
			Download_From_Break_Failed = 12, // 断点下载文件失败
			Download_New_Success = 13, // 全新下载文件成功
			Download_New_Failed = 14; // 全新下载文件失败

	private static String chartEncode_UTF = "UTF-8";
	private static String chartEncode_ISO = "iso-8859-1";
	private static String chartEncode_GBK = "GBK";
	private static String chartEncode_Using = chartEncode_GBK;

	public OrgFtpUtils() {
		orgFtp = new org.apache.commons.net.ftp.FTPClient();
		// 设置将过程中使用到的命令输出到控制台
		
		this.orgFtp
				.addProtocolCommandListener(new org.apache.commons.net.PrintCommandListener(
						new java.io.PrintWriter(System.out)));
	}

	private org.apache.commons.net.ftp.FTPClient orgFtp =null;

	/**
	 * 链接FTP
	 * 
	 * @param hostname
	 * @param port
	 * @param username
	 * @param password
	 * @return
	 * @throws IOException
	 */
	public boolean connect(String hostname, int port, String username,
			String password) throws IOException {
		orgFtp.connect(hostname, port);
		orgFtp.setControlEncoding(chartEncode_Using);
		if (org.apache.commons.net.ftp.FTPReply.isPositiveCompletion(orgFtp
				.getReplyCode())) {
			if (orgFtp.login(username, password)) {
				return true;
			}
		}
		disconnect();
		return false;
	}

	/**
	 * 断开与远程服务器的连接
	 * 
	 * @throws IOException
	 */
	public void disconnect() throws IOException {
		if (orgFtp.isConnected()) {
			orgFtp.disconnect();
		}
	}

	/**
	 * 上传文件到FTP服务器，支持断点续传
	 * 
	 * @param local
	 *            本地文件名称，绝对路径
	 * @param remote
	 *            远程文件路径，使用/home/directory1/subdirectory/file.ext
	 *            按照Linux上的路径指定方式，支持多级目录嵌套，支持递归创建不存在的目录结构
	 * @return 上传结果
	 * @throws IOException
	 */
	public int upload(String local, String remote) throws IOException {
		// 设置PassiveMode传输
		//orgFtp.enterLocalPassiveMode();
		// 设置以二进制流的方式传输
		//orgFtp.setFileType(FTP.BINARY_FILE_TYPE);
		//orgFtp.setControlEncoding("GBK");
		int result = -1;
		// 对远程目录的处理
		String remoteFileName = remote;
		if (remote.contains("/")) {
			remoteFileName = remote.substring(remote.lastIndexOf("/") + 1);
			// 创建服务器远程目录结构，创建失败直接返回
			if (!CreateDirecroty(remote, orgFtp)) {
				// UploadStatus.Create_Directory_Fail;
				return Create_Directory_Fail;
			}
		}
		

		// 检查远程是否存在文件
		FTPFile[] files = orgFtp.listFiles(new String(remoteFileName
				.getBytes(chartEncode_Using), chartEncode_ISO));
		if (files.length == 1) {
			long remoteSize = files[0].getSize();
			File f = new File(local);
			long localSize = f.length();
			if (remoteSize == localSize) {
				// return UploadStatus.File_Exits;
				return File_Exits;
			} else if (remoteSize > localSize) {
				// 远程文件大于本地文件
				// return UploadStatus.Remote_Bigger_Local;
				return Remote_Bigger_Local;
			}
			if("".equals(remoteFileName)){
				remoteFileName=f.getName();
			}
			// 尝试移动文件内读取指针,实现断点续传
			result = uploadFile(remoteFileName, f, orgFtp, remoteSize);

			// 如果断点续传没有成功，则删除服务器上文件，重新上传
			// if(result == UploadStatus.Upload_From_Break_Failed){
			if (result == Upload_From_Break_Failed) {
				if (!orgFtp.deleteFile(remoteFileName)) {
					// return UploadStatus.Delete_Remote_Faild;
					result = Delete_Remote_Faild;
				}
				result = uploadFile(remoteFileName, f, orgFtp, 0);
			}
		} else {
			File localFile=new File(local);
			if("".equals(remoteFileName)){
				remoteFileName=localFile.getName();
			}
			result = uploadFile(remoteFileName, localFile, orgFtp, 0);
		}
		return result;
	}

	/**
	 * 递归创建远程服务器目录
	 * 
	 * @param remote
	 *            远程服务器文件绝对路径
	 * @param ftpClient
	 *            FTPClient对象
	 * @return 目录创建是否成功
	 * @throws IOException
	 */
	public boolean CreateDirecroty(String remote,
			org.apache.commons.net.ftp.FTPClient ftpClient) throws IOException {
		// UploadStatus status = UploadStatus.Create_Directory_Success;
		String directory = remote.substring(0, remote.lastIndexOf("/") + 1);
		if (!directory.equalsIgnoreCase("/")
				&& !ftpClient.changeWorkingDirectory(new String(directory
						.getBytes(chartEncode_Using), chartEncode_ISO))) {
			// 如果远程目录不存在，则递归创建远程服务器目录
			int start = 0;
			int end = 0;
			if (directory.startsWith("/")) {
				start = 1;
			} else {
				start = 0;
			}
			end = directory.indexOf("/", start);
			while (true) {
				String subDirectory = new String(remote.substring(start, end)
						.getBytes(chartEncode_Using), chartEncode_ISO);
				if (!ftpClient.changeWorkingDirectory(subDirectory)) {
					if (ftpClient.makeDirectory(subDirectory)) {
						ftpClient.changeWorkingDirectory(subDirectory);
					} else {
						System.out.println("创建目录失败");
						// return UploadStatus.Create_Directory_Fail;
						return false;
					}
				}
				start = end + 1;
				end = directory.indexOf("/", start);
				// 检查所有目录是否创建完毕
				if (end <= start) {
					break;
				}
			}
		}
		return true;
	}

	/**
	 * 上传文件到服务器,新上传和断点续传
	 * 
	 * @param remoteFile
	 *            远程文件名，在上传之前已经将服务器工作目录做了改变
	 * @param localFile
	 *            本地文件File句柄，绝对路径
	 * @param processStep
	 *            需要显示的处理进度步进值
	 * @param ftpClient
	 *            FTPClient引用
	 * @return
	 * @throws IOException
	 */
	public int uploadFile(String remoteFile, File localFile,
			FTPClient ftpClient, long remoteSize) throws IOException {
		// UploadStatus status;
		// 显示进度的上传
		long step = localFile.length() / 100;
		long process = 0;
		long localreadbytes = 0L;
		RandomAccessFile raf = new RandomAccessFile(localFile, "r");
		OutputStream out = ftpClient.appendFileStream(new String(remoteFile
				.getBytes(chartEncode_Using), chartEncode_ISO));
		// 断点续传
		if (remoteSize > 0) {
			ftpClient.setRestartOffset(remoteSize);
			process = remoteSize / step;
			raf.seek(remoteSize);
			localreadbytes = remoteSize;
		}
		byte[] bytes = new byte[1024];
		int c;
		while ((c = raf.read(bytes)) != -1) {
			out.write(bytes, 0, c);
			localreadbytes += c;
			if (localreadbytes / step != process) {
				process = localreadbytes / step;
				System.out.println("上传进度:" + process);
				// TODO 汇报上传状态
			}
		}
		out.flush();
		raf.close();
		out.close();
		boolean result = ftpClient.completePendingCommand();
		int status = -1;
		if (remoteSize > 0) { // 断点
			status = result ? Upload_From_Break_Success
					: Upload_From_Break_Failed;
		} else { // 新文件
			status = result ? Upload_New_File_Success : Upload_New_File_Failed;
		}
		return status;
	}

	/**
	 * 从FTP服务器上下载文件,支持断点续传，上传百分比汇报
	 * 
	 * @param remote
	 *            远程文件路径
	 * @param local
	 *            本地文件路径
	 * @return 上传的状态
	 * @throws IOException
	 */
	public int download(String remote, String local) throws IOException {
		// 设置被动模式
		//orgFtp.enterLocalPassiveMode();
		// 设置以二进制方式传输
		//orgFtp.setFileType(FTP.BINARY_FILE_TYPE);
		int result;

		// 检查远程文件是否存在
		String temp=new String(remote.getBytes(chartEncode_Using), chartEncode_ISO);
		FTPFile[] files = orgFtp.listFiles(temp);
		if (files.length != 1) {
			System.out.println("远程文件不存在");
			return Remote_File_Noexist;
		}

		long lRemoteSize = files[0].getSize();
		File f = FileUtils.createFile(local);
		// 本地存在文件，进行断点下载
		if (f.exists()) {
			long localSize = f.length();
			// 判断本地文件大小是否大于远程文件大小
			if (localSize >= lRemoteSize) {
				System.out.println("本地文件大于远程文件，下载中止");
				return Local_Bigger_Remote;
			}

			// 进行断点续传，并记录状态
			FileOutputStream out = new FileOutputStream(f, true);
			orgFtp.setRestartOffset(localSize);
			InputStream in = orgFtp.retrieveFileStream(new String(remote
					.getBytes(chartEncode_Using), chartEncode_ISO));
			byte[] bytes = new byte[1024];
			long step = lRemoteSize / 100;
			long process = localSize / (step!=0?step:1);
			int c;
			while ((c = in.read(bytes)) != -1) {
				out.write(bytes, 0, c);
				localSize += c;
				long nowProcess = localSize / (step!=0?step:1);
				if (nowProcess > process) {
					process = nowProcess;
					if (process % 10 == 0)
						System.out.println("下载进度：" + process);
					// TODO 更新文件下载进度,值存放在process变量中
				}
			}
			in.close();
			out.close();
			boolean isDo = orgFtp.completePendingCommand();
			if (isDo) {
				result = Download_From_Break_Success;
			} else {
				result = Download_From_Break_Failed;
			}
		} else {
			
			OutputStream out = new FileOutputStream(f);
			InputStream in = orgFtp.retrieveFileStream(new String(remote
					.getBytes(chartEncode_Using), chartEncode_ISO));
			byte[] bytes = new byte[1024];
			long step = lRemoteSize / 100;
			long process = 0;
			long localSize = 0L;
			int c;
			while ((c = in.read(bytes)) != -1) {
				out.write(bytes, 0, c);
				localSize += c;
				long nowProcess = localSize /(step!=0?step:1);
				if (nowProcess > process) {
					process = nowProcess;
					if (process % 10 == 0)
						System.out.println("下载进度：" + process);
					// TODO 更新文件下载进度,值存放在process变量中
				}
			}
			in.close();
			out.close();
			boolean upNewStatus = orgFtp.completePendingCommand();
			if (upNewStatus) {
				result = Download_New_Success;
			} else {
				result = Download_New_Failed;
			}
		}
		return result;
	}
	/**
	 * 
	 * @param pointPath 目录
	 * @param fileName 文件名
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String> getFileList(String pointPath, String fileName) throws IOException{
		ArrayList<String> filesList=new ArrayList<String>();
		FTPFile ftpFile[]=orgFtp.listFiles(pointPath+"/"+fileName);
		 
		for(FTPFile file:ftpFile){
			//System.out.println(file.getName());
			filesList.add(file.getName());
		}
		 
		return filesList;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		OrgFtpUtils orgFtp=new OrgFtpUtils();
		boolean flag=orgFtp.connect("172.16.20.23", 21, "hanjing", "20gd2B7H");
		System.out.println(flag);
		//orgFtp.getFileList("/", "b*");
		FTPFile f[]=orgFtp.orgFtp.listFiles("/baobiaomingxi/CRM_100000005_20140303.0070.201403");
		System.out.println(f.length);
		//orgFtp.upload(local, remote)
		//orgFtp.download("", "");
	}

}
