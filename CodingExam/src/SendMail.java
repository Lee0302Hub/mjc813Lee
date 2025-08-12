import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Console;
import java.util.Properties;
import java.util.Scanner;

import static javax.mail.Transport.send;

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
