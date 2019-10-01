package com.practice.random;

import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
class Mailer{  
    public static void send(String from,String password,String to,String sub,String msg){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.mailendo.com");    
		
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.fallback", "true");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

          //get Session   
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

          //Session session = Session.getInstance(props,null);
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.setFrom(new InternetAddress("boyiw@4nextmail.com"));  
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  
public class SendEmail{    
 public static void main(String[] args) {    
     //from,password,to,subject,message  
     Mailer.send("yemlacukka@yevme.com","Welcome@01","pranaytheglazingfire@gmail.com","hello javatpoint","How r u?");  
     //change from, password and to  
 }    
}    