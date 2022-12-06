package pt.utad.mei.aps;

import javax.mail.MessagingException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        EmailSender emailSender = new EmailSender(properties);

        try {
            emailSender.sendPlainEmail("janedoe@gmail.com", "jane123", "johndoe@gmail.com",
                    "Test", "This is a test");
            emailSender.sendHtmlEmail("johndoe@gmail.com", "john123", "janedoe@gmail.com",
                    "Test", "<h1>This is a test</h1>");
        } catch (MessagingException e) {
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}