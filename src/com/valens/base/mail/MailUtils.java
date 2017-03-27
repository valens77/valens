package com.valens.base.mail;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *  与J2EE 1.5包中的EMAIL 冲突
 * @author xiaohau
 *
 */
public class MailUtils {
	// 定义发件人、收件人、SMTP服务器、用户名、密码、主题、内容等
	private String displayName;
	/**
	 * 收件人列表
	 */
	private List<String> toList=new ArrayList<String>();//收件人列表
	/**
	 * 抄送人列表
	 */
	private List<String> toCList=new ArrayList<String>();//抄送人列表
	private String from;
	private String smtpServer;
	private String username;
	private String password;
	private String subject;
	private String content;
	private boolean ifAuth=true; // 服务器是否要身份认证 默认需要
	private String filename = "";
	private Vector<String> file = new Vector<String>(); // 用于保存发送附件的文件名的集合 

	/**
	 * 设置SMTP服务器地址
	 */
	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	/**
	 * 设置发件人的地址
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * 设置显示的名称
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * 设置服务器是否需要身份认证
	 */
	public void setIfAuth(boolean ifAuth) {
		this.ifAuth = ifAuth;
	}

	/**
	 * 设置E-mail用户名
	 */
	public void setUserName(String username) {
		this.username = username;
	}

	/**
	 * 设置E-mail密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 设置接收者
	 */
	public void setToList(List<String> toList) {
		this.toList = toList;
	}

	/**
	 * 设置主题
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 设置主体内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 该方法用于收集附件名
	 */
	public void addAttachfile(String fname) {
		file.addElement(fname);
	}

	public MailUtils() {

	}

	/**
	 * 初始化SMTP服务器地址、发送者E-mail地址、用户名、密码、接收者、主题、内容
	 */
	public MailUtils(String smtpServer, String from, String displayName,
			String username, String password,  String subject,
			String content) {
		this.smtpServer = smtpServer;
		this.from = from;
		this.displayName = displayName;
		this.ifAuth = true;
		this.username = username;
		this.password = password;
		this.subject = subject;
		this.content = content;
	}

	/**
	 * 初始化SMTP服务器地址、发送者E-mail地址、接收者、主题、内容
	 */
	public MailUtils(String smtpServer, String from, String displayName,
			String subject, String content) {
		this.smtpServer = smtpServer;
		this.from = from;
		this.displayName = displayName;
		this.ifAuth = false;
		this.subject = subject;
		this.content = content;
	}

	/**
	 * 发送邮件
	 */
	public HashMap<Object,Object> send() {
		HashMap<Object,Object> map = new HashMap<Object,Object>();
		map.put("state", "success");
		String message = "邮件发送成功！";
		Session session = null;
		Properties props = System.getProperties();
		props.put("mail.smtp.host", smtpServer);
		if (ifAuth) { // 服务器需要身份认证
			props.put("mail.smtp.auth", "true");
			SmtpAuth smtpAuth = new SmtpAuth(username, password);
			session = Session.getDefaultInstance(props, smtpAuth);
		} else {
			props.put("mail.smtp.auth", "false");
			session = Session.getDefaultInstance(props, null);
		}
		session.setDebug(true);
		Transport trans = null;
		try {
			Message msg = new MimeMessage(session);//邮件信息
			try {
				Address from_address = new InternetAddress(from, displayName);//发件人
				msg.setFrom(from_address);
			} catch (java.io.UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		
			InternetAddress[] toAddress = new InternetAddress[toList.size()];//接收人
			int i=0;
			for(String to:toList){
				toAddress[i]=new InternetAddress(to);
				i++;
			}
			msg.setRecipients(Message.RecipientType.TO, toAddress);//接收人
			
			//抄送人
			  i=0;
			  InternetAddress[] tcAddress = new InternetAddress[toCList.size()];//抄送人
			for(String to:toCList){
				tcAddress[i]=new InternetAddress(to);
				i++;
			}
			msg.setRecipients(Message.RecipientType.CC, tcAddress);//抄送人

			
			msg.setSubject(subject);
			Multipart mp = new MimeMultipart();
			MimeBodyPart mbp = new MimeBodyPart();
			mbp.setContent(content.toString(), "text/html;charset=gb2312");
			mp.addBodyPart(mbp);
			if (!file.isEmpty()) {// 有附件
				Enumeration<String> efile = file.elements();
				while (efile.hasMoreElements()) {
					mbp = new MimeBodyPart();
					filename = efile.nextElement().toString(); // 选择出每一个附件名
				
					FileDataSource fds = new FileDataSource(filename); // 得到数据源
					mbp.setDataHandler(new DataHandler(fds)); // 得到附件本身并至入BodyPart
					mbp.setFileName(fds.getName()); // 得到文件名同样至入BodyPart
					mp.addBodyPart(mbp);
				}
				file.removeAllElements();
			}
			msg.setContent(mp); // Multipart加入到信件
			msg.setSentDate(new Date()); // 设置信件头的发送日期
			
			// 发送信件
			msg.saveChanges();
			trans = session.getTransport("smtp");
			trans.connect(smtpServer, username, password);
			trans.sendMessage(msg, msg.getAllRecipients());
			trans.close();

		} catch (AuthenticationFailedException e) {
			map.put("state", "failed");
			message = "邮件发送失败！错误原因：\n" + "身份验证错误!";
			e.printStackTrace();
		} catch (MessagingException e) {
			message = "邮件发送失败！错误原因：\n" + e.getMessage();
			map.put("state", "failed");
			e.printStackTrace();
			Exception ex = null;
			if ((ex = e.getNextException()) != null) {
				System.out.println(ex.toString());
				ex.printStackTrace();
			}
		}
		map.put("message", message);
		return map;
	}
	public static void main(String args[]){
		String smtpServer="smtp.163.com";
		String from="yuanlian14@163.com";
		String to="yuanlian14@163.com";
		String to2="306910617@qq.com";
		String password="yuanl314";
		String userName="yuanlian14";
		String content="TEST EMAIL";
		String subject="这是一个病毒!请勿打开!";
		MailUtils mail=new MailUtils();
		mail.setPassword(password);
		mail.setUserName(userName);
		mail.setDisplayName("");
		mail.setSmtpServer(smtpServer);
		mail.setFrom(from);
		mail.setContent(content);
		mail.setSubject(subject);
		//mail.getToList().add(to);//添加收件人
		//mail.getToList().add(to2);
		mail.getToList().add("yuanlian14@163.com");
		//mail.getToCList().add("306910617@qq.com");
		mail.setIfAuth(true);
		mail.file.add("D:/testExls/export.xls");
		mail.setDisplayName("黄小华");
		System.out.println("<!------------------111111111111111---------->");
		mail.send();
		
		//MimeMessage mime=mail.
	}

	public List<String> getToList() {
		return toList;
	}

	public List<String> getToCList() {
		return toCList;
	}

	public void setToCList(List<String> toCList) {
		this.toCList = toCList;
	}

	public Vector<String> getFile() {
		return file;
	}
}
