package com.valens.base.mail;
/**
 * 邮件服务验证
 * @author xiaohu
 *
 */
public class SmtpAuth extends javax.mail.Authenticator {
	private String username, password;

	public SmtpAuth(String username, String password) {
		this.username = username;
		this.password = password;
	}

	protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
		return new javax.mail.PasswordAuthentication(username, password);
	}
}
