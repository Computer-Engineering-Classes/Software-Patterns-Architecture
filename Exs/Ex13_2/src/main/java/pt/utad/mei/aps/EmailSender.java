package pt.utad.mei.aps;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class EmailSender {
    private final Properties properties;
    private MimeMessage mimeMessage;
    private InternetAddress to;

    public EmailSender(Properties properties) {
        this.properties = properties;
    }


    public void sendPlainEmail(String from, String password, String to, String subject, String body) throws MessagingException {
        this.to = new InternetAddress(to);
        setMimeMessage(from, password, subject);
        mimeMessage.setText(body);
        send(from, password);
    }

    public void sendHtmlEmail(String from, String password, String to, String subject, String body) throws MessagingException {
        this.to = new InternetAddress(to);
        setMimeMessage(from, password, subject);
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(body, "text/html");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);
        mimeMessage.setContent(multipart);
        send(from, password);
    }

    private void setMimeMessage(String from, String password, String subject) throws MessagingException {
        mimeMessage = new MimeMessage(Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        }));
        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.setRecipient(Message.RecipientType.TO, this.to);
        mimeMessage.setSubject(subject);
    }

    private void send(String from, String password) throws MessagingException {
        Transport transport = getSession(from, password).getTransport("smtp");
        transport.connect("smtp.gmail.com", from, password);
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();
    }

    private Session getSession(String from, String password) {
        return Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
    }
}
