package remedyEmailSender;

import java.io.File;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class executorDELETEME {

	public static void main(String[] args) {
		
//		try {
//			Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadata.xlsx"));
//			//			Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpViperMetadata.xlsx"));
//			Sheet remedyExcelMetaDataReaderSheet = remedyExcelMetadataWB.getSheetAt(4-1);

		
		
//		final String username = remedyExcelMetaDataReaderSheet.getRow(10-1).getCell(4-1).getStringCellValue();
//		String sendersEmailAddress = remedyExcelMetaDataReaderSheet.getRow(11-1).getCell(4-1).getStringCellValue();
//		String recepientEmailAddress = remedyExcelMetaDataReaderSheet.getRow(12-1).getCell(4-1).getStringCellValue();
//		String emailSubject = remedyExcelMetaDataReaderSheet.getRow(13-1).getCell(4-1).getStringCellValue();
//		String emailBodyMessage = remedyExcelMetaDataReaderSheet.getRow(14-1).getCell(4-1).getStringCellValue();
//
//
//		String zoom = "mail.smtp.auth" + ", " + "true";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("At the end of script execution a progress summary email will be sent to"
				+ " email Please Enter Email Password so the message can be sent. RR");
		final String password = scanner.nextLine();
		
		
		RemedySimpleGmailEmailMessageSender.remedyEmailSenderMethod(password);

		
//		  } catch (Exception ex) {
//		      System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
//		  } // finish of xlsx sequence RR (4 - 4)

	}

}
