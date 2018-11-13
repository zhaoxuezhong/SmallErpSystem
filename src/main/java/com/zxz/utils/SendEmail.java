package com.zxz.utils;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    private Properties props;// 系统属性
    private Session mailSession;// 邮件会话对象
    private MimeMessage mimeMsg; // MIME邮件对象

    private static String port;
    private static String mailfrom;
    private static String mailusername;
    private static String mailpassword;
    private static String smtphost;
    private final String SETCHAR="gb2312";

    static {
        try {
            Properties properties = new Properties();
            properties.load(SendEmail.class.getClassLoader().getResourceAsStream("mailsina.properties"));
            port=properties.getProperty("port");
            mailfrom=properties.getProperty("mailfrom");
            mailusername=properties.getProperty("mailusername");
            mailpassword=properties.getProperty("mailpassword");
            smtphost=properties.getProperty("smtphost");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SendEmail() {
        // 设置系统属性
        props = java.lang.System.getProperties(); // 获得系统属性对象
        props.put("mail.smtp.host",smtphost); // 设置SMTP主机
        props.put("mail.smtp.port", port); // 设置服务端口号
        props.put("mail.smtp.auth", "true");// 同时通过验证
        // 获得邮件会话对象
        mailSession = Session.getDefaultInstance(props, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailusername, mailpassword);
            }
        });
    }

    public boolean sendingMimeMail(String MailTo,
                                   String MailCopyTo, String MailBCopyTo, String MailSubject,
                                   String MailBody) {
        try {
            // 创建MIME邮件对象
            mailSession.setDebug(true);
            mimeMsg = new MimeMessage(mailSession);
            // 设置发信人
            mimeMsg.setFrom(new InternetAddress(mailfrom));

            mimeMsg.setHeader(
                    "Content-Transfer-Encoding",
                    "8bit");
            // 设置收信人
            if (MailTo != null) {
                mimeMsg.setRecipients(Message.RecipientType.TO, InternetAddress
                        .parse(MailTo));
            }
            // 设置抄送人
            if (MailCopyTo != null) {
                mimeMsg.addRecipients(javax.mail.Message.RecipientType.CC,
                        InternetAddress.parse(MailCopyTo));
            }
            // 设置暗送人
            if (MailBCopyTo != null) {
                mimeMsg.setRecipients(javax.mail.Message.RecipientType.BCC,
                        InternetAddress.parse(MailBCopyTo));
            }
            // 设置邮件主题
            mimeMsg.setSubject(MailSubject, SETCHAR);
            // 设置邮件内容，将邮件body部分转化为HTML格式
            mimeMsg.setContent(MailBody, "text/html;charset="+SETCHAR);
            // 发送邮件
            Transport.send(mimeMsg);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

