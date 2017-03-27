package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import com.valens.base.utils.FileUtils;
import com.valens.base.utils.StrToFileUtils;
import com.valens.xml.utils.XmlToImg;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String imgStr ="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";
		 imgStr="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";
		try {
			List<Map> fileList=FileUtils.fileQuery("F:/阿门/好莱舞门/*", true);
			int i=0;
			boolean flag=false;
			for(Map obj:fileList){
				 
				if(obj.get("fileName")!=null){
					String fileName=obj.get("fileName").toString().trim();
					if(fileName.toUpperCase().endsWith(".JPG")||fileName.toUpperCase().endsWith(".PNG")){
						System.out.println(obj);
						 //String imgPath="E:/opt/test/QQ0.png";
						String imgPath=obj.get("filePath").toString();
						imgStr=XmlToImg.getImageBinary(imgPath);
						System.out.println(imgStr);
						//XmlToImg.strToImg(imgStr, "E:/opt/test/test3.jpg");
						StrToFileUtils.fileWrite("F:/阿门/好莱舞.txt", imgStr, flag);
						if(!flag){
							flag=true;
						}
						StrToFileUtils.fileWrite("F:/阿门/好莱舞.txt", "##"+fileName, flag);
						/*if(i++>5){
							break;
						}*/
					}
				}
					 
				
			}
			File file=new File("F:/阿门/好莱舞.txt");
			FileInputStream fileIn=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fileIn);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuffer baseStr=new StringBuffer();
			String tempStr=bufferedReader.readLine();
			while(tempStr!=null){
				if(tempStr.startsWith("##")){
					baseStr.append("\n");
					XmlToImg.strToImg(baseStr.toString(), "F:/阿门/好莱坞门img/"+(tempStr.replace("##", "")));
					baseStr.setLength(0);//清空STRINGBUFFER
				}else{
					baseStr.append(tempStr);
				}
				tempStr=bufferedReader.readLine();
			}
			System.out.println(baseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
