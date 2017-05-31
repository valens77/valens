package com.valens.base.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemNetUtils {
	public static Logger logger = LoggerFactory.getLogger(SystemNetUtils.class);

	/**
	 * 
	 * 根据系统的类型获取本服务器的ip地址
	 * 
	 * InetAddress inet = InetAddress.getLocalHost(); 但是上述代码在Linux下返回127.0.0.1。
	 * 主要是在linux下返回的是/etc/hosts中配置的localhost的ip地址，
	 * 而不是网卡的绑定地址。后来改用网卡的绑定地址，可以取到本机的ip地址：）：
	 * 
	 * @throws UnknownHostException
	 */
	public static InetAddress getSystemLocalIp() {
		InetAddress inet = null;
		try {

			String osname = getSystemOSName();
			logger.info("System={}", osname);
			//logger.info("System test={}", SystemNetUtils.getHostAddress());
			// 针对window系统
			if (osname.contains("Windows")) {
				inet = getWinLocalIp();
				// 针对linux系统
			} else if (osname.equalsIgnoreCase("Linux")
					|| "Unix".equalsIgnoreCase(osname)) {
				inet = getUnixLocalIp();
			}
			if (null == inet) {
				inet = getHostAddress();
				logger.debug("通过getHostAddress={}", inet);
			}
			if (null == inet) {
				throw new UnknownHostException("主机的ip地址未知");
			}
		} catch (SocketException e) {
			logger.error("获取本机ip错误" + e.getMessage());
			// throw new UnknownHostException("获取本机ip错误" + e.getMessage());
		} catch (UnknownHostException e) {
			logger.error("获取本机ip错误=" + e.getMessage());
		} catch (Exception e) {
			logger.error("获取本机ip错误=" + e.getMessage());
		}
		return inet;
	}

	/**
	 * 获取FTP的配置操作系统
	 * 
	 * @return
	 */
	public static String getSystemOSName() {
		// 获得系统属性集
		Properties props = System.getProperties();
		// 操作系统名称
		String osname = props.getProperty("os.name");
		if (logger.isDebugEnabled()) {
			logger.info("the ftp client system os Name " + osname);
		}
		return osname;
	}

	/**
	 * 获取window 本地ip地址
	 * 
	 * @return
	 * @throws UnknownHostException
	 */
	private static InetAddress getWinLocalIp() throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		//System.out.println("本机的ip=" + inet.getHostAddress());
		return inet;
	}

	/**
	 * 
	 * 可能多多个ip地址只获取一个ip地址 获取Linux 本地IP地址
	 * 
	 * @return
	 * @throws SocketException
	 */
	private static InetAddress getUnixLocalIp() throws SocketException {
		Enumeration<NetworkInterface> netInterfaces = NetworkInterface
				.getNetworkInterfaces();
		InetAddress ip = null;
		logger
				.debug(
						"getUnixLocalIp==>Enumeration<NetworkInterface> netInterfaces={}",
						netInterfaces);
		while (netInterfaces.hasMoreElements()) {
			NetworkInterface ni = (NetworkInterface) netInterfaces
					.nextElement();
			logger.debug("getUnixLocalIp==>NetworkInterface={}", ni);
			ip = (InetAddress) ni.getInetAddresses().nextElement();
			logger.debug("getUnixLocalIp==>InetAddress={}", ip);
			if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress()
					&& ip.getHostAddress().indexOf(":") == -1) {
				return ip;
			} else {
				ip = null;
			}
		}
		return null;
	}

	/**
	 * 
	 * 获取当前运行程序的内存信息
	 * 
	 * @return
	 */
	public static final String getRAMinfo() {
		Runtime rt = Runtime.getRuntime();
		return "RAM: " + rt.totalMemory() + " bytes total, " + rt.freeMemory()
				+ " bytes free.";
	}

	/**
	 * Get host IP address
	 * 
	 * @return IP Address
	 */
	public static InetAddress getHostAddress() {
		InetAddress inetAdd = null;
		try {
			for (Enumeration<NetworkInterface> interfaces = NetworkInterface
					.getNetworkInterfaces(); interfaces.hasMoreElements();) {
				NetworkInterface networkInterface = interfaces.nextElement();
				if (networkInterface.isLoopback()
						|| networkInterface.isVirtual()
						|| !networkInterface.isUp()) {
					continue;
				}
				Enumeration<InetAddress> addresses = networkInterface
						.getInetAddresses();
				if (addresses.hasMoreElements()) {
					inetAdd = addresses.nextElement();
					break;
				}
			}
			if (inetAdd != null) {
				// logger.info("hostname={}",inetAdd.getHostName());
				logger.info("getLocalHost={}", inetAdd.getLocalHost());
			}
		} catch (SocketException e) {
			logger.debug("Error when getting host ip address: <{}>.", e
					.getMessage());
		} catch (Exception e) {
			logger.debug("Error when getting host ip address: <{}>.", e
					.getMessage());
		}
		return inetAdd;
	}

	public static void main(String[] s) throws UnknownHostException {
		 System.out.println(SystemNetUtils.getHostAddress().getLocalHost().getHostAddress());
		 System.out.println(SystemNetUtils.getHostAddress().getLocalHost().getHostName());
		 System.out.println(SystemNetUtils.getHostAddress().getHostAddress());
		 System.out.println(SystemNetUtils.getHostAddress().getHostName());
		 System.out.println(SystemNetUtils.getSystemLocalIp());
		 System.out.println(SystemNetUtils.getRAMinfo());
	}
}
