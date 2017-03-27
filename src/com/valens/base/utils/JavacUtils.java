package com.valens.base.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author xiaohua
 * 
 */
public class JavacUtils {
	/**
	 * 文件下载
	 * @param file  文件
	 * @param out 输出流
	 */
	public static void downFile(File file, OutputStream out) {
		
		if (file != null && file.exists() && out != null) {
			try {
				FileInputStream fileIt;
				fileIt = new FileInputStream(file);
				byte[] buffer = new byte[1024];
				int i = fileIt.read(buffer);
				while (i != -1) {
					out.write(buffer, 0, i);
					i = fileIt.read(buffer);
				}
				out.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
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
	public static List<Map> fileQurey(String str, boolean isAll) {
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
					map.put("sonFile", fileQurey(fList[i].getPath(), isAll));
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
			List<Map> list = fileQurey(filePath, isAll);
			// System.out.println(list.size() + ":" + list);
			fileMapMatch(list, fileName, fileNameList);
		}
		return fileNameList;
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

	public static void main(String[] s) throws Exception {
		//List<Map> list = FileUtils.fileQurey(ReaderFileForWebUtils.readClass()+ "/*er.class", true);
		System.out.println("please input project path eg:E:\\D\\workspace\\MyValens");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String porjectPath = null;
		porjectPath = reader.readLine();
		String javacUtil = porjectPath+"/javacUtil";
		System.out.println("query  project's="+porjectPath+" JAVA FILE");
		//D:/workspace/smgp/src/*
		List<Map> list = JavacUtils.fileQurey(porjectPath+"/src/*.java", true);
		if(list!=null&&list.size()>0){
			System.out.println(list);
			showMap(list);
			String sourcelist=javacUtil+"/source.list";
			
			System.out.println("create source.list="+sourcelist);
			 File f=null;
			
			// System.out.println(wildcardMatch("*44004*.s*","BUS44004Upload.sh"));
			
			Process pid = null;
			//javac -d [classes文件目录] -extdirs lib[工程所用到的包lib] @source.list
			String classBin=javacUtil+"/classes";
			   f=new File(classBin);
			 if(!f.exists()){
				 f.mkdirs();
			 }
			 creatSoureList(sourcelist,list,false);
			 String cmdCommandFile=javacUtil+"/javacUtils.txt";
			 String tempStr="";
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, false);
			String cmdCommand="javac -encoding UTF-8 -d "+classBin+"  -extdirs "+porjectPath+"/lib -classpath "+porjectPath+" @"+sourcelist;
			tempStr="JAVA工程编译命令="+cmdCommand;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			cmdCommand="javac -encoding UTF-8   -d "+classBin+"  -extdirs "+porjectPath+"/WebRoot/WEB-INF/lib/ -classpath "+porjectPath+"/WebRoot/WEB-INF/classes @"+sourcelist;
			tempStr="WEB工程编译命令="+cmdCommand;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			 
			tempStr="注意:lib下必须为jar包,如若分层,需加上 lib/spring;lib/struts;lib/log4j";
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			cmdCommand="java -Djava.ext.dirs=lib -cp "+classBin+" [JAVA MAIN file]";
			tempStr="运行命令="+cmdCommand;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			 
			 String docPath=javacUtil+"/doc";
			 f=new File(docPath);
			 if(!f.exists()){
				 f.mkdirs();
			 }
			cmdCommand="javadoc -d "+docPath+" -encoding UTF-8 -charset UTF-8 @"+sourcelist;
			tempStr="文档命令="+cmdCommand
			;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			
			cmdCommand="jar -cvf myWar.war ./";
			tempStr="war包命令=cd "+porjectPath+cmdCommand
			;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			
			cmdCommand="jar -cvf myJar.jar ./";
			tempStr="jar包命令=cd "+classBin+cmdCommand
			;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
			
			
			tempStr="windows下文件路径分隔符用\\ ，文件列表分隔符用分号 ;linux下文件路径分隔符用 / ，文件列表分隔符用冒号 :"
			;
			System.out.println(tempStr);
			 StrToFileUtils.fileWrite(cmdCommandFile, tempStr, true);
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
		}else{
			System.out.println("over!");
		}
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
