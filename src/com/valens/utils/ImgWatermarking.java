package com.valens.utils;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ImgWatermarking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="19910946766";
		
		System.out.println(ImgWatermarking.isPhone(str));
		
	    String srcImgPath = "E:\\F\\水印测试\\sfz2_.JPG";     
	      srcImgPath = "E:\\个人\\黄小华.jpg";     
	    String iconPath = "E:\\个人\\1.png";     
	    String targerPath = "E:\\个人\\sfz2_ysd_2.JPG" ;   
	     // 给图片添加水印     
	   // ImageMarkLogoByIcon.markImageByIcon(iconPath, srcImgPath, targerPath , -45);  
	    //TEST.markImageByIcon(iconPath, srcImgPath, targerPath , -45);  
	    ImgWatermarking.markImageByIcon(iconPath, srcImgPath, targerPath , -40);  
	}
	public static boolean isPhone(String mobile){
		Pattern p = Pattern.compile("^((1[0-9]))\\d{9}$");
		 Matcher m = p.matcher(mobile);
		 return m.matches();
	}
   
	/**   
	 * 给图片添加水印   
	 * @param iconPath 水印图片路径   
	 * @param srcImgPath 源图片路径   
	 * @param targerPath 目标图片路径   
	 */    
	public static void markImageByIcon(String iconPath, String srcImgPath,     
	        String targerPath) {     
	    markImageByIcon(iconPath, srcImgPath, targerPath, null) ;   
	}     
	/**   
	 * 给图片添加水印、可设置水印图片旋转角度   
	 * @param iconPath 水印图片路径   
	 * @param srcImgPath 源图片路径   
	 * @param targerPath 目标图片路径   
	 * @param degree 水印图片旋转角度 
	 */    
	public static void markImageByIcon(String iconPath, String srcImgPath,     
	        String targerPath, Integer degree) {     
	    OutputStream os = null;     
	    try {     
	        Image srcImg = ImageIO.read(new File(srcImgPath));   
	        BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null),     
	                srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);   
	        // 得到画笔对象     
	        // Graphics g= buffImg.getGraphics();     
	        Graphics2D g = buffImg.createGraphics();     

	        // 设置对线段的锯齿状边缘处理     
	        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,     
	                RenderingHints.VALUE_INTERPOLATION_BILINEAR);     

	        g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg     
	                .getHeight(null), Image.SCALE_SMOOTH), 0, 0, null);     

	        if (null != degree) {     
	            // 设置水印旋转     
	            g.rotate(Math.toRadians(degree),     
	                    (double) buffImg.getWidth() / 2, (double) buffImg     
	                            .getHeight() / 2);     
	        }     
	        // 水印图象的路径 水印一般为gif或者png的，这样可设置透明度    
	        ImageIcon imgIcon = new ImageIcon(iconPath);     
	        // 得到Image对象。     
	        Image img = imgIcon.getImage();     
	        float alpha = 0.5f; // 透明度     
	        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,     
	                alpha));     
	        // 表示水印图片的位置     
	        g.drawImage(img, 900,600, null);     
	        g.drawImage(img, 600,900, null);     
	        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));     
	        g.dispose();     
	        os = new FileOutputStream(targerPath);     
	        // 生成图片     
	        ImageIO.write(buffImg, "JPG", os);     
	        System.out.println("ICON OVER");
	    } catch (Exception e) {     
	        e.printStackTrace();     
	    } finally {     
	        try {     
	            if (null != os)     
	                os.close();     
	        } catch (Exception e) {     
	            e.printStackTrace();     
	        }     
	    }     
	}     

}
