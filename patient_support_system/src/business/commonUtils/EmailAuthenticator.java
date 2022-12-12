/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.commonUtils;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "ptsystem29@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "ptsystemmm@29"; 
    
           @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
                
}
