/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author suresh
 */
public class UserEmail {

    private String to;
    private String from;
    private String host;
    private String subject;
    private String emailMessage;

    public UserEmail() {
    }

    public UserEmail(String to, String from, String host, String subject, String emailMessage) {
        this.to = to;
        this.from = from;
        this.host = host;
        this.subject = subject;
        this.emailMessage = emailMessage;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    public void sendEmail() throws MessagingException {
        Properties properties = System.getProperties();       
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        MimeMessage message=new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(emailMessage);
        Transport.send(message);

    }

}
