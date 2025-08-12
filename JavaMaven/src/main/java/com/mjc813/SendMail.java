package com.mjc813;
import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Scanner;

import static jakarta.mail.Transport.send;

public class SendMail {
    static Properties prop;
    static Session session;
    static MimeMessage message;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        generateAndSendEmail();

    }

    public static void generateAndSendEmail() throws Exception {
        final String user = sc.next();
        final String pass = sc.next();
        System.out.println(user);
        System.out.println(pass);
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.naver.com");
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.starttls.required", "true");

        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(user));
            message.setSubject("제 목 입 력");
            message.setText("내용 입력");
            Transport.send(message);
            System.out.println("message sent successfully...");
        }catch(AddressException e) {
            e.printStackTrace();
        }catch(MessagingException e) {
            e.printStackTrace();
        }
    }



}

