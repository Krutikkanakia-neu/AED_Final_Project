/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.commonUtils;


import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.smtp.SMTPTransport;


public class SendEmailAndTextMessage {
 
    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; 
    private static final String SMTP_PORT_NUMBER = "465"; 
     private static StringBuilder emailMsgTxt ;
        
        private static String emailSubjectTxt = "Thank you!";
        private static String emailFromAddress = "ptsystem29@gmail.com";
    

    public static String generatePassword(String name)
    {
        try
        {
      Random random = new Random();
      // String value = String.valueOf(random.nextInt(10000));
      // String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
//        sb.append(value1);
        sb.append(name);
//        sb.append(value);
        System.out.println(">>>>password>>>>>"+sb.toString());
         return sb.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateUserName(String name)
    {
        try
        {
//      Random random = new Random();
//      String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
//        sb.append(value1);
        sb.append(name);
        System.out.println(">>>>username>>>>"+sb.toString());
         return sb.toString();
    }
     catch(Exception e)
        {
          e.printStackTrace();
        }
        return null;
    }
      

 // Send Email                   
    
    public static boolean sendEmail(String msg, String emailId, String userName, String password)
    {
      boolean isSent = true;
 
    try {
//     Properties props = new Properties();
//        props.put("mail.smtp.host", SMTP_HOST_NAME);                                                        
//        props.put("mail.smtp.auth", "true");  
//        props.put("mail.smtp.starttls.enable","true");
//        props.put("mail.user", "ptsystem29@gmail.com");
//	props.put("mail.password", "ptsystemmm@29");
//        props.put("mail.smtp.port", "587");
//        
        String fromEmail = "ptsystem29@gmail.com";
        String pass = "uzhkwtyqrxfnemun";

        Properties properties = System.getProperties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        //properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.user", fromEmail);
//        properties.put("mail.smtp.password", pass);
        
        //create Authenticator object to pass in Session.getInstance argument
	Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, pass);
			}
	};
        Session session = Session.getInstance(properties, auth);
        //Start our mail message
        Message message = new MimeMessage(session);
        
        //Authenticator mailAuthenticator = new EmailAuthenticator();
        //Session mailSession = Session.getDefaultInstance(props,mailAuthenticator);
        //Message message = new MimeMessage(mailSession);
//         InternetAddress fromAddress ;
//        InternetAddress toAddress;
//        try
//           {
//         fromAddress = new InternetAddress(emailFromAddress);
//         toAddress = new InternetAddress(emailId);
//         }
//        
//        catch (AddressException ae) {
//            ae.printStackTrace();
//         isSent= false;
//         return isSent;
//         }
        
        
        message.setFrom(new InternetAddress(emailFromAddress));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(emailId));
        message.setSubject(emailSubjectTxt);
        message.setText(msg);
 
//       Transport.send(message);
        Transport trans = session.getTransport("smtp");
        trans.connect("smtp.gmail.com", 587, "ptsystem29@gmail.com", "uzhkwtyqrxfnemun");
        trans.sendMessage(message, message.getAllRecipients());
       System.out.println("Email Sent !");
        } 
         catch (MessagingException mex) {
             mex.printStackTrace();
            isSent=false;
            return isSent;
       }
       
       catch (Exception e) {
            isSent=false;
       }

         return isSent;
     
    }
    
   
}