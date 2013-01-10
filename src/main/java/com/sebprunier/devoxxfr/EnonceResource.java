package com.sebprunier.devoxxfr;

import org.apache.commons.io.IOUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Properties;

public class EnonceResource implements Resource {

    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String body = IOUtils.toString(request.getInputStream());
        System.out.println(URLDecoder.decode(body, Charset.defaultCharset().toString()));
        // sendByMail(request.getRequestURI(), body);
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println("Thanks !");
        writer.close();
    }

    /*private void sendByMail(String requestURI, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(System.getenv("SMTP_USER"), System.getenv("SMTP_PASSWORD"));
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("vast-scrubland-8307@herokuapp.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sebastien.prunier@gmail.com"));
            message.setSubject(requestURI);
            message.setText(body);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace(System.err);
        }
    }*/
}
