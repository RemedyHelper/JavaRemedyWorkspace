package signUpValidatorMaserati;

/**
 * Information about this Class below:
 * This Class is depended on the included Excel Metadata file RemedySignUpMetadata.xlsx
 * 
 * 
 * Maven Dependency: 
 	<dependency>
  		<groupId>com.sun.mail</groupId>
  		<artifactId>javax.mail</artifactId>	
 		<version>1.5.4</version>
  	</dependency>
 *
 *
 *  	   	 <dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
	<version>3.12-beta1</version>
	</dependency>
	
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>3.12-beta1</version>
	</dependency>

 *
 *
 *
 *
 *
 * - Email Sender Verifys that Email and Password match otherwise throw catches Aug16 RR
 *
 */


import java.io.File;
import java.util.Properties;
import java.util.Scanner;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BetaRemedySimpleGmailEmailMessageSenderSep10
{

		public static void remedyEmailSenderMethod(final String summaryEmailPassword, String scriptExecutionSummary) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		

		try {
			Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			Sheet remedyExcelMetaDataCoverSheet = remedyExcelMetadataWB.getSheetAt(1-1);
		
		

			final String username = remedyExcelMetaDataCoverSheet.getRow(19-1).getCell(7-1).getStringCellValue();
			String sendersEmailAddress = remedyExcelMetaDataCoverSheet.getRow(20-1).getCell(7-1).getStringCellValue();
			String recepientEmailAddress = remedyExcelMetaDataCoverSheet.getRow(21-1).getCell(7-1).getStringCellValue();
			String emailSubject = remedyExcelMetaDataCoverSheet.getRow(22-1).getCell(7-1).getStringCellValue();

		
		
		System.out.println("Email that will be used to send the message: " + username);
		System.out.println("Email sender will be RR : " + sendersEmailAddress);
		System.out.println("Email Receiver will be RR : " + recepientEmailAddress);
		System.out.println("The following subject will be used RR : " + emailSubject);
		System.out.println("The following message will be emailed RR : " + scriptExecutionSummary);
		
		
		
			try {
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override	
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, summaryEmailPassword);
					}
			});
		
				try {
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(sendersEmailAddress));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recepientEmailAddress));
					message.setSubject(emailSubject);
					message.setText(scriptExecutionSummary);
					
					System.out.println("Old email stuff are above this!!!!");
					System.out.println("Old email stuff are above this!!!!");
					System.out.println("Old email stuff are above this!!!!");
					System.out.println("Old email stuff are above this!!!!");
					///// code below used to attached files to email sep10 RR
					MimeBodyPart remedyGmailSenderAttachment = new MimeBodyPart();
					
					Multipart multipart = new MimeMultipart();
					
					DataSource actualFileToBeSentThroughremedyGmailSenderAttachment = new FileDataSource("RemedyTestResults/HiddenParticle.txt");
					remedyGmailSenderAttachment.setDataHandler(new DataHandler(actualFileToBeSentThroughremedyGmailSenderAttachment));
					remedyGmailSenderAttachment.setFileName("HiddenParticle.txt");
					
					message.setContent(multipart);
					
					// ////////code above used to attached files to email spe10 RR 
					System.out.println("Old email stuff are below this!!!!");
					System.out.println("Old email stuff are below this!!!!");
					System.out.println("Old email stuff are below this!!!!");
					System.out.println("Old email stuff are below this!!!!");
					Transport.send(message);
			
					System.out.println("\n\r\t\tSuccess! - Your Email message has been sent RR:)");
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
		
			} catch (Exception e) {
				System.out.println("Failure - Password or username do not match and or No internet connection RR:(");
			}
		
		} catch (Exception ex) {
		      System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
		  } // finish of xlsx sequence RR (4 - 4)

		
		
	}
}