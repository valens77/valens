package com.valens.upload.ziprar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/**
 * ZIP 格式压缩及解压
 * @author valens
 *
 */
public class ZipUtils {
	private static Logger logger = Logger.getLogger(ZipUtils.class.getName());

	private void zip(ZipOutputStream out, File f, String base) throws Exception {
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			out.putNextEntry(new ZipEntry(base + "/"));
			base = base.length() == 0 ? "" : base + "/";
			for (int i = 0; i < fl.length; i++) {
				zip(out, fl[i], base + fl[i].getName());
			}
		} else {
			out.putNextEntry(new ZipEntry(base.equals("")?f.getName():base));
			FileInputStream in = null;
			try {
				in = new FileInputStream(f);
				int b;
				while ((b = in.read()) != -1) {
					out.write(b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeStream(in,null);

			}

		}
	}

	public void zip(String inputFileName, String zipFileName) throws Exception {
		zip(zipFileName, new File(inputFileName));
	}

	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = null;
		try {
			out = new ZipOutputStream(new FileOutputStream(zipFileName));
			zip(out, inputFile, "");
			logger.info("zip done");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeStream(null,out);
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
	 * @param args
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
/*		File f = new File("d:\\temp\\note2.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] buf = new byte[1024];
		int len;
		File zipFile=FileUtils.createFile("d:\\temp\\zip\\note.zip");
		
		FileOutputStream fos = new FileOutputStream(zipFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ZipOutputStream zos = new ZipOutputStream(bos);// 压缩包

		ZipEntry ze = new ZipEntry(f.getName());// 这是压缩包名里的文件名
		
		zos.putNextEntry(ze);// 写入新的 ZIP 文件条目并将流定位到条目数据的开始处

		while ((len = bis.read(buf)) != -1) {
			zos.write(buf, 0, len);
			zos.flush();
		}
		bis.close();
		zos.close();
		
		
		File dirF=FileUtils.createFile("d:/temp/dir/");
		FileUtils.moveFile(zipFile, dirF.getAbsolutePath()+"/note.zip", false);
		//FileUtils.moveFile(zipFile, dirF.getAbsolutePath()+"/temp/note.zip", true);
		FileUtils.delFile("d:/temp/dir/");
 */
		

		ZipUtils book = new ZipUtils();
		//book.zip("d:\\temp\\zip", "d:\\temp\\test.zip");// 你要压缩的文件夹
		//book.zip("d:\\temp\\zip", "d:\\temp\\note3.zip");// 你要压缩的文件夹
		//book.zip("D:/workdoc/2q/财务中心/相关报表/相关报表/业务清单/淘宝/淘宝商城订单明细汇总201310/外-淘宝商城终端业务供货订单明细表（201310）", "D:/workdoc/2q/财务中心/相关报表/相关报表/业务清单/淘宝/taobao_hzs.zip");
		book.zip("E:/opt/settlement/balThree/unzip/", "D:/workdoc/2q/财务中心/相关报表/相关报表/业务清单/淘宝/taobao_hzs.zip");
		

		//book.unZip("E:/opt/settlement/balThree/zip/20140107145549taobao_hzs.zip", "E:/opt/settlement/balThree/unzip/", false);
		
		/*ZipFile zf=new ZipFile("d:\\temp\\zip\\note.zip");
		zf.entries();*/
		
		/*ZIPUitls book = new ZIPUitls();
		String zipFile = "d:\\temp\\zip\\temp.zip";
		book.zip("d:\\temp\\temp", zipFile);// 你要压缩的文件夹

		File zipF = new File(zipFile);
		zipF.deleteOnExit();*/
		
	        List<String> filter = new ArrayList<String>();  
	        filter.add("3RDPARTY");  
	        filter.add("3RDPARTY");  
	        filter.add(".zip");  
	        book.setComment("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");  
	        book.zip("d:/temp/move", "d:/temp/move.zip",filter);  

	}
	
	
	
	
	
	 private String comment = "";  
     
	   public void setComment(String comment) {  
	       this.comment = comment;  
	   }  
	 
	   /** 
	    * zip格式 压缩
	    * @param src：要压缩的目录 
	    * @param dest：压缩文件存档
	    * @param filter：文件夹下包含的字符或格式
	    *  
	    * @throws Exception 
	    */  
	   public void zip(String src, String dest, List filter) throws Exception {  
	       ZipOutputStream out = new ZipOutputStream(new FileOutputStream(dest));  
	       File srcFile = new File(src);  
	       zip(out,srcFile,"",filter);  
	       out.close();  
	   }  
	     
	   /** 
	    * @param out 
	    * @param srcFile 
	    * @param base：根路径 
	    * @param filter：过滤 
	    * @throws Exception 
	    */  
	   public void zip(ZipOutputStream out, File srcFile, String base, List filter) throws Exception {  
	       if(srcFile.exists()==false) {  
	           throw new Exception("压缩目录不存在!");  
	       }  
	         
	       if(srcFile.isDirectory()) {  
	           File[] files = srcFile.listFiles();  
	           base = base.length() == 0 ? "" : base + "/";  
	           if (isExist(base, filter)) {  
	               out.putNextEntry(new ZipEntry(base));  
	           }  
	           for(int i=0; i<files.length; i++) {  
	               zip(out,files[i],base + files[i].getName(),filter);  
	           }  
	       } else {  
	           if (isExist(base, filter)) {  
	               base = base.length() == 0 ? srcFile.getName() : base ;  
	               ZipEntry zipEntry = new ZipEntry(base);  
	               zipEntry.setComment(comment);  
	               out.putNextEntry(zipEntry);  
	               FileInputStream in = new FileInputStream(srcFile);  
	               int length = 0;  
	               byte[] b = new byte[1024];  
	               while((length=in.read(b,0,1024))!=-1) {  
	                   out.write(b,0,length);  
	               }  
	               in.close();  
	           }  
	       }  
	   }  
	     
	   /** 
	    * 过滤出要压缩的文件夹 
	    * @param base 
	    * @param list 
	    * @return 
	    */  
	   public boolean isExist(String base, List list) {  
	       if (list != null && !list.isEmpty()) {  
	           for (int i = 0; i < list.size(); i++) {  
	               if (base.indexOf((String) list.get(i)) >= 0) {  
	                   return true;  
	               }  
	           }  
	       }  
	       return false;  
	   }  
	     
	   /** 
	    * @param srcFile：压缩文件路径 
	    * @param dest：解压到的目录 
	    * @param deleteZipFile：解压完成后是否删除压缩文件
	    * @throws Exception 
	    */  
	   public void unZip(String srcFile,String dest,boolean deleteZipFile)  throws Exception {  
	       File file = new File(srcFile);  
	       if(!file.exists()) {  
	           throw new Exception("解压文件不存在!");  
	       }
	       
	        ZipFile zipFile = new ZipFile(file);  
	        Enumeration e = zipFile.entries();  
	        String end=dest+"/";
	        while(e.hasMoreElements()) { 
	            ZipEntry zipEntry = (ZipEntry)e.nextElement();  
	            if(zipEntry.isDirectory()) {  
	                String name = zipEntry.getName();  
	                name = name.substring(0,name.length()-1);  
	                File f = new File(end + name);  
	                f.mkdirs();  
	            } else {  
	                File f = new File(end + zipEntry.getName());  
	                f.getParentFile().mkdirs();  
	                f.createNewFile();  
	                InputStream is = zipFile.getInputStream(zipEntry);  
	                FileOutputStream fos = new FileOutputStream(f);  
	                int length = 0;  
	                byte[] b = new byte[1024];  
	                while((length=is.read(b, 0, 1024))!=-1) {  
	                    fos.write(b, 0, length);  
	                }  
	                is.close();  
	                fos.close();  
	            }  
	        }  
	          
	        if (zipFile != null) {  
	            zipFile.close();  
	        }  
	          
	        if(deleteZipFile) {  
	            file.deleteOnExit();  
	        }  
	    }  
	      
	    /** 
	     * 获取Zip文件的注释信息 
	     * @param srcFile 
	     * @return 
	     */  
	    public static String getZipComment(String srcFile) {  
	        String comment = "";  
	        try {  
	            ZipFile zipFile = new ZipFile(srcFile);  
	            Enumeration e = zipFile.entries();  
	  
	            while (e.hasMoreElements()) {  
	                ZipEntry ze = (ZipEntry) e.nextElement();  
	  
	                comment = ze.getComment();  
	                if (comment != null && !comment.equals("")  
	                        && !comment.equals("null")) {  
	                    break;  
	                }  
	            }  
	  
	            zipFile.close();  
	        } catch (Exception e) {  
	            System.out.println("获取zip文件注释信息失败:" + e.getMessage());  
	        }  
	  
	        return comment;  
	    }  
}
