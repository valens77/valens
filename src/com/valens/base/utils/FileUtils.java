package com.valens.base.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author xiaohua
 * 
 */
public class FileUtils {
	
	private static Logger logger = Logger.getLogger(FileUtils.class.getName());
	/**
	 * 文件不存在时:创建文件
	 * @param filePath
	 * @return file
	 */
	public static File createFile(String filePath){
		if(filePath==null||"".equals(filePath.trim())){
			return null;
		}else{
			int endIndex = filePath.lastIndexOf("/") >= 0 ? filePath
					.lastIndexOf("/") : filePath.lastIndexOf("\\");
			String dir = filePath.substring(0, endIndex);
			File conFile = new File(dir);
			if (!conFile.exists()) {
				conFile.mkdirs();
			}
			File file = new File(filePath);
			return file;
		}
	}
	/**
	 * 文件移动
	 * @param File
	 * @param deleteSrc
	 * @return file
	 * @throws IOException 
	 */
	public static File moveFile(File srcFile,String targetFile,boolean deleteSrc) throws IOException{
		if(srcFile==null||!srcFile.exists()){
			logger.info("源文件不存在!");
			throw new RuntimeException("源文件不存在!");
		}
		if(targetFile==null||"".equals(targetFile.trim())){
			return null;
		}else{
			int endIndex = targetFile.lastIndexOf("/") >= 0 ? targetFile
					.lastIndexOf("/") : targetFile.lastIndexOf("\\");
					String dir = targetFile.substring(0, endIndex);
					File conFile = new File(dir);
					if (!conFile.exists()) {
						conFile.mkdirs();
					}
					File file = new File(targetFile);
					FileOutputStream out=new FileOutputStream(file);
					FileInputStream in=new FileInputStream(srcFile);
					saveFile(in,out);
					if(deleteSrc){
						srcFile.delete();
					}
					return file;
		}
	}
	/**
	 * 文件保存
	 * @param fileIn  文件输入流
	 * @param out 输出流
	 */
	public static void saveFile(InputStream fileIn, OutputStream out) {
		
		InputStream fileIt=null;
		if (fileIn != null && out != null) {
			try {
				byte[] buffer = new byte[1024];
				int i = fileIt.read(buffer);
				while (i != -1) {
					out.write(buffer, 0, i);
					i = fileIt.read(buffer);
				}
				fileIt.close();
				out.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				closeStream(fileIn,out);;
			}
		}
	}
	public static void delFile(String FilePath){
		File f=new File(FilePath);
		if(f.isFile()){
			f.deleteOnExit();
		}else if(f.isDirectory()){
			File files[]=f.listFiles();
			for(File fi:files){
				if(fi.isFile()){
					fi.delete();
				}else if(fi.isDirectory()){
					delFile(fi.getAbsolutePath());
				}
			}
			f.delete();
			/*List<FileModel> fileMap=fileQueryModel(f.getAbsolutePath(),true);
			for(FileModel file:fileMap){
				if(file.isFile()){
					new File(file.getFilePath()).deleteOnExit();
				}else if(file.isDir()){
					delFile(file.getFilePath());
				}
			}*/
			
		}
	}

