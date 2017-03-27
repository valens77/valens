package com.valens.base.utils;

import java.net.URLDecoder;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;

/**
 */
public class Cryptogram {
	private static Logger logger = Logger.getLogger(Cryptogram.class);
	private static byte[] defaultIV = {1,2,3,4,5,6,7,8};
	public static final String KEY="CA98E79AE96EE1E126140C5AC6F977C6A9E5821E5AE15CE8";
	private static byte chr2hex(String chr) {
		if (chr.equals("0")) {
			return 0x00;
		} else if (chr.equals("1")) {
			return 0x01;
		} else if (chr.equals("2")) {
			return 0x02;
		} else if (chr.equals("3")) {
			return 0x03;
		} else if (chr.equals("4")) {
			return 0x04;
		} else if (chr.equals("5")) {
			return 0x05;
		} else if (chr.equals("6")) {
			return 0x06;
		} else if (chr.equals("7")) {
			return 0x07;
		} else if (chr.equals("8")) {
			return 0x08;
		} else if (chr.equals("9")) {
			return 0x09;
		} else if (chr.equals("A")) {
			return 0x0a;
		} else if (chr.equals("B")) {
			return 0x0b;
		} else if (chr.equals("C")) {
			return 0x0c;
		} else if (chr.equals("D")) {
			return 0x0d;
		} else if (chr.equals("E")) {
			return 0x0e;
		} else if (chr.equals("F")) {
			return 0x0f;
		}
		return 0x00;
	}

	public static byte[] HexStringToByteArray(String s) {
		byte[] buf = new byte[s.length() / 2];
		for (int i = 0; i < buf.length; i++) {
			buf[i] = (byte) (chr2hex(s.substring(i * 2, i * 2 + 1)) * 0x10 + chr2hex(s
					.substring(i * 2 + 1, i * 2 + 2)));
		}
		return buf;
	}

	/**
	 * Encrypt the data by the key.
	 * @param OriSource
	 * @return strResult
	 * @throws Exception
	 */
	public static String encryptByKey(String OriSource, String key) throws Exception {
		
		String strResult = "";
		try {
			
			Cipher c3des = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			SecretKeySpec myKey = new SecretKeySpec(HexStringToByteArray(key),
					"DESede");

			IvParameterSpec ivspec = new IvParameterSpec(defaultIV);
			c3des.init(Cipher.ENCRYPT_MODE, myKey, ivspec);

			byte[] testSrc = OriSource.getBytes("utf-8");
			byte[] encoded = c3des.doFinal(testSrc);
			
			strResult = BASE64Utils.getEncoder(encoded);
			
		} catch (Exception e) {
			strResult="";
			logger.debug("Encrypt failure!!!",e);
		}

		return strResult;
	}
	
	/**
	 * Decrypt the encrypted data with the key.
	 * @param strData
	 * @return strResult
	 * @throws Exception
	 */
	public static String decryptByKey(String encryptedData, String key) throws Exception {
		
		String strResult = "";
		try {
			
			Cipher c3des = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			SecretKeySpec myKey = new SecretKeySpec(HexStringToByteArray(key),
					"DESede");

			IvParameterSpec ivspec = new IvParameterSpec(defaultIV);
			c3des.init(Cipher.DECRYPT_MODE, myKey, ivspec);

			byte[] s=BASE64Utils.getDecoder(encryptedData);
			byte[] encoded = c3des.doFinal(s);
			strResult = new String(encoded,"utf-8");
			
		} catch (Exception e) {
			strResult="";
			logger.debug("Encrypt failure!!!",e);
		}

		return strResult;
	}
	
	/**
	 * Decrypt the encrypted data with the key.
	 * @param strData
	 * @return strResult
	 * @throws Exception
	 */
	public static String getBase64HashString(String str) throws Exception{
		
		byte[] testSrc = str.getBytes();
		MessageDigest alga = MessageDigest.getInstance("SHA-1");
		alga.update(testSrc);
		byte[] digesta = alga.digest();
		return BASE64Utils.getEncoder(digesta);
	}
	
	
	/**
	 * Decrypt the encrypted data with the key.
	 * @param strData
	 * @return strResult
	 * @throws Exception
	 */
	public static String getAuthenicator(String sourceStr,String key) throws Exception{
		
		String strResult = "";
		try {
			
			Cipher c3des = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			SecretKeySpec myKey = new SecretKeySpec(HexStringToByteArray(key),
					"DESede");

			IvParameterSpec ivspec = new IvParameterSpec(defaultIV);
			c3des.init(Cipher.ENCRYPT_MODE, myKey, ivspec);
			
			
			byte[] testSrc = sourceStr.getBytes();
			MessageDigest alga = MessageDigest.getInstance("SHA-1");
			alga.update(testSrc);
			byte[] digesta = alga.digest();

			byte[] encoded = c3des.doFinal(digesta);
			strResult = BASE64Utils.getEncoder(encoded);
			
		} catch (Exception e) {
			strResult="";
			System.out.println("Decrypt failure!!!" + e.getMessage());
		}

		return strResult;
	}
	
	public static void main(String args[]) throws Exception {
		//测试
		try{
			
			//nmAdminJs 10008
			//参数 用户名

			//String username="zxReportctl";
            //String username="eoAdmin";
 
			//String username="zxManagerJs";
			String username="18911065107";
 
			 username="cAdminJs";
			// username="supperAdmin_test";
           //参数 店铺ID
			String shopId="10000";//10000
			//加密 
			String encryptStr = Cryptogram.encryptByKey(shopId + ","+username,KEY);
			 //encryptStr = Cryptogram.encryptByKey(username,KEY);
			System.out.println("加密："+encryptStr);
			encryptStr=java.net.URLEncoder.encode(encryptStr,"UTF-8");
			System.out.println("加密："+encryptStr);
			//解密
			String decryptStr = Cryptogram.decryptByKey(URLDecoder.decode(encryptStr,"UTF-8"),KEY);
			System.out.println("解密："+decryptStr);
			
			String url="http://localhost:8080/settlement/login.do?method=login&userKey="+encryptStr;
			String netUrl="http://118.85.207.71/settlement/login.do?method=login&userKey="+encryptStr;
		System.out.println(url);
		System.out.println(netUrl);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}	
	}
}