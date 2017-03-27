package com.valens.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImgUtils {
	private static List logoImgs;

	private static List bgImgs;

	private static boolean flag;

	public static List getBgImgs() {
		return bgImgs;
	}

	/**
	 * 把图片印刷到图片上
	 * 
	 * @param pressImg --
	 *            水印文件
	 * @param targetImg --
	 *            目标文件
	 * @param x
	 *            --x坐标
	 * @param y
	 *            --y坐标
	 * @param out
	 *            输出流(可以来自HttpServletReponse的输出)
	 */
	public final static void pressImage(String pressImg, String targetImg,
			int x, int y, OutputStream out) {
		try {
			// 目标文件
			File _file = new File(targetImg);
			Image src = ImageIO.read(_file);
			int wideth = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(wideth, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = image.createGraphics();
			g.drawImage(src, 0, 0, wideth, height, null);

			// 水印文件
			File _filebiao = new File(pressImg);
			Image src_biao = ImageIO.read(_filebiao);
			int wideth_biao = src_biao.getWidth(null);
			int height_biao = src_biao.getHeight(null);
			g.drawImage(src_biao, (wideth - wideth_biao) / 2,
					(height - height_biao) / 2, wideth_biao, height_biao, null);
			// 水印文件结束
			g.dispose();

			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			encoder.encode(image);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 打印文字水印图片
	 * 
	 * @param pressText
	 *            --文字
	 * @param targetImg --
	 *            目标图片
	 * @param fontName --
	 *            字体名
	 * @param fontStyle --
	 *            字体样式
	 * @param color --
	 *            字体颜色
	 * @param fontSize --
	 *            字体大小
	 * @param x --
	 *            偏移量(从右下角算起)
	 * @param y --
	 *            偏移量(从右下角算起)
	 * 
	 * @param out
	 *            输出流(可以来自HttpServletReponse的输出)
	 */

	public static void pressText(String pressText, String targetImg,
			String fontName, int fontStyle, int color, int fontSize, int x,
			int y, OutputStream out) {
		try {
			File _file = new File(targetImg);
			Image src = ImageIO.read(_file);
			int wideth = src.getWidth(null);
			int height = src.getHeight(null);
			// 只有图片的宽或高大于200的时候才添加水印（小图片不添加）
			if (wideth > 200 || height > 200) {
				BufferedImage image = new BufferedImage(wideth, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics g = image.createGraphics();
				g.drawImage(src, 0, 0, wideth, height, null);
				g.setColor(new Color(color));
				g.setFont(new Font(fontName, fontStyle, fontSize));
				g.drawString(pressText, wideth - fontSize - x, height
						- fontSize / 2 - y);
				g.dispose();
				JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
				encoder.encode(image);
				out.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String str="19910946766";
		
		System.out.println(ImgWatermarking.isPhone(str));
		
	    String srcImgPath = "E:\\F\\水印测试\\sfz2_.JPG";     
	      srcImgPath = "E:\\个人\\黄小华.jpg";     
	    String iconPath = "E:\\个人\\1.png";     
	    String targerPath = "E:\\个人\\sfz2_ysd_3.JPG" ;   
	     // 给图片添加水印     
	   // ImageMarkLogoByIcon.markImageByIcon(iconPath, srcImgPath, targerPath , -45);  
	    //TEST.markImageByIcon(iconPath, srcImgPath, targerPath , -45);  
	    FileOutputStream out=new FileOutputStream(targerPath);
	    ImgUtils.pressText("此证件仅用于2017年1月份 中国联通入网使用", srcImgPath, "宋体",1,Color.ORANGE.getRGB(), 25, 550, 180, out); 
	}
}
