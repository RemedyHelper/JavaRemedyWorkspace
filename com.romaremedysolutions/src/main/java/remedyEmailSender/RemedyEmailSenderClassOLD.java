package remedyEmailSender;

/**
 * Hello world!
 * Maven Dependency: 
 	<dependency>
  		<groupId>com.sun.mail</groupId>
  		<artifactId>javax.mail</artifactId>	
 		<version>1.5.4</version>
  	</dependency>
 *
 */


import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RemedyEmailSenderClassOLD
{
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Username for Authentication: ");
//		final String username = scanner.nextLine();
		final String username = "rescuemyappliance@gmail.com";
		System.out.println("Please Enter Password : ");
		final String password = scanner.nextLine();
		
		System.out.println("From Email: ");
//		String fromEmailAddress = scanner.nextLine();
		String fromEmailAddress = "rescuemyappliance@gmail.com";
		System.out.println("To Email: ");
//		String toEmailAddress = scanner.nextLine();
		String toEmailAddress = "rescuemyappliance@gmail.com";
		System.out.println("Subject: ");
//		String subject = scanner.nextLine();
		String subject = "Email Subject";		
		System.out.println("Message: ");
//		String textMessage = scanner.nextLine();
		String textMessage = "Textmessage";
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
		}
		});
		
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmailAddress));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress));
			message.setSubject(subject);
			message.setText(textMessage);
			Transport.send(message);
			
			System.out.println("\n\r\t\tYour message has been senta!! RR");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		
	}
}