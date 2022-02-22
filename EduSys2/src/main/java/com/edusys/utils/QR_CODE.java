/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class QR_CODE {

    public static void createQRCode(String data) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix matrix = null;
        try {
            matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
        } catch (WriterException ex) {
            Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Write to file image
        String outputFile = ".\\logos\\uQR.png";
        Path path = FileSystems.getDefault().getPath(outputFile);
        try {
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
        } catch (IOException ex) {
            Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean sendQRCodeToUser(String Email) {
        final String username = "sendmail.fpttext@gmail.com";
        final String password = "sendmail.fpttext10";

        // Assuming you are sending email through relay.jangosmtp.net
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress("sendmail.fpttext@gmail.com"));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Email));

            // Set Subject: header field
            message.setSubject("Testing Subject");

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H1>Your QR_CODE</H1><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(
                    ".\\logos\\uQR.png");

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String data = "Ha noi mua thu";
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix matrix = null;
        try {
            matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
        } catch (WriterException ex) {
            Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Write to file image
        String outputFile = ".\\logos\\uQR.png";
        Path path = FileSystems.getDefault().getPath(outputFile);
        try {
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
        } catch (IOException ex) {
            Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Recipient's email ID needs to be mentioned.
        // Sender's email ID needs to be mentioned
        final String username = "sendmail.fpttext@gmail.com";
        final String password = "sendmail.fpttext10";

        // Assuming you are sending email through relay.jangosmtp.net
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress("sendmail.fpttext@gmail.com"));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("thanhmxph18759@fpt.edu.vn"));

            // Set Subject: header field
            message.setSubject("Testing Subject");

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(
                    ".\\logos\\uQR.png");

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
