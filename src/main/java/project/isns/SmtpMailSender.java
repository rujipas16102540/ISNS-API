package project.isns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class SmtpMailSender {

    @Autowired
    private JavaMailSender javaMailSender;
    public  void send(String to,String subject, String body) throws MessagingException {
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper;
//        helper = new MimeMessageHelper(message,true);
//        message.setSubject(subject);
//        message.setTo(to);
//        helper.setText(body,true);
//        javaMailSender.send(message);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rujipas1534@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
    }
}
