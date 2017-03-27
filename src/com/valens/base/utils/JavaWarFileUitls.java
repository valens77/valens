package com.valens.base.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class JavaWarFileUitls {
	  /**   
	   * 复制文件   
	   *    
	   * @param srcFile   
	   *            源文件File   
	   * @param destDir   
	   *            目标目录File   
	   * @param newFileName   
	   *            新文件名   
	   * @return 实际复制的字节数，如果文件、目录不存在、文件为null或者发生IO异常，返回-1   
	   */    
	  public static long copyFile1(File srcFile, File destDir, String newFileName) {     
	      long copySizes = 0;     
	      if (!srcFile.exists()) {     
	          System.out.println("源文件不存在");     
	          copySizes = -1;     
	      } else if (!destDir.exists()) {     
	          System.out.println("目标目录不存在");     
	          copySizes = -1;     
	      } else if (newFileName == null) {     
	          System.out.println("文件名为null");     
	          copySizes = -1;     
	      } else {     
	          try {     
	              BufferedInputStream bin = new BufferedInputStream(     
	                      new FileInputStream(srcFile));     
	              BufferedOutputStream bout = new BufferedOutputStream(     
	                      new FileOutputStream(new File(destDir, newFileName)));     
	              int b = 0, i = 0;     
	              while ((b = bin.read()) != -1) {     
	                  bout.write(b);     
	                  i++;     
	              }     
	              bout.flush();     
	              bin.close();     
	              bout.close();     
	              copySizes = i;     
	  
	          } catch (FileNotFoundException e) {     
	              e.printStackTrace();     
	          } catch (IOException e) {     
	              e.printStackTrace();     
	          }     
	      }     
	      return copySizes;     
	  }     
	  
	  /**   
	   * 复制文件(以超快的速度复制文件)   
	   *    
	   * @param srcFile   
	   *            源文件File   
	   * @param destDir   
	   *            目标目录File   
	   * @param newFileName   
	   *            新文件名   
	   * @return 实际复制的字节数，如果文件、目录不存在、文件为null或者发生IO异常，返回-1   
	   */    
	  public static long copyFile2(File srcFile, File destDir) {     
	      long copySizes = 0;     
	      if (!srcFile.exists()) {     
	          System.out.println("源文件不存在");     
	          return -1;     
	      }  
	      try {     
	          FileChannel fcin = new FileInputStream(srcFile).getChannel();     
	          FileChannel fcout = new FileOutputStream(destDir).getChannel();     
	          long size = fcin.size();     
	          fcin.transferTo(0, fcin.size(), fcout);     
	          fcin.close();     
	          fcout.close();     
	          copySizes = size;     
	      } catch (FileNotFoundException e) {     
	          e.printStackTrace();     
	      } catch (IOException e) {     
	          e.printStackTrace();     
	      }     
	        
	      return copySizes;     
	  }   
	    
	     
	   public static void copyDict(File source, File target,long last,String target_pack) {     
	       File[] file = source.listFiles();  
	       for (int i = 0; i < file.length; i++) {     
	           if(file[i].getName().contains("svn")){  
	               continue;  
	           }             
	           if (file[i].isFile()) {  
	               if(file[i].lastModified()>=last){  
	                   if((file[i].getName().endsWith(".hbm.xml")||file[i].getName().endsWith(".class"))&&  
	                       notEmpty(target_pack)&&!source.getAbsolutePath().contains(target_pack)){  
	                       continue;  
	                   }  
	                   System.out.println(source.getAbsolutePath());  
	                   File sourceDemo = new File(source.getAbsolutePath() + "/"    
	                           + file[i].getName());     
	                   File destDemo = new File(target.getAbsolutePath() + "/"    
	                           + file[i].getName());     
	                   copyFile2(sourceDemo, destDemo);                      
	               }  
	           }     
	           if (file[i].isDirectory()) {  
	                 
	               File sourceDemo = new File(source.getAbsolutePath() + "/"    
	                       + file[i].getName());     
	               File destDemo = new File(target.getAbsolutePath() + "/"    
	                       + file[i].getName());     
	               destDemo.mkdir();  
	               copyDict(sourceDemo, destDemo,last,target_pack);     
	           }     
	       }    
	         
	   }     
	     
	   public static boolean notEmpty(String str) {  
	       return str!=null&&!str.isEmpty();  
	   }  
	   /**   
	    * 循环删除空的文件夹     
	    * @param dir   
	    */    
	   public static void deleteEmptyDir(File dir) {     
	          
	       if (dir.isDirectory()) {     
	           File[] fs = dir.listFiles();     
	           if (fs != null && fs.length > 0) {     
	               for (int i = 0; i < fs.length; i++) {     
	                   File tmpFile = fs[i];     
	                   if (tmpFile.isDirectory()) {     
	                       deleteEmptyDir(tmpFile);     
	                   }     
	                   if (tmpFile.isDirectory() && tmpFile.listFiles().length <= 0) {     
	                       tmpFile.delete();     
	                   }     
	                    
	               }     
	           }     
	           if (dir.isDirectory() && dir.listFiles().length == 0) {     
	               dir.delete();     
	           }             
	           
	       }     
	   }   
	     
	   public static void main(String[] args) {  
	       String [] s = "127.0.0.1 - - [14/Sep/2012:11:27:10 +0800] POST /newkyhb/sys/loginlognews.action HTTP/1.1 200 356 0.032".split(" ");  
	       for (String string : s) {  
	           System.out.println(string);  
	       }  
	         
	   }  

}