	/**
	 * 关闭输入输出流
	 * 
	 * @param in
	 * @param out
	 */
	public static void closeStream(InputStream in, OutputStream out) {
		try {
			if (in != null) {
				in.close();
			}
		} catch (Exception e) {
			logger.info("closing inputstream exception:" + e.getMessage());
		}
		try {
			if (out != null) {
				out.close();
			}
		} catch (Exception e) {
			logger.info("closing outputStream exception:" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param str
	 *            文件路径,文件名可模糊
	 * @param isAll
	 *            是否查询目录下文件
	 * @return List<Map>
	 * @throws Exception
	 */
	public static List<Map> fileQuery(String str, boolean isAll) {
		File f;
		f = new File(str);
		List<Map> fileNameList = new ArrayList<Map>();
		if (f.isDirectory()) {// 判断是否是目录文件
			File[] fList = f.listFiles();// 把目录文件下的所有文件,放到fList列表中
			for (int i = 0; i < fList.length; i++) {
				Map map = new HashMap();
				map.put("fileName", fList[i].getName());
				map.put("isFile", fList[i].isFile());
				map.put("isDir", fList[i].isDirectory());
				map.put("filePath", fList[i].getAbsolutePath());
				fileNameList.add(map);
				if (fList[i].isDirectory() && isAll) {// 判断文件师法是否仍有目录文件
					// System.out.println("文件夹:" + fList[i].getPath());//
					// 有目录文件"fList[j].getPath()"的路径
					map.put("sonFile", fileQuery(fList[i].getPath(), isAll));
					; // fileQurey函数里面又调用了getDir函数本身
					// continue;
				} else if (fList[i].isFile()) {
					// System.out.println("文 件:" + fList[i].getPath());
				}
				// }
			}
		} else if (f.exists()) {// 不是目录查看是否是文件
			Map map = new HashMap();
			map.put("fileName", f.getName());
			map.put("isFile", f.isFile());
			map.put("isDir", f.isDirectory());
			map.put("filePath", f.getAbsolutePath());
			fileNameList.add(map);
		} else {// 模糊查询
			String path = f.getAbsolutePath();
			int endIndex = path.lastIndexOf("/") >= 0 ? path.lastIndexOf("/")
					: path.lastIndexOf("\\");
			String fileName = path.substring(endIndex + 1);// 模糊文件名

			String filePath = path.substring(0, endIndex);// 路径
			List<Map> list = fileQuery(filePath, isAll);
			// System.out.println(list.size() + ":" + list);
			fileMapMatch(list, fileName, fileNameList);
		}
		return fileNameList;
	}
	/**
	 * 
	 * @param str
	 *            文件路径,文件名可模糊
	 * @param isAll
	 *            是否查询目录下文件
	 * @return List<Map>
	 * @throws Exception
	 */
	public static List<FileModel> fileQueryModel(String str, boolean isAll) {
		File f;
		f = new File(str);
		List<FileModel> fileNameList = new ArrayList<FileModel>();
		if (f.isDirectory()) {// 判断是否是目录文件
			File[] fList = f.listFiles();// 把目录文件下的所有文件,放到fList列表中
			for (int i = 0; i < fList.length; i++) {
				FileModel map=new FileModel();
				map.setFileName(fList[i].getName());
				map.setDir(fList[i].isDirectory());
				map.setFile(fList[i].isFile());
				map.setFilePath(fList[i].getAbsolutePath());
				fileNameList.add(map);
				if (fList[i].isDirectory() && isAll) {// 判断文件师法是否仍有目录文件
					// System.out.println("文件夹:" + fList[i].getPath());//
					// 有目录文件"fList[j].getPath()"的路径
					map.setSonFile(fileQueryModel(fList[i].getPath(), isAll));
					//map.put("sonFile", fileQuery(fList[i].getPath(), isAll));
					; // fileQurey函数里面又调用了getDir函数本身
					// continue;
				} else if (fList[i].isFile()) {
					// System.out.println("文 件:" + fList[i].getPath());
				}
				// }
			}
		} else if (f.exists()) {// 不是目录查看是否是文件
			FileModel map=new FileModel();
			map.setFileName(f.getName());
			map.setDir(f.isDirectory());
			map.setFile(f.isFile());
			map.setFilePath(f.getAbsolutePath());
			fileNameList.add(map);
		} else {// 模糊查询
			String path = f.getAbsolutePath();
			int endIndex = path.lastIndexOf("/") >= 0 ? path.lastIndexOf("/")
					: path.lastIndexOf("\\");
			String fileName = path.substring(endIndex + 1);// 模糊文件名
			
			String filePath = path.substring(0, endIndex);// 路径
			List<FileModel> list = fileQueryModel(filePath, isAll);
			// System.out.println(list.size() + ":" + list);
			fileModelMatch(list, fileName, fileNameList);
		}
		return fileNameList;
	}

	private static void fileModelMatch(List<FileModel> list, String fileName,
			List<FileModel> fileNameList) {
		if (list == null) {
			return;
		}
		for (FileModel fileMap : list) {
			if (wildcardMatch(fileName, fileMap.getFileName())) {// 模糊匹配
				fileNameList.add(fileMap);
			}
			if ((Boolean) fileMap.isDir()) {
				try {
					List<FileModel> sonList = fileMap.getSonFile();
					fileModelMatch(sonList, fileName, fileNameList);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
	private static void fileMapMatch(List<Map> list, String fileName,
			List<Map> fileNameList) {
		if (list == null) {
			return;
		}
		for (Map fileMap : list) {
			if (wildcardMatch(fileName, fileMap.get("fileName").toString())) {// 模糊匹配
				fileNameList.add(fileMap);
			}
			if ((Boolean) fileMap.get("isDir")) {
				try {
					List<Map> sonList = (List) fileMap.get("sonFile");
					fileMapMatch(sonList, fileName, fileNameList);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	/**
	 * 通配符匹配
	 * 
	 * @param pattern
	 *            通配符模式
	 * @param str
	 *            待匹配的字符串
	 * @return 匹配成功则返回true，否则返回false
	 */
	public static boolean wildcardMatch(String pattern, String str) {
		int patternLength = pattern.length();
		int strLength = str.length();
		int strIndex = 0;
		char ch;
		for (int patternIndex = 0; patternIndex < patternLength; patternIndex++) {
			ch = pattern.charAt(patternIndex);
			if (ch == '*') {
				// 通配符星号*表示可以匹配任意多个字符
				while (strIndex < strLength) {
					if (wildcardMatch(pattern.substring(patternIndex + 1), str
							.substring(strIndex))) {
						return true;
					}
					strIndex++;
				}
			} else if (ch == '?') {
				// 通配符问号?表示匹配任意一个字符
				strIndex++;
				if (strIndex > strLength) {
					// 表示str中已经没有字符匹配?了。
					return false;
				}
			} else {
				if ((strIndex >= strLength) || (ch != str.charAt(strIndex))) {
					return false;
				}
				strIndex++;
			}
		}
		return (strIndex == strLength);
	}
	/**
	 * 通配符匹配
	 * 
	 * @param pattern
	 *            通配符模式
	 * @param str
	 *            待匹配的字符串
	 * @return 匹配成功则返回true，否则返回false
	 */
	public static boolean regMatch(String reg, String fileName) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(fileName);
		return matcher.find();
	}

	public static void main(String[] s) throws Exception {
		//List<Map> list = FileUtils.fileQurey(ReaderFileForWebUtils.readClass()+ "/*er.class", true);
		System.out.println("please input project path:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String porjectPath = null;
		porjectPath = reader.readLine();
		System.out.println("query  project's="+porjectPath+" JAVA FILE");
		//D:/workspace/smgp/src/*
		List<Map> list = FileUtils.fileQuery(porjectPath+"/*", true);
		System.out.println(list);
		showMap(list);
		String sourcelist=porjectPath+"/source.list";
		
		System.out.println("create source.list="+sourcelist);
		
		creatSoureList(sourcelist,list,false);
		// System.out.println(wildcardMatch("*44004*.s*","BUS44004Upload.sh"));
		
		Process pid = null;
		//javac -d [classes文件目录] -extdirs lib[工程所用到的包lib] @source.list
		String classBin=porjectPath+"/classes";
		String cmdCommand="javac -d "+classBin+" -extdirs "+porjectPath+"/lib @"+sourcelist;
		System.out.println(cmdCommand);
		cmdCommand="java -Djava.ext.dirs=lib -cp "+classBin+" [JAVA MAIN ffile]";
		System.out.println(cmdCommand);
		/*pid = Runtime.getRuntime().exec(cmdCommand.toString());
		InputStream is = pid.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "GBK");
		BufferedReader br = new BufferedReader(isr);
		StringBuffer errorMsg = new StringBuffer();
		String msg = null;
		while ((msg = br.readLine()) != null) {
			errorMsg.append(msg);
			System.out.println(msg);
		}*/
	}

	public static void showMap(List<Map> list) {
		for (Map map : list) {
			System.out.println("dir:" + map.get("isDir") + ",file:"
					+ map.get("isFile") + ",fileName:" + map.get("fileName"));
			// System.out.println("filePath:" + map.get("filePath"));
			if (map.get("sonFile") != null) {
				//showMap((List<Map>) map.get("sonFile"));
			}
		}
	}
	public static void creatSoureList(String filePath,List<Map> list,boolean createNew) {
		StrToFileUtils.fileWrite(filePath, "", createNew);
		for (Map map : list) {
			if((Boolean)map.get("isFile")){
				String javaFilePath=map.get("filePath").toString();
				if(javaFilePath.lastIndexOf(".java")!=-1||javaFilePath.lastIndexOf(".JAVA")!=-1){
					StrToFileUtils.fileWrite(filePath, javaFilePath, true);
				}
			}
			if (map.get("sonFile") != null) {
				//creatSoureList(filePath,(List<Map>) map.get("sonFile"),true);
			}
		}
	}
}
class FileModel{
	boolean isDir=false;
	boolean isFile=false;
	String filePath="";
	String fileName="";
	List<FileModel> sonFile=null;
	public boolean isDir() {
		return isDir;
	}
	public void setDir(boolean isDir) {
		this.isDir = isDir;
	}
	public boolean isFile() {
		return isFile;
	}
	public void setFile(boolean isFile) {
		this.isFile = isFile;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public List<FileModel> getSonFile() {
		return sonFile;
	}
	public void setSonFile(List<FileModel> sonFile) {
		this.sonFile = sonFile;
	}
}
